package com.computergeek.springcontext.springcontextdemo;

import com.computergeek.springcontext.springcontextdemo.component.Marble;
import com.computergeek.springcontext.springcontextdemo.component.Polygon;
import com.computergeek.springcontext.springcontextdemo.component.Rectangle;
import com.computergeek.springcontext.springcontextdemo.component.Square;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.w3c.dom.css.Rect;
import sun.security.provider.ConfigFile;

@SpringBootApplication
@PropertySource("classpath:messages.properties")
public class SpringContextDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringContextDemoApplication.class, args);
       /*
        ConfigurableApplicationContext context = SpringApplication.run(SpringContextDemoApplication.class, args);
        Marble marble = context.getBean(Marble.class);
        marble.print();
*/

    }

}
