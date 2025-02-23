package com.example.GreetingApplication.repository;

import com.example.GreetingApplication.model.Greeting;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class GreetingRepository {

    private Map<Long, Greeting> greetingMap = new HashMap<>();
    private long idCounter = 1;

    public Greeting save(Greeting greeting) {
        greeting.setId(idCounter++);
        greetingMap.put(greeting.getId(), greeting);
        return greeting;
    }
}

