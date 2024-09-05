package io.github.coorus.section1_8_2.Memory;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MemoryB implements IMemory, Ordered {
    @Override
    public String toString() {
        return "MemoryB{}";
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
