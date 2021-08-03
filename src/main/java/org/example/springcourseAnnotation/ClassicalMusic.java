package org.example.springcourseAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music{
    private String[] songs = new String[] {"Classical music 1", "Music classical 2", "Opera 3"};

    @Override
    public String[] getSong() {
        return songs;
    }
}
