package com.springTutorial.demo;

import java.util.ArrayList;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private ArrayList<String> randomFortunes;

    public RandomFortuneService() {
        randomFortunes = new ArrayList<String>();
        String s1 = "Today is your lucky day!! You gonna win!";
        String s2 = "Today is your unlucky day!!! You better RUN";
        String s3 = "Well uhmm I am not sure, go pray God!";
        randomFortunes.add(s1);
        randomFortunes.add(s2);
        randomFortunes.add(s3);
    }

    @Override
    public String getFortune() {
        Random random = new Random();
        int idx = random.nextInt(3);
        return randomFortunes.get(idx);
    }
}
