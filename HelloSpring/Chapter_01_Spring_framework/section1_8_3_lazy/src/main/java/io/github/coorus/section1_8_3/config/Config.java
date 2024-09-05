package io.github.coorus.section1_8_3.config;

import io.github.coorus.section1_8_3.Computer.Computer;
import io.github.coorus.section1_8_3.Cpu.CpuA;
import io.github.coorus.section1_8_3.Cpu.CpuB;
import io.github.coorus.section1_8_3.Cpu.ICpu;
import io.github.coorus.section1_8_3.Memory.IMemory;
import io.github.coorus.section1_8_3.Memory.MemoryA;
import io.github.coorus.section1_8_3.Memory.MemoryB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.List;

// Config.java
//@Configuration
public class Config {
    @Bean
    @Lazy
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
    public IMemory memoryB() {
        return new MemoryB();
    }
    @Bean
    @Lazy
    public Computer computer(ICpu cpuA, List<IMemory> memory) {
        return new Computer(cpuA, memory);
    }
}
