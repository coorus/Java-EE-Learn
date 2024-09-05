package io.github.coorus.section1_9.car;

import io.github.coorus.section1_9.engines.IEngine;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Car.java

@Component
public class Car {

    @Resource(name="engineA")
    private IEngine engine;

    public void showEngine() {
        System.out.println(engine);
    }
}

