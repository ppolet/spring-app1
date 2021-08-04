package org.example.springcourseAnnotationJava;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RockMusic implements Music{
    @PostConstruct
    public void doMyInit(){
        System.out.println("Do my initialization (Java)");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Do my Destruction (Java)");
    }

    @Override
    public String getSong() {
        return "Java Rock music";
    }
}
