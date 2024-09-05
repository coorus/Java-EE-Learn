package io.github.coorus.section1_11.config;

import io.github.coorus.section1_11.computer.Computer;
import io.github.coorus.section1_11.cpu.CpuA;
import io.github.coorus.section1_11.cpu.CpuB;
import io.github.coorus.section1_11.cpu.ICpu;
import io.github.coorus.section1_11.memory.IMemory;
import io.github.coorus.section1_11.memory.MemoryA;
import io.github.coorus.section1_11.memory.MemoryB;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Configuration
public class Config {
    @Bean
    public ICpu cpuA() {
        return new CpuA();
    }

    @Bean
    public ICpu cpuB() {
        return new CpuB();
    }

    @Bean
    public IMemory memoryA() {
        return new MemoryA();
    }

    @Bean
    @Order(0)
    public IMemory memoryB() {
        return new MemoryB();
    }

    @Bean(initMethod = "initMethod")
    public Computer computer(ICpu cpuA, List<IMemory> memories) {
        return new Computer(cpuA, memories);
    }
}
