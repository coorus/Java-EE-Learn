package io.github.coorus.section1_8_2.Computer;

import io.github.coorus.section1_8_2.Cpu.ICpu;
import io.github.coorus.section1_8_2.Memory.IMemory;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

// Computer.java

@Component
@AllArgsConstructor
public class Computer {
    private final ICpu cpuA;
    private final List<IMemory> iMemory;

    @Override
    public String toString() {
        return "Computer{" +
                "iCpu=" + cpuA +
                ", iMemory=" + iMemory +
                '}';
    }
}

