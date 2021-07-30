package org.example.springcourseAnnotation;

public class MusicPlayer {
    private Music music;

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

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    //---проигрывание 1 песни
    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

}