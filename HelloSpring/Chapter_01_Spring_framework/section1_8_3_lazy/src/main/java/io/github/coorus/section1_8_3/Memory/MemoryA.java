package io.github.coorus.section1_8_3.Memory;

import org.springframework.context.annotation.Lazy;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

// MemoryA.java

@Component
@Lazy
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
