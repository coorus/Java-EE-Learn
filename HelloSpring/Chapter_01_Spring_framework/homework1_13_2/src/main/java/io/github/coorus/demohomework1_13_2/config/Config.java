package io.github.coorus.demohomework1_13_2.config;

import io.github.coorus.demohomework1_13_2.student.Student;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class Config {

    @Bean
    @ConditionalOnProperty(name = "student1.id")
    public Student student1(
            @Value("${student1.id}") String id,
            @Value("${student1.name}") String name,
            @Value("${student1.age}") int age,
            @Value("${student1.sex}") int sex) {
        return new Student(id, name, age, sex);
    }

    @Bean
    @ConditionalOnProperty(name = "student2.id")
    public Student student2(
            @Value("${student2.id}") String id,
            @Value("${student2.name}") String name,
            @Value("${student2.age}") int age,
            @Value("${student2.sex}") int sex) {
        return new Student(id, name, age, sex);
    }
}
