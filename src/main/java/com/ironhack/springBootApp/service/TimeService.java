package com.ironhack.springBootApp.service;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class TimeService {
    public LocalTime getCurrentTime() {
        return LocalTime.now();
    }

    // Get current date
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    // Get current day of the week
    public DayOfWeek getCurrentDayOfWeek() {
        return LocalDate.now().getDayOfWeek();
    }
}
