package io.github.coorus.section1_12;

import io.github.coorus.section1_12.cycle.A;
import io.github.coorus.section1_12.cycle.B;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Section112Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Section112Application.class, args);
        A a = ioc.getBean(A.class);
        B b = ioc.getBean(B.class);

        System.out.println(a);
        System.out.println(b);

    }

}
