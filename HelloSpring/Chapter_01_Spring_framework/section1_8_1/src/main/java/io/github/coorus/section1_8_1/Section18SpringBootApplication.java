package io.github.coorus.section1_8_1;

import io.github.coorus.section1_8_1.car.Car;
import io.github.coorus.section1_8_1.config.Config;
import io.github.coorus.section1_8_1.engines.EngineB;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Section18SpringBootApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(Config.class);

        Car car = ioc.getBean(Car.class);
        car.showEngine();

        EngineB engineB = ioc.getBean(EngineB.class);
        System.out.println(engineB);
    }
}
