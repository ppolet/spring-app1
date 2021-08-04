package org.example.springcourseAnnotationJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    private List<Music> listStyleMusic;

    public MusicPlayer(List listStyleMusic) {
        this.listStyleMusic = listStyleMusic;
    }

    //---проигрывание 1 песни
    public String playMusic(){
        Random r = new Random();
        return "Playing: " + listStyleMusic.get(r.nextInt(3)).getSong();
    }

}
