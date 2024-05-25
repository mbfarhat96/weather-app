package com.weatherapp.application.WeatherApp.controller;


import com.weatherapp.application.WeatherApp.model.ShortWeatherResponse;
import com.weatherapp.application.WeatherApp.model.WeatherResponse;
import com.weatherapp.application.WeatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

    @Autowired
    public RestTemplate restTemplate;

    //Get Method
    //@GetMapping("/weather")  <--- This maps our getWeather() method to HTTP GET requests.
    //This is also an endpoint for our GET method.
    @GetMapping("/weather")
    public WeatherResponse getWeather(@RequestParam String city){
        WeatherService service =  new WeatherService();
        WeatherResponse response = service.getWeather(city);
        return response;
    }
}
