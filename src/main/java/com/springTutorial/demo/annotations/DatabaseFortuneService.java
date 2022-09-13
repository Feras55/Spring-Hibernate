package com.springTutorial.demo.annotations;


import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class DatabaseFortuneService implements FortuneService {
    List<String> fortunes = new ArrayList<>();

    public DatabaseFortuneService() throws IOException {
        fortunes = Files.readAllLines(Paths.get("D:\\Courses\\Spring and Hibernate\\demo\\src\\main\\java\\com\\springTutorial\\demo\\annotations\\fortunes.txt"));
    }

    @Override
    public String getFortune() {
        Random random = new Random();
        int index = random.nextInt(fortunes.size());

        return fortunes.get(index);

    }
}
