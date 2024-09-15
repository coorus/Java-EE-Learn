package io.github.coorus.homework1_13_1.computer;

import io.github.coorus.homework1_13_1.cpu.ICpu;
import io.github.coorus.homework1_13_1.memory.MemoryA;
import io.github.coorus.homework1_13_1.memory.MemoryB;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@ToString
public class Computer implements InitializingBean, DisposableBean {
    private List<ICpu> cpus;
    private MemoryA memoryA1;
    private MemoryA memoryA2;
    private MemoryB memoryB1;
    private MemoryB memoryB2;

    @Override
    public void afterPropertiesSet() throws Exception {
            System.out.println("afterPropertiesSet 初始化完成");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct 初始化完成");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Computer 已经销毁");
    }

    public void initMethod() {
        System.out.println("initMethod 初始化完成");
    }

    public void destroyMethod() {
        System.out.println("initMethod 初始化完成");
    }
}
