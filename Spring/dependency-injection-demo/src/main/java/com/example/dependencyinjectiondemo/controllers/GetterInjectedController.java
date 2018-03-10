package com.example.dependencyinjectiondemo.controllers;

import com.example.dependencyinjectiondemo.services.GreetingService;
import com.example.dependencyinjectiondemo.services.GreetingServiceImpl;

public class GetterInjectedController {

    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService ){
        this.greetingService = greetingService;
    }
}
