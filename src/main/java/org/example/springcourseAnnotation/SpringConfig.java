package org.example.springcourseAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.springcourseAnnotation")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
