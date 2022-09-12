package com.springTutorial.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice backhand Volley";
    }
}
