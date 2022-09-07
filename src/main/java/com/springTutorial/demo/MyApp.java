package com.springTutorial.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MyApp {

	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);

		// create the object
		Coach theCoach = new TrackCoach();

		//use the object

		System.out.println(theCoach.getDailyWorkout());

	}

}
