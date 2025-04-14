package com.ironhack.springBootApp.controller;

import com.ironhack.springBootApp.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String getTime() {
        return "Current Time: " + timeService.getCurrentTime().toString();
    }

    @GetMapping("/date")
    public String getDate() {
        return "Current Date: " + timeService.getCurrentDate().toString();
    }

    @GetMapping("/day")
    public String getDayOfWeek() {
        return "Today is: " + timeService.getCurrentDayOfWeek().toString();
    }

    @GetMapping("/all")
    public Map<String, String> getAllTimeInfo() {
        Map<String, String> timeInfo = new HashMap<>();
        timeInfo.put("time", timeService.getCurrentTime().toString());
        timeInfo.put("date", timeService.getCurrentDate().toString());
        timeInfo.put("dayOfWeek", timeService.getCurrentDayOfWeek().toString());
        return timeInfo;
    }
}
