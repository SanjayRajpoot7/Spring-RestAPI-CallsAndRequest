package com.example.GreetingApplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    // GET request to return a simple JSON greeting message
    @GetMapping
    public String getGreeting() {
        return "{\"message\": \"Hello World\"}";
    }

    // POST request to accept and return a simple JSON greeting message
    @PostMapping
    public String postGreeting(@RequestBody String message) {
        return "{\"message\": \"" + message + "\"}";
    }

    // PUT request to update a greeting message
    @PutMapping
    public String putGreeting(@RequestBody String message) {
        return "{\"message\": \"Updated: " + message + "\"}";
    }

    // DELETE request to delete a greeting message
    @DeleteMapping
    public String deleteGreeting() {
        return "{\"message\": \"Greeting deleted\"}";
    }
}
