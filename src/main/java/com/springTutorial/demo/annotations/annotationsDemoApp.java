package com.springTutorial.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationsDemoApp {

    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");

        //get bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //call bean methods
        System.out.println(theCoach.getDailyWorkout());
        //close container
        context.close();
    }
}
