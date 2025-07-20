package com.example.weather.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;

import java.util.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class WeatherController {

    @Value("${weather.api.key}")
    private String apiKey;

    @GetMapping("/weather")
    public ResponseEntity<Map<String, Object>> getWeather(@RequestParam String city) {
        try {
            String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + ",IN&appid=" + apiKey + "&units=metric";

            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

            if (response.getStatusCode() == HttpStatus.OK) {
                JSONObject json = new JSONObject(response.getBody());

                Map<String, Object> result = new HashMap<>();
                result.put("name", json.getString("name"));

                JSONObject main = json.getJSONObject("main");
                Map<String, Object> mainMap = new HashMap<>();
                mainMap.put("temp", main.getDouble("temp"));
                mainMap.put("feels_like", main.getDouble("feels_like"));
                mainMap.put("humidity", main.getInt("humidity"));

                result.put("main", mainMap);
                result.put("weather", json.getJSONArray("weather").toList());

                return ResponseEntity.ok(result);
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body(Map.of("error", "Invalid response from API"));
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("error", "City not found or API error"));
        }
    }
}
