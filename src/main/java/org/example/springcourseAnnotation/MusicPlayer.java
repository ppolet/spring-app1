package org.example.springcourseAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }

    //---проигрывание 1 песни
    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

}
