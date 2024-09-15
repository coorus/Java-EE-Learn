package io.github.coorus.demohomework1_13_2;

import java.util.Map;  // 导入 Map 类

import io.github.coorus.demohomework1_13_2.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demohomework1132Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Demohomework1132Application.class, args);

        // 获取所有 Student 类型的 Bean
        Map<String, Student> students = ioc.getBeansOfType(Student.class);
        students.forEach((name, student) -> {
            System.out.println(name + ": " + student);
        });
    }

}
