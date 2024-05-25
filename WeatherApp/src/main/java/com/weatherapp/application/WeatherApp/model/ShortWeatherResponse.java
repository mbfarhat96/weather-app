package com.weatherapp.application.WeatherApp.model;

public class ShortWeatherResponse {
    private Request request;
    private Current current;

    public Request getRequest(){
        return request;
    }
    public void setRequest(Request request){
        this.request = request;
    }

    public Current getCurrent(){
        return current;
    }
    public void setCurrent(Current current){
        this.current = current;
    }

    public static class Request {
        private String query;

        public String getQuery(){
            return query;
        }
        public void setQuery(String name){
            this.query = name;
        }
    }

    public static class Current {
        private int temperature;

        public int getTemperature(){
            return temperature;
        }
        public void setTemperature(int temperature){
            this.temperature = temperature;
        }
    }


}
