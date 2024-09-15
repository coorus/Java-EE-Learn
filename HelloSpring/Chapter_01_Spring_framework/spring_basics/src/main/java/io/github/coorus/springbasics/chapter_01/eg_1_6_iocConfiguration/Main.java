package io.github.coorus.springbasics.chapter_01.eg_1_6_iocConfiguration;

import io.github.coorus.springbasics.chapter_01.config.SpringConfig;
import io.github.coorus.springbasics.chapter_01.eg_1_6_iocConfiguration.engines.Engine1;
import io.github.coorus.springbasics.chapter_01.eg_1_6_iocConfiguration.engines.Engine2;
import io.github.coorus.springbasics.chapter_01.eg_1_6_iocConfiguration.car.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
        Car car = ioc.getBean(Car.class);
        car.getEngine();

        Engine2 engine2 = ioc.getBean(Engine2.class);
        engine2.start();

        Engine1 engine1 = ioc.getBean(Engine1.class);
        engine1.start();
    }
}
