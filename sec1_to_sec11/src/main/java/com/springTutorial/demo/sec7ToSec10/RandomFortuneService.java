package com.springTutorial.demo.sec7ToSec10;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    private String[] randomFortunes = { "Randomized: Today is your lucky day!! You gonna win!",
            "Randomized: Today is your unlucky day!!! You better RUN",
            "Randomized: Well uhmm I am not sure, go pray God!"
    };

    private Random random = new Random();

    @Override
    public String getFortune() {
        int idx = random.nextInt(randomFortunes.length);
        return randomFortunes[idx];
    }
}
