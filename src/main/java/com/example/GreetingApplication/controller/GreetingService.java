package com.example.GreetingApplication.controller;

import org.springframework.stereotype.Service;
import com.example.GreetingApplication.model.Greeting;
import com.example.GreetingApplication.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

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

    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting();
        greeting.setMessage(message);
        return greetingRepository.save(greeting);
    }


    public Optional<Greeting> findGreetingById(Long id) {
        return greetingRepository.findById(id);
    }

    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    public Greeting updateGreeting(Long id, String newMessage) {
        // Find the existing greeting by ID
        Optional<Greeting> existingGreeting = greetingRepository.findById(id);

        if (existingGreeting != null) {
            // Update the greeting's message
            existingGreeting.setMessage(newMessage);
            return greetingRepository.save(existingGreeting);  // Save the updated greeting
        } else {
            throw new RuntimeException("Greeting with ID " + id + " not found.");
        }
    }

    public void deleteGreeting(Greeting id) {
        Optional<Greeting> existingGreeting = greetingRepository.findById(id);

        if (existingGreeting != null) {
            greetingRepository.delete(id);  // Delete the greeting by ID
        } else {
            throw new RuntimeException("Greeting with ID " + id + " not found.");
        }
    }

}
