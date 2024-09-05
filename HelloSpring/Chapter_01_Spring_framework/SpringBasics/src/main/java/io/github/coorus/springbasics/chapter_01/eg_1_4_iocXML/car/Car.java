package io.github.coorus.springbasics.chapter_01.eg_1_4_iocXML.car;

import io.github.coorus.springbasics.chapter_01.eg_1_4_iocXML.engines.Engine1;
import io.github.coorus.springbasics.chapter_01.eg_1_4_iocXML.engines.Engine2;
import io.github.coorus.springbasics.chapter_01.eg_1_4_iocXML.engines.IEngine;

/**
 * @ProjectName: SpringBasics
 * @Package: io.github.coorus.springbasics.chapter_01.eg_1_4.car
 * @ClassName: Car
 * @Author: sylvan
 * @Date: 2024/8/24 17:35
 * @Description: TODO
 * @Version: 1.0
 */
public class Car {

    private IEngine iEngine;
    public void getEngine() {
        System.out.println(iEngine);
    }

    public void setiEngine(Engine1 iEngine) {
        this.iEngine = iEngine;
    }

    public void setiEngine(Engine2 iEngine) {
        this.iEngine = iEngine;
    }


}
