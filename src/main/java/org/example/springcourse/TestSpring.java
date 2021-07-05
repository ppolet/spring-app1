package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

    //-----musicPlayer
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


    //-----musicPlayerList
        MusicPlayer musicPlayerList = context.getBean("musicPlayerList", MusicPlayer.class);
        musicPlayerList.playMusicList();

        System.out.println(musicPlayerList.getName());
        System.out.println(musicPlayerList.getVolume());

        context.close();

    }
}
