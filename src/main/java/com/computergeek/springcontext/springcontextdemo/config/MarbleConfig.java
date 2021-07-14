package com.computergeek.springcontext.springcontextdemo.config;

import com.computergeek.springcontext.springcontextdemo.component.Polygon;
import com.computergeek.springcontext.springcontextdemo.component.Rectangle;
import com.computergeek.springcontext.springcontextdemo.component.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MarbleConfig {

       @Bean
        public List<Polygon> polygonList() {
           return Arrays.asList(new Rectangle(20, 30),
                   new Square(20),
                   new Rectangle(20, 50),
                   new Square(40));
        }


}
