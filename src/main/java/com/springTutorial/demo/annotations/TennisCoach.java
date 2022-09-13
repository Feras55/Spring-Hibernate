package com.springTutorial.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private  FortuneService fortuneService;

    //Injecting constructor Dependency using "Autowired"
    //which will look up the components for a component which implements FortuneService Interface
//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


    public TennisCoach() {

    }

    //Injecting Setter Dependency
    //extra: It is not obligatory that the setter function should be called the conventional setter name,
    //It could be given any name, thus any method with a "@Autowired" annotation will inject dependency
    @Autowired
    public void anyMethodNotNecessarilyASetter(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("Inside Setter");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhand Volley";
    }

    @Override
    public String getFortune(){
        return fortuneService.getFortune();
    }
}
