package io.github.coorus.section1_11.computer;

import io.github.coorus.section1_11.cpu.ICpu;
import io.github.coorus.section1_11.memory.IMemory;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

//@AllArgsConstructor
@ToString
public class Computer implements InitializingBean {
    private final ICpu cpu;
    private final List<IMemory> memories;

    public Computer(ICpu cpu, List<IMemory> memories) {
        this.cpu = cpu;
        this.memories = memories;
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct。。。");
    }

    public void initMethod() {
        System.out.println("initMethod。。。");

    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean。。。");


    }
}
