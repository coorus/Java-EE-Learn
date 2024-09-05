//package io.github.coorus.section1_8_2.config;
//
//import io.github.coorus.section1_8_2.Computer.Computer;
//import io.github.coorus.section1_8_2.Cpu.CpuA;
//import io.github.coorus.section1_8_2.Cpu.CpuB;
//import io.github.coorus.section1_8_2.Cpu.ICpu;
//import io.github.coorus.section1_8_2.Memory.IMemory;
//import io.github.coorus.section1_8_2.Memory.MemoryA;
//import io.github.coorus.section1_8_2.Memory.MemoryB;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//// Config.java
//@Configuration
//public class Config {
//    @Bean
//    public ICpu cpuA() {
//        return new CpuA();
//    }
//    @Bean
//    public ICpu cpuB() {
//        return new CpuB();
//    }
//    @Bean
//    public IMemory memoryA() {
//        return new MemoryA();
//    }
//    @Bean
//    public IMemory memoryB() {
//        return new MemoryB();
//    }
//    @Bean
//    public Computer computer(ICpu cpuA, List<IMemory> memory) {
//        return new Computer(cpuA, memory);
//    }
//}
