package io.github.coorus.section1_10.computer;

import io.github.coorus.section1_10.cpu.ICpu;
import io.github.coorus.section1_10.memory.IMemory;

import java.util.List;

public class Computer {
    private List<IMemory> memories;
    private ICpu cpu;

    public Computer(ICpu cpu, List<IMemory> memories) {
        this.memories = memories;
        this.cpu = cpu;
    }
}
