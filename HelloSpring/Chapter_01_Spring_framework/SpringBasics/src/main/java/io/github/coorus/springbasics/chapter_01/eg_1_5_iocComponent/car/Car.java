package io.github.coorus.springbasics.chapter_01.eg_1_5_iocComponent.car;

import io.github.coorus.springbasics.chapter_01.eg_1_5_iocComponent.engines.IEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: SpringBasics
 * @Package: io.github.coorus.springbasics.chapter_01.eg_1_4.car
 * @ClassName: Car
 * @Author: sylvan
 * @Date: 2024/8/24 17:35
 * @Description: TODO
 * @Version: 1.0
 */

@Component
public class Car {
    @Autowired
    private IEngine iEngine;
    public void getEngine() {
        System.out.println(iEngine);
    }
}
