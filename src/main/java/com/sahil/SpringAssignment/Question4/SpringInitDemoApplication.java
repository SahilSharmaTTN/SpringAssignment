package com.sahil.SpringAssignment.Question4;

import com.sahil.SpringAssignment.Question5.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.awt.desktop.UserSessionEvent;

@SpringBootApplication
public class SpringInitDemoApplication {

	public static void main(String[] args) {

		ApplicationContext  applicationContext = SpringApplication.run(SpringInitDemoApplication.class, args);

		UserService userService = applicationContext.getBean(UserService.class);

		Users users= new Users(1,"Sahil","JVM",23);

		userService.displayDetails(users);

	}

}
