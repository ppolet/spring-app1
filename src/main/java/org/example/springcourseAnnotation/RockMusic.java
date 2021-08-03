package org.example.springcourseAnnotation;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    private String[] songs = new String[] {"Rock Music 1", "Rock-n-Roll 2", "Blues 3"};

    @Override
    public String[] getSong() {
        return songs;
    }
}
