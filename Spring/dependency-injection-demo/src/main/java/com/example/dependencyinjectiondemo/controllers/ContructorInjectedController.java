package com.example.dependencyinjectiondemo.controllers;

import com.example.dependencyinjectiondemo.services.GreetingService;
import com.example.dependencyinjectiondemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ContructorInjectedController {

    private GreetingService greetingService;

    @Autowired
    public ContructorInjectedController( GreetingServiceImpl greetingService ){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
