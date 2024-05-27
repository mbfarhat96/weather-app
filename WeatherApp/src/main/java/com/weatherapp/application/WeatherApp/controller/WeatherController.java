package com.weatherapp.application.WeatherApp.controller;

import com.weatherapp.application.WeatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;


@Controller
public class WeatherController {

    //This is considered a dependency injection, since we'll be reusing this service. We shouldn't be initializing an
    //object everytime as we were in the controller method below.
    @Autowired
    private WeatherService service;

    //Get Method
    //@GetMapping("/weather")  <--- This maps our getWeather() method to HTTP GET requests.
    //This is also an endpoint for our GET method.
    @GetMapping("/weather")
    public String getWeather(@RequestParam String city, Model model){
        Map<String,String> response = service.getWeather(city);
        model.addAllAttributes(response);
        return "home";
    }
}
