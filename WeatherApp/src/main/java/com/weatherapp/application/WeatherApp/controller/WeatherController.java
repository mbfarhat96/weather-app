package com.weatherapp.application.WeatherApp.controller;


import com.weatherapp.application.WeatherApp.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {
    private final String API_URL = "http://api.weatherstack.com/current?access_key={key}&query={city}";
    private final String API_KEY = "030f86f222b003ec84a60d5a2901b1c5";


    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/weather")
    public WeatherResponse getMapping(@RequestParam String city){
        String url = API_URL.replace("{key}",API_KEY).replace("{city}",city);
        ResponseEntity<WeatherResponse> response = restTemplate.getForEntity(url, WeatherResponse.class);
        return response.getBody();
    }
}
