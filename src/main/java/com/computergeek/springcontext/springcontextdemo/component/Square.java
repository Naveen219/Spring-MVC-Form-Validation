package com.computergeek.springcontext.springcontextdemo.component;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
public class Square implements Polygon {
    private int sideLength;


    Square() {

    }
    public Square(int sideLength) {
        this.sideLength = sideLength;
    }



    @Override
    public int getArea() {
        return sideLength * sideLength;
    }


}
