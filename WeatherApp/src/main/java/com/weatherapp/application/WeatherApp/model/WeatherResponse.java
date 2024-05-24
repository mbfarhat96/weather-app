package com.weatherapp.application.WeatherApp.model;

import java.util.List;

public class WeatherResponse {
    private Request request;
    private Location location;
    private Current current;


    public Request getRequest(){
        return request;
    }
    public void setRequest(Request request){
        this.request = request;
    }

    public Location getLocation(){
        return location;
    }
    public void setLocation(Location location){
        this.location = location;
    }

    public Current getCurrent(){
        return current;
    }
    public void setCurrent(Current current){
        this.current = current;
    }


    public static class Request {
        private String type;
        private String query;
        private String language;
        private String unit;

        public void setType(String type){
            this.type = type;
        }
        public String getType(){
            return type;
        }


        public String getQuery() {
            return query;
        }
        public void setQuery(String query) {
            this.query = query;
        }


        public String getLanguage() {
            return language;
        }
        public void setLanguage(String language) {
            this.language = language;
        }


        public String getUnit() {
            return unit;
        }
        public void setUnit(String unit) {
            this.unit = unit;
        }

    }

    public static class Location {
        private String name;
        private String country;
        private String region;
        private String lat;
        private String lon;
        private String timezone_id;
        private String localtime;
        private String localtime_epoch;
        private String utc_offset;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }

        public String getRegion() {
            return region;
        }
        public void setRegion(String region) {
            this.region = region;
        }

        public String getLat() {
            return lat;
        }
        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }
        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getTimezone_id() {
            return timezone_id;
        }
        public void setTimezone_id(String timezone_id) {
            this.timezone_id = timezone_id;
        }

        public String getLocaltime() {
            return localtime;
        }
        public void setLocaltime(String localtime) {
            this.localtime = localtime;
        }

        public String getLocaltime_epoch() {
            return localtime_epoch;
        }
        public void setLocaltime_epoch(String localtime_epoch) {
            this.localtime_epoch = localtime_epoch;
        }

        public String getUtc_offset() {
            return utc_offset;
        }
        public void setUtc_offset(String utc_offset) {
            this.utc_offset = utc_offset;
        }
    }

    public static class Current {
        private String observation_time;
        private int temperature;
        private int weather_code;
        private List<String> weather_icons;
        private List<String> weather_descriptions;
        private int wind_speed;
        private int wind_degree;
        private String wind_dir;
        private int pressure;
        private int precip;
        private int humidity;
        private int cloudcover;
        private int feelslike;
        private int uv_index;
        private int visibility;
        private String is_day;

        public String getObservation_time() {
            return observation_time;
        }
        public void setObservation_time(String observation_time) {
            this.observation_time = observation_time;
        }

        public int getTemperature() {
            return temperature;
        }
        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        public int getWeather_code() {
            return weather_code;
        }
        public void setWeather_code(int weather_code) {
            this.weather_code = weather_code;
        }

        public List<String> getWeather_icons() {
            return weather_icons;
        }
        public void setWeather_icons(List<String> weather_icons) {
            this.weather_icons = weather_icons;
        }

        public List<String> getWeather_descriptions() {
            return weather_descriptions;
        }
        public void setWeather_descriptions(List<String> weather_descriptions) {
            this.weather_descriptions = weather_descriptions;
        }

        public int getWind_speed() {
            return wind_speed;
        }
        public void setWind_speed(int wind_speed) {
            this.wind_speed = wind_speed;
        }

        public int getWind_degree() {
            return wind_degree;
        }
        public void setWind_degree(int wind_degree) {
            this.wind_degree = wind_degree;
        }

        public String getWind_dir() {
            return wind_dir;
        }
        public void setWind_dir(String wind_dir) {
            this.wind_dir = wind_dir;
        }

        public int getPressure() {
            return pressure;
        }
        public void setPressure(int pressure) {
            this.pressure = pressure;
        }

        public int getPrecip() {
            return precip;
        }
        public void setPrecip(int precip) {
            this.precip = precip;
        }

        public int getHumidity() {
            return humidity;
        }
        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public int getCloudcover() {
            return cloudcover;
        }
        public void setCloudcover(int cloudcover) {
            this.cloudcover = cloudcover;
        }

        public int getFeelslike() {
            return feelslike;
        }
        public void setFeelslike(int feelslike) {
            this.feelslike = feelslike;
        }

        public int getVisibility() {
            return visibility;
        }
        public void setVisibility(int visibility) {
            this.visibility = visibility;
        }

        public int getUv_index() {
            return uv_index;
        }
        public void setUv_index(int uv_index) {
            this.uv_index = uv_index;
        }

        public String getIs_day() {
            return is_day;
        }
        public void setIs_day(String is_day) {
            this.is_day = is_day;
        }


    }
}
