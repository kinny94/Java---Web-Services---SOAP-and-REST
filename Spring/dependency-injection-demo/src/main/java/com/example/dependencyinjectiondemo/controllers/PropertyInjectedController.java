package com.example.dependencyinjectiondemo.controllers;

import com.example.dependencyinjectiondemo.services.GreetingService;
import com.example.dependencyinjectiondemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService .sayGreeting();
    }

}
