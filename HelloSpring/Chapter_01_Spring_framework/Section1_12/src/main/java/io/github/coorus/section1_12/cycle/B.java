package io.github.coorus.section1_12.cycle;

import lombok.ToString;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// B.java
@Component
public class B {
    //@Resource
    private A a;

    public B(A a) {
        this.a = a;
    }
}
