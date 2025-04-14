package com.ironhack.springBootApp.controller;

import com.ironhack.springBootApp.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("weather")
public class WeatherController {
    private final WeatherService weatherService;

    // Constructor injection
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/temperature")
    public int getCurrentTemperature() {
        return weatherService.getCurrentTemperature();
    }

    @GetMapping("/condition")
    public String getWeatherCondition() {
        return weatherService.getWeatherCondition();
    }

    @GetMapping("/wind")
    public int getWindSpeed() {
        return weatherService.getWindSpeed();
    }

    @GetMapping("/all")
    public Map<String, Object> getAllWeatherInfo() {
        Map<String, Object> weatherInfo = new HashMap<>();
        weatherInfo.put("temperature", weatherService.getCurrentTemperature());
        weatherInfo.put("condition", weatherService.getWeatherCondition());
        weatherInfo.put("windSpeed", weatherService.getWindSpeed());
        return weatherInfo;
}
}
