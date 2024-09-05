package io.github.coorus.section1_8_3.Computer;

import io.github.coorus.section1_8_3.Cpu.ICpu;
import io.github.coorus.section1_8_3.Memory.IMemory;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

// Computer.java
//@AllArgsConstructor
@Component
@Lazy
public class Computer {
    private final ICpu cpuA;
    private final List<IMemory> iMemory;

    public Computer(ICpu cpuA, List<IMemory> iMemory) {
        this.cpuA = cpuA;
        this.iMemory = iMemory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "iCpu=" + cpuA +
                ", iMemory=" + iMemory +
                '}';
    }
}

