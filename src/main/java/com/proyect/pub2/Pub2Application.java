package com.proyect.pub2;

import com.proyect.pub2.controller.DrinkController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@SpringBootApplication
public class Pub2Application {

	public static void main(String[] args) {
		SpringApplication.run(Pub2Application.class, args);
	}

}
