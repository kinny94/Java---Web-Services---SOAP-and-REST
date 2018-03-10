package com.example.dependencyinjectiondemo;

import com.example.dependencyinjectiondemo.controllers.GetterInjectedController;
import com.example.dependencyinjectiondemo.controllers.MyController;
import com.example.dependencyinjectiondemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.dependencyinjectiondemo.controllers.ContructorInjectedController;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		MyController controller = ( MyController ) context.getBean( "myController" );
		controller.hello();

		System.out.println( context.getBean( PropertyInjectedController.class ).sayHello());
        System.out.println( context.getBean( ContructorInjectedController.class ).sayHello());
        System.out.println( context.getBean( GetterInjectedController.class ).sayHello());

	}
}
