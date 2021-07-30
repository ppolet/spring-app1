package org.example.springcourseAnnotation;

import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Classical Music 1";
    }
}
