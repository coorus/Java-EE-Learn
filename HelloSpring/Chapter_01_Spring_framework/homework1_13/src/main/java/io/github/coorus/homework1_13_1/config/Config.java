package io.github.coorus.homework1_13_1.config;

import io.github.coorus.homework1_13_1.computer.Computer;
import io.github.coorus.homework1_13_1.cpu.CpuA;
import io.github.coorus.homework1_13_1.cpu.CpuB;
import io.github.coorus.homework1_13_1.cpu.ICpu;
import io.github.coorus.homework1_13_1.memory.MemoryA;
import io.github.coorus.homework1_13_1.memory.MemoryB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    public MemoryA memoryA1() {
        return new MemoryA();
    }

    @Bean
    public MemoryA memoryA2() {
        return new MemoryA();
    }

    @Bean
    public MemoryB memoryB1() {
        return new MemoryB();
    }

    @Bean
    public MemoryB memoryB2() {
        return new MemoryB();
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Computer computer(List<ICpu> cpus, MemoryA memoryA1, MemoryA memoryA2, MemoryB memoryB1, MemoryB memoryB2) {
        return new Computer(cpus, memoryA1, memoryA2, memoryB1, memoryB2);
    }
}
