package com.weatherapp.application.WeatherApp.model;

public class WeatherResponse {
    private Request request;
    private Location location;
    private Current current;


    public Request getRequest(){
        return new Request();
    }
    public void setRequest(Request request){
        this.request = request;
    }

    public Location getLocation(){
        return new Location();
    }
    public void setLocation(Location location){
        this.location = location;
    }

    public Current getCurrent(){
        return new Current();
    }
    public void setCurrent(Current current){
        this.current = current;
    }


    static class Request {
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

    static class Location {
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

    static class Current {
        private String observation_time;
        private String temperature;
        private String weather_code;
        private String weather_icons;
        private String weather_descriptions;
        private String wind_speed;
        private String wind_degree;
        private String wind_dir;
        private String pressure;
        private String precip;
        private String humidity;
        private String cloudcover;
        private String feelslike;
        private String visibility;

        public String getObservation_time() {
            return observation_time;
        }

        public void setObservation_time(String observation_time) {
            this.observation_time = observation_time;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getWeather_code() {
            return weather_code;
        }

        public void setWeather_code(String weather_code) {
            this.weather_code = weather_code;
        }

        public String getWeather_icons() {
            return weather_icons;
        }

        public void setWeather_icons(String weather_icons) {
            this.weather_icons = weather_icons;
        }

        public String getWeather_descriptions() {
            return weather_descriptions;
        }

        public void setWeather_descriptions(String weather_descriptions) {
            this.weather_descriptions = weather_descriptions;
        }

        public String getWind_speed() {
            return wind_speed;
        }

        public void setWind_speed(String wind_speed) {
            this.wind_speed = wind_speed;
        }

        public String getWind_degree() {
            return wind_degree;
        }

        public void setWind_degree(String wind_degree) {
            this.wind_degree = wind_degree;
        }

        public String getWind_dir() {
            return wind_dir;
        }

        public void setWind_dir(String wind_dir) {
            this.wind_dir = wind_dir;
        }

        public String getPressure() {
            return pressure;
        }

        public void setPressure(String pressure) {
            this.pressure = pressure;
        }

        public String getPrecip() {
            return precip;
        }

        public void setPrecip(String precip) {
            this.precip = precip;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getCloudcover() {
            return cloudcover;
        }

        public void setCloudcover(String cloudcover) {
            this.cloudcover = cloudcover;
        }

        public String getFeelslike() {
            return feelslike;
        }

        public void setFeelslike(String feelslike) {
            this.feelslike = feelslike;
        }

        public String getVisibility() {
            return visibility;
        }

        public void setVisibility(String visibility) {
            this.visibility = visibility;
        }
    }
}
