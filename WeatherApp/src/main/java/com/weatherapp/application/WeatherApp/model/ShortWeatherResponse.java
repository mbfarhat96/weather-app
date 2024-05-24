package com.weatherapp.application.WeatherApp.model;

public class ShortWeatherResponse {
    private String name;
    private int temperature;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getTemperature(){
        return temperature;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
}
