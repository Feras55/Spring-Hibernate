package com.springTutorial.demo;

public class TrackCoach implements Coach {
    HappyFortuneService myFortune;

    public TrackCoach(HappyFortuneService myFortune) {
        this.myFortune = myFortune;
    }

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5K";
    }

    @Override
    public String getDailyFortune() {
        return myFortune.getFortune();
    }


    //Custom Bean Initialization Method

    public  void myBeanInit(){
        System.out.println("Starting my Beans");
    }

    //Custom Bean Destruction Method
    public void myBeanDestruction(){
        System.out.println("Killing down my beans!");
    }
}
