package com.example.GreetingApplication.model;

public class Greeting {

    private Long id;
    private String message;

    public Greeting() {}

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


