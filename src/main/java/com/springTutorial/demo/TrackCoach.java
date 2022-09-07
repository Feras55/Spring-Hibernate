package com.springTutorial.demo;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5K";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
