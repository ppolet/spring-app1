package org.example.springcourseAnnotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RockMusic implements Music{
    private String[] songs = new String[] {"Rock Music 1", "Rock-n-Roll 2", "Blues 3"};

    @PostConstruct
    public void doMyInit(){
        System.out.println("Do my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Do my Destruction");
    }

    @Override
    public String[] getSong() {
        return songs;
    }
}
