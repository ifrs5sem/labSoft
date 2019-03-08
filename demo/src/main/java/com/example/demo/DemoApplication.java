package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}
	public static void main(String[] args) {
		  ConfigurableApplicationContext appContext = SpringApplication.run(DemoApplication.class, args);
		  System.out.println(appContext.getBean("minhaConfiguracaoApp").toString());
		}
}


