package com.spacedesk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to SpaceDesk API";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
