package com.springTutorial.demo.sec7ToSec10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class swimJavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring config class (not file)
          AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        //call bean methods
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getFortune());

        System.out.println("Email: " + theCoach.getEmail());
        System.out.println("Team name: " + theCoach.getTeam());

        //close container
        context.close();
    }
}
