package com.example.GreetingApplication.controller;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreetingMessage(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello " + firstName + " " + lastName + "!";
        } else if (firstName != null) {
            return "Hello " + firstName + "!";
        } else if (lastName != null) {
            return "Hello Mr./Ms. " + lastName + "!";
        } else {
            return "Hello World!";
        }
    }
}
