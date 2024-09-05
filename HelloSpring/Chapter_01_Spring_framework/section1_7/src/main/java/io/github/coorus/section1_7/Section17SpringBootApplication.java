package io.github.coorus.section1_7;

import io.github.coorus.section1_7.car.Car;
import io.github.coorus.section1_7.engines.EngineA;
import io.github.coorus.section1_7.engines.EngineB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Section17SpringBootApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ioc = SpringApplication.run(Section17SpringBootApplication.class, args);
        Car car = ioc.getBean(Car.class);
        car.showEngine();
    }

}
