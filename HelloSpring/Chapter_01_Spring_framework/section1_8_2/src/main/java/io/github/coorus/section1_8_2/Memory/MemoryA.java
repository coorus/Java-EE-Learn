package io.github.coorus.section1_8_2.Memory;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

// MemoryA.java
@Component
public class MemoryA implements IMemory, Ordered {
    @Override
    public String toString() {
        return "MemoryA{}";
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
