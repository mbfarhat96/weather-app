package com.weatherapp.application.WeatherApp.controller;


import com.weatherapp.application.WeatherApp.model.WeatherResponse;
import com.weatherapp.application.WeatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.Map;


@RestController
public class WeatherController {

    //This is considered a dependency injection, since we'll be reusing this service. We shouldn't be initializing an
    //object everytime as we were in the controller method below.
    @Autowired
    private WeatherService service;

    //Get Method
    //@GetMapping("/weather")  <--- This maps our getWeather() method to HTTP GET requests.
    //This is also an endpoint for our GET method.
    @GetMapping("/weather")
    public Map<String, String> getWeather(@RequestParam String city){

        Map<String,String> response = service.getWeather(city);
        return response;
    }
}
