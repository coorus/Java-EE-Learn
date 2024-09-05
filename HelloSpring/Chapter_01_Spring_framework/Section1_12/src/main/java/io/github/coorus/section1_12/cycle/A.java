package io.github.coorus.section1_12.cycle;

import jakarta.annotation.Resource;
import lombok.ToString;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// A.java
public class A {
    private B b;

    public A(B b) {
        this.b = b;
    }
}
