package org.example.springcourseAnnotationJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public List<Music> listStyleMusicBean(){
        List<Music> listStyleMusic = new ArrayList<>();
        listStyleMusic.add(classicalMusic());
        listStyleMusic.add(rockMusic());
        listStyleMusic.add(jazzMusic());
        return listStyleMusic;
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(listStyleMusicBean());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
