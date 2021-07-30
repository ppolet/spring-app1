package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

    //-----musicPlayer
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        //---test SCOPE
        System.out.println("--- Test scope ---");
        boolean comparsion = musicPlayer == secondMusicPlayer;
        System.out.println("Comparsion musicPlayer and secondMusicPlayer: " + comparsion);

        System.out.println("musicPlayer: " + musicPlayer);
        System.out.println("secondMusicPlayer: " + secondMusicPlayer);
        System.out.println("--------------");

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
