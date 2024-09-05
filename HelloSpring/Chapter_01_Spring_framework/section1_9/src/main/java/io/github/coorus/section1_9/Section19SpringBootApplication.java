package io.github.coorus.section1_9;

import io.github.coorus.section1_9.car.Car;
//import io.github.coorus.section1_9.config.Config;
import io.github.coorus.section1_9.engines.EngineA;
import io.github.coorus.section1_9.engines.EngineB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Section19SpringBootApplication {

    public static void main(String[] args) {

        //AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext();
        ConfigurableApplicationContext ioc = SpringApplication.run(Section19SpringBootApplication.class);

        Car car = ioc.getBean(Car.class);
        car.showEngine();

        EngineB bean = ioc.getBean(EngineB.class);
        System.out.println(bean);


    }
}
