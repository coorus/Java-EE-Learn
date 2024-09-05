package io.github.coorus.section1_7.car;

import io.github.coorus.section1_7.engines.IEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private IEngine iEngine;

    public void showEngine() {
        System.out.println(iEngine);
    }

    public Car(IEngine engineB) {
        this.iEngine = engineB;
        System.out.println("一个参数的构造方法");
    }
}
