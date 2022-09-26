package com.springTutorial.demo.sec7ToSec10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Step 1:
@Configuration
//Step 2: Add Component Scanning
//@ComponentScan("com.springTutorial.demo.sec7ToSec10")

@PropertySource("classpath:sport.properties") //for injecting values from properties files
public class SportConfig {

    //define method to expose bean (swimCoach and Sadfortune)

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    //define the bean and inject dependency (fortuneService)
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }



}
