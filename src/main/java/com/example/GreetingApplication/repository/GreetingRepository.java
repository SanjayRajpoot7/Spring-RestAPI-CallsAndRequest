package com.example.GreetingApplication.repository;

import com.example.GreetingApplication.model.Greeting;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}



