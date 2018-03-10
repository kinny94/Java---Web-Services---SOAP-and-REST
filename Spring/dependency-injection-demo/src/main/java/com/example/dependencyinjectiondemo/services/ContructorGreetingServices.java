package com.example.dependencyinjectiondemo.services;

public class ContructorGreetingServices implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello!! - I was injected via the constructor!!";
    }
}
