package io.github.coorus.springbasics.chapter_01.eg_1_5_iocComponent;

import io.github.coorus.springbasics.chapter_01.eg_1_5_iocComponent.car.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: SpringBasics
 * @Package: io.github.coorus.springbasics
 * @ClassName: Main
 * @Author: sylvan
 * @Date: 2024/8/24 17:38
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
        Car car = ioc.getBean(Car.class);

        car.getEngine();
    }
}
