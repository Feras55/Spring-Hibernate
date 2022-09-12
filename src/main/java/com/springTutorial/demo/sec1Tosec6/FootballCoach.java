package com.springTutorial.demo.sec1Tosec6;

public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Dribbling workout for one hour";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
