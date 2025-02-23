package com.example.GreetingApplication.controller;

import com.example.GreetingApplication.model.Greeting;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;


    @GetMapping
    public String getGreeting(@RequestParam(required = false) String firstName,
                              @RequestParam(required = false) String lastName) {
        return "{\"message\": \"" + greetingService.getGreetingMessage(firstName, lastName) + "\"}";
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


    @PostMapping("/save")
    public Greeting saveGreeting(@RequestBody String message) {
        return greetingService.saveGreeting(message);
    }

    @GetMapping("/{id}")
    public Optional<Greeting> getGreetingById(@PathVariable Long id) {
        return greetingService.findGreetingById(id);
    }
}
