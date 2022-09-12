package com.springTutorial.demo.sec1Tosec6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

        //call method to retrieve literal values injected

        System.out.println(coach.getTeam());
        System.out.println(coach.getEmailAddress());

        for (int i = 0; i < 3; i++) {
            System.out.println(coach.getDailyFortune());
        }

        context.close();
    }
}
