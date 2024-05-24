package com.weatherapp.application.WeatherApp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {
    private String api_url = "http://api.weatherstack.com/current?access_key={key}&query={city}";
    private String api_key = "030f86f222b003ec84a60d5a2901b1c5";


    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/weather")
    public String getMapping(@RequestParam String city){
        String url = api_url.replace("{key}",api_key).replace("{city}",city);
        return restTemplate.getForEntity(url,String.class).toString();
    }
}
