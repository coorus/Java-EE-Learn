package io.github.coorus.section1_8_3.Memory;

import org.springframework.context.annotation.Lazy;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
@Lazy
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
