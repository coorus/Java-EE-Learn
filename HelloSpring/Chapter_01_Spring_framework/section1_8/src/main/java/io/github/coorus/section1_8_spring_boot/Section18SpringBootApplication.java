package io.github.coorus.section1_8_spring_boot;

import io.github.coorus.section1_8_spring_boot.car.Car;
import io.github.coorus.section1_8_spring_boot.config.Config;
import io.github.coorus.section1_8_spring_boot.config.Config1;
import io.github.coorus.section1_8_spring_boot.engines.EngineB;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Section18SpringBootApplication {

    public static void main(String[] args) {
        //ConfigurableApplicationContext ioc = SpringApplication.run(Section18SpringBootApplication.class);

        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(Config.class, Config1.class);

        Car car = ioc.getBean(Car.class);
        car.showEngine();

        EngineB iEngine = ioc.getBean(EngineB.class);
        System.out.println(iEngine);
    }
}
