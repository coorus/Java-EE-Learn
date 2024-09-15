package io.github.coorus.springbasics.chapter_01.eg_1_5_iocComponent.engines;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: SpringBasics
 * @Package: io.github.coorus.springbasics
 * @ClassName: Engine1
 * @Author: sylvan
 * @Date: 2024/8/24 17:33
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class Engine2 implements IEngine {
    @Override
    public String toString() {
        return "Engine2{}";
    }

    @Override
    public void start() {
        System.out.println("启动引擎2");
    }
}
