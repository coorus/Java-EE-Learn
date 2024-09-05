package io.github.coorus.section1_12.config;

import io.github.coorus.section1_12.cycle.A;
import io.github.coorus.section1_12.cycle.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

// Config.java
@Configuration
public class Config {
    @Bean
    public A a(@Lazy B b) {
        return new A(b);
    }
    @Bean
    public B b(@Lazy A a) {
        return new B(a);
    }
}
