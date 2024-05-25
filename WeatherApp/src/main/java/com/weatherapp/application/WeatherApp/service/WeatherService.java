package com.weatherapp.application.WeatherApp.service;

import com.weatherapp.application.WeatherApp.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private final String API_URL = "http://api.weatherstack.com/current?access_key={key}&query={city}";
    private final String API_KEY = "030f86f222b003ec84a60d5a2901b1c5";

    @Autowired
    private final RestTemplate restTemplate = new RestTemplate();


    public WeatherResponse getWeather(String city){
        String url = API_URL.replace("{key}",API_KEY).replace("{city}",city);
        ResponseEntity<WeatherResponse> response = restTemplate.getForEntity(url,WeatherResponse.class);
        return response.getBody();
    }

}
