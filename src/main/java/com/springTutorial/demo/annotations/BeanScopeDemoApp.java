package com.springTutorial.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");

        //retrieve bean
        Coach coach  = context.getBean("tennisCoach",Coach.class);

        Coach theCoach  = context.getBean("tennisCoach",Coach.class);

        boolean result = (coach == theCoach);

        System.out.println("Is coach == theCoach? "  + result );

        System.out.println("Memory location of Coach: " + coach);
        System.out.println("Memory location of theCoach: " + theCoach);

        //close context
        context.close();

    }
}
