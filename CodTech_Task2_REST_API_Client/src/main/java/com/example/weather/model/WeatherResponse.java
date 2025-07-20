package com.example.weather.model;

public class WeatherResponse {
    private String city;
    private String temperature;
    private String humidity;
    private String description;

    // Getters and Setters
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getTemperature() { return temperature; }
    public void setTemperature(String temperature) { this.temperature = temperature; }

    public String getHumidity() { return humidity; }
    public void setHumidity(String humidity) { this.humidity = humidity; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
