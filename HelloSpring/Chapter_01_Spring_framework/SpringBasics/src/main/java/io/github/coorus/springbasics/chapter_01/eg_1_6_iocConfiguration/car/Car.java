package io.github.coorus.springbasics.chapter_01.eg_1_6_iocConfiguration.car;

import io.github.coorus.springbasics.chapter_01.eg_1_6_iocConfiguration.engines.IEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Qualifier("engine2")
    @Autowired
    private IEngine iEngine;
    public void getEngine() {
        System.out.println(iEngine);
    }
}
