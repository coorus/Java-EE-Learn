package io.github.coorus.section1_10;


import io.github.coorus.section1_10.cpu.ICpu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Section19SpringBootApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ioc = SpringApplication.run(Section19SpringBootApplication.class);
        //
        //ICpu cpu = ioc.getBean(ICpu.class);
        //System.out.println(cpu.toString());

    }
}
