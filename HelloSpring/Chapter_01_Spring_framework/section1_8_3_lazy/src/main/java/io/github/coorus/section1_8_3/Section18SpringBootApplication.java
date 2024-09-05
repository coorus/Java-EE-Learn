package io.github.coorus.section1_8_3;

import io.github.coorus.section1_8_3.Computer.Computer;
//import io.github.coorus.section1_8_2.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Section18SpringBootApplication {

    public static void main(String[] args) {

        //AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(Config.class);
        ConfigurableApplicationContext ioc = SpringApplication.run(Section18SpringBootApplication.class);

        Computer com = ioc.getBean(Computer.class);

        System.out.println(com.toString());

    }
}
