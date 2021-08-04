package org.example.springcourseAnnotationJava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //---используем SpringConfig.java вместо xml
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        //---проверка @Scope (singleton, prototype)
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println("Проверка равенства двух объектов после @Scope: " + (classicalMusic1 == classicalMusic2));

        System.out.println();

        //init и destroy методы с аннотациями @PostConstruct @PreDestroy
        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println("Playing: " + computer.toString());

        context.close();
    }
}
