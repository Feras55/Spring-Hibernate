package com.springTutorial.demo.sec7ToSec10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationsDemoApp {

    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");

        //get bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //call bean methods
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getFortune());

        //close container
        context.close();
    }
}
