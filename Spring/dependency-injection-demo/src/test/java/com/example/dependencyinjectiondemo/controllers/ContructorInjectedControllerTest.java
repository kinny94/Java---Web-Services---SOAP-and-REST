package com.example.dependencyinjectiondemo.controllers;

import com.example.dependencyinjectiondemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ContructorInjectedControllerTest {

    private ContructorInjectedController contructorInjectedController;

    @Before
    public void setUp() throws Exception{
        this.contructorInjectedController = new ContructorInjectedController( new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals( GreetingServiceImpl.HELLO_GURUS, contructorInjectedController.sayHello());
    }
}

