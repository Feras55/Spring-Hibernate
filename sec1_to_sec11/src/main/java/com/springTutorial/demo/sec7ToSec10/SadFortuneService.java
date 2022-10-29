package com.springTutorial.demo.sec7ToSec10;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "I am so sad! You will LOSE!";
    }
}
