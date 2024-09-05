package io.github.coorus.section1_8_spring_boot.config;

import io.github.coorus.section1_8_spring_boot.car.Car;
import io.github.coorus.section1_8_spring_boot.engines.EngineA;
import io.github.coorus.section1_8_spring_boot.engines.EngineB;
import io.github.coorus.section1_8_spring_boot.engines.IEngine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public IEngine engineA() {
        return new EngineA();
    }

    @Bean
    public IEngine engineB() {
        return new EngineB();
    }
}
