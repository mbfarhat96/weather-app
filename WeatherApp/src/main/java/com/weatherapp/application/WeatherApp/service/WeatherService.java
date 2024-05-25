package com.weatherapp.application.WeatherApp.service;

import com.weatherapp.application.WeatherApp.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class WeatherService {
    //Dependency injections from application.properties.
    @Value("${weather.api.url}")
    private  String API_URL;

    @Value("${weather.api.key}")
    private String API_KEY;

    @Autowired
    private RestTemplate restTemplate;

    //Actual call to service being made
    public Map<String, String> getWeather(String city){
        String url = API_URL.replace("{key}",API_KEY).replace("{city}",city);
        ResponseEntity<WeatherResponse> response = restTemplate.getForEntity(url,WeatherResponse.class);

        return transformResponse(response.getBody());


    }
    //Transforming the response to the data only we need.
    public Map<String,String> transformResponse(WeatherResponse response){
        String cityName = response.getLocation().getName();
        String localTime = response.getLocation().getLocaltime();
        String temperature = Integer.toString(response.getCurrent().getTemperature());
        Map<String,String> map = new HashMap<>();
        map.put("city",cityName);
        map.put("time",localTime);
        map.put("temperature",temperature);
        return map;
    }

}
