package com.example.dependencyinjectiondemo.controllers;

import com.example.dependencyinjectiondemo.services.GreetingService;
import com.example.dependencyinjectiondemo.services.GreetingServiceImpl;

public class ContructorInjectedController {

    private GreetingService greetingService;

    public ContructorInjectedController( GreetingServiceImpl greetingService ){
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }

}
