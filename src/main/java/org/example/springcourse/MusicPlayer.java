package org.example.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music; //было до List<Music>
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {}

    //---в этом конструкторе заполняется List из applicationContext.xml
    //---делаем без конструктора, поэтому закомментил  его
//    public MusicPlayer(List<Music> musicList){
//        this.musicList = musicList;
//    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    //---проигрывание 1 песни
    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

    //---проигрывание List песен
    public void playMusicList(){
        for(Music m: musicList){
            System.out.println("Playing: " + m.getSong());
        }
    }

}
