package io.github.coorus.section1_11;

import io.github.coorus.section1_11.computer.Computer;
import io.github.coorus.section1_11.cpu.CpuB;
import io.github.coorus.section1_11.cpu.ICpu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Section111Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Section111Application.class, args);
        Computer computer = ioc.getBean(Computer.class);
        ICpu iCpu = ioc.getBean(CpuB.class);

        System.out.println(computer);
        //System.out.println(iCpu);
    }


}
