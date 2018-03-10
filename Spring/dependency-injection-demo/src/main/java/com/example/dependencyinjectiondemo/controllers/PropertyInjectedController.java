package com.example.dependencyinjectiondemo.controllers;

import com.example.dependencyinjectiondemo.services.GreetingService;
import com.example.dependencyinjectiondemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService .sayGreeting();
    }

}
