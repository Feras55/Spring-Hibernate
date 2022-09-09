package com.springTutorial.demo;

public class CricketCoach implements Coach{

    private RandomFortuneService myRandomFortuneService;
     //injecting literal values
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Do 25 Base Runs";
    }

    @Override
    public String getDailyFortune() {
        return myRandomFortuneService.getFortune();
    }

    public void setMyRandomFortuneService(RandomFortuneService myRandomFortuneService) {
        this.myRandomFortuneService = myRandomFortuneService;
    }
}
