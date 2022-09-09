package com.springTutorial.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class HelloSpringApp {
    public static void main(String[] args) {


        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        //retrieve bean from spring container
            Coach coach = context.getBean("myCoach", Coach.class); //this object has been injected a fortuneservice
        //call methods on bean
        System.out.println(coach.getDailyWorkout());

        //call method of fortunes (new method to test DI)
        System.out.println(coach.getDailyFortune());


        //close context
        context.close();
    }
}
