package io.github.coorus.section1_10.config;

import io.github.coorus.section1_10.computer.Computer;
import io.github.coorus.section1_10.cpu.CpuA;
import io.github.coorus.section1_10.cpu.CpuB;
import io.github.coorus.section1_10.cpu.ICpu;
import io.github.coorus.section1_10.memory.IMemory;
import io.github.coorus.section1_10.memory.MemoryA;
import io.github.coorus.section1_10.memory.MemoryB;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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

    @Bean
    @ConditionalOnBean(name = {"cpuA", "memoryA", "memoryB"})
    public Computer computer(ICpu cpuA, List<IMemory> memories) {
        return new Computer(cpuA, memories);

    }
}
