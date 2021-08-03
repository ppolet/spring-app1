package org.example.springcourseAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    //---проигрывание 1 песни
    public String playMusic(MusicStyle musicStyle){
        //return "Playing: " + music1.getSong() + ", " + music2.getSong();
        String result = "";
        Random r = new Random();
        switch (musicStyle) {
            case CLASSICAL:
                result = music1.getSong()[r.nextInt(3)];
                break;
            case ROCK:
                result = music2.getSong()[r.nextInt(3)];
                break;
        }
        return result;


    }

}
