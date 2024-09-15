package io.github.coorus.homework1_13_1;

import io.github.coorus.homework1_13_1.computer.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Homework113Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Homework113Application.class, args);
        Computer computer = ioc.getBean(Computer.class);
        System.out.println(computer);
    }

}
