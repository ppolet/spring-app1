package org.example.springcourseAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    private Music music;

    //---проигрывание 1 песни
    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

}
