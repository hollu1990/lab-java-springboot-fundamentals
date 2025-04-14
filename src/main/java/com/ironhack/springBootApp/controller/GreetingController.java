package com.ironhack.springBootApp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    // Endpoint: /hello/{name}
    @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    // Endpoint: /add/{num1}/{num2}
    @RequestMapping("/add/{num1}/{num2}")
    public String add(@PathVariable int num1, @PathVariable int num2) {
        int sum = num1 + num2;
        return "Sum: " + sum;
    }

    // Endpoint: /multiply/{num1}/{num2}
    @RequestMapping("/multiply/{num1}/{num2}")
    public String multiply(@PathVariable int num1, @PathVariable int num2) {
        int product = num1 * num2;
        return "Product: " + product;
    }
}
