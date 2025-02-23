package com.example.GreetingApplication.repository;

import com.example.GreetingApplication.model.Greeting;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class GreetingRepository {

//        @Autowired
//        private GreetingRepository greetingRepository;

    private Map<Long, Greeting> greetingMap = new HashMap<>();
    private long idCounter = 1;

    public Greeting save(Greeting greeting) {
        greeting.setId(idCounter++);
        greetingMap.put(greeting.getId(), greeting);
        return greeting;
    }

    public Optional<Greeting> findById(Long id) {
        return Optional.ofNullable(greetingMap.get(id));
    }
}

