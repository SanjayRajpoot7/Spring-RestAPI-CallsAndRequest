package com.example.GreetingApplication.controller;

import org.springframework.stereotype.Service;
import com.example.GreetingApplication.model.Greeting;
import com.example.GreetingApplication.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
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


//    public Optional<Greeting> getGreetingById(Long id) {
//        return greetingRepository.findById(id);
//    }

    public Optional<Greeting> findGreetingById(Long id) {
        return greetingRepository.findById(id);
    }
}
