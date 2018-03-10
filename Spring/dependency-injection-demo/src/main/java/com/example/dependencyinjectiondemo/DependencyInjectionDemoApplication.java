package com.example.dependencyinjectiondemo;

import com.example.dependencyinjectiondemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		MyController controller = ( MyController ) context.getBean( "myController" );
		controller.hello();

	}
}
