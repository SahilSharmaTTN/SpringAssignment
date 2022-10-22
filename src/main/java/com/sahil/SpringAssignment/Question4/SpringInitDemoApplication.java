package com.sahil.SpringAssignment.Question4;

import com.sahil.SpringAssignment.Question5.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInitDemoApplication {

	public static void main(String[] args) {



		ApplicationContext  applicationContext = SpringApplication.run(SpringInitDemoApplication.class, args);

		Users users = applicationContext.getBean(Users.class);

		System.out.println(users);

//
//		users.getAge();
//		users.getCompetency();
//		users.getName();



	}

}
