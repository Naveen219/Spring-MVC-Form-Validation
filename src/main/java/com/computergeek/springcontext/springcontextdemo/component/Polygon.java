package com.computergeek.springcontext.springcontextdemo.component;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public interface Polygon {

    public int getArea();


}
