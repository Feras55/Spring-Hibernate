package com.springTutorial.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private  FortuneService fortuneService;

    //Injecting constructor Dependency using "Autowired"
    //which will look up the components for a component which implements FortuneService Interface
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
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
