package com.computergeek.springcontext.springcontextdemo.component;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
public class Rectangle implements Polygon {

    private int length;
    private int breadth;

    Rectangle() {

    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int getArea() {
        return length * breadth;
    }
}
