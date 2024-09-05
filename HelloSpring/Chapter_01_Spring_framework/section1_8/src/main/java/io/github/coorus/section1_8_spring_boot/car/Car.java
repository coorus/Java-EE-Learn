package io.github.coorus.section1_8_spring_boot.car;

import io.github.coorus.section1_8_spring_boot.engines.EngineA;
import io.github.coorus.section1_8_spring_boot.engines.IEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class Car {
    private IEngine iEngine;

    public void showEngine() {
        System.out.println(iEngine);
    }

    public Car(IEngine engine) {
        this.iEngine = engine;
    }
}

