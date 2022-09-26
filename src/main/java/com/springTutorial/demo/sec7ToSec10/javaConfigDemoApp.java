package com.springTutorial.demo.sec7ToSec10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class javaConfigDemoApp {

    public static void main(String[] args) {

        //read spring config class (not file)
          AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //call bean methods
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getFortune());

        //close container
        context.close();
    }
}
