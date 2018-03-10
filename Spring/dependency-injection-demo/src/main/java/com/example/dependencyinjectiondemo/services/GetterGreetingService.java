package com.example.dependencyinjectiondemo.services;

public class GetterGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
