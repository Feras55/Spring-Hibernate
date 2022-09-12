package com.springTutorial.demo.sec1Tosec6;

public class BaseballCoach implements Coach {

    //define a private field for dependency

    private HappyFortuneService fortuneService;

    //define cnstr for dependency injection
    public BaseballCoach(HappyFortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
