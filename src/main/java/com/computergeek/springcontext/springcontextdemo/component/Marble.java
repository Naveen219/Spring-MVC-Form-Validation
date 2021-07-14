package com.computergeek.springcontext.springcontextdemo.component;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@Data
public class Marble {
    @Autowired
    List<Polygon> polygonList;

    public void print() {
        System.out.println(polygonList);
    }

}
