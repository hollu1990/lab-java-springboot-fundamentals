package com.ironhack.springBootApp.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WeatherService {

    private final Random random = new Random();

    // Method to get current temperature (random between -10 and 40)
    public int getCurrentTemperature() {
        return random.nextInt(51) - 10;  // Generates a number between -10 and 40
    }

    // Method to get weather condition (random from list)
    public String getWeatherCondition() {
        String[] conditions = {"Sunny", "Rainy", "Cloudy", "Windy"};
        int index = random.nextInt(conditions.length);
        return conditions[index];
    }

    // Method to get wind speed (random between 0 and 100)
    public int getWindSpeed() {
        return random.nextInt(101);  // Generates a number between 0 and 100
    }
}
