package com.springTutorial.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    //Field Injection: Injecting the field without the need of a constructor or a setter
    //Spring directly injects the field using Java Reflection technique
    @Autowired
    @Qualifier("databaseFortuneService") //Since there are more than 1 class implementing FortuneService Interface
                                      //Spring can't decide which class to inject its instance dependency
                                      //Thus, you need to specify the class using @Qualifier and write the class's name (first letter lower-cased)
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
//    @Autowired
//    public void anyMethodNotNecessarilyASetter(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//        System.out.println("Inside Setter");
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhand Volley";
    }

    @Override
    public String getFortune(){
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void myInit(){
        System.out.println("Here is my custom init method");
    }

    @PreDestroy
    public void myDestructionMethod(){
        System.out.println("Here I shall die!");
    }
}
