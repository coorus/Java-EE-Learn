package io.github.coorus.section1_8_1.car;

import io.github.coorus.section1_8_1.engines.IEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    @Autowired
    @Qualifier("engineA")
    private IEngine iEngine;
    public void showEngine() {
        System.out.println(iEngine);
    }
}

