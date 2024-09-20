package io.github.coorus.homework1_19;

import io.github.coorus.homework1_19.student.Student;
import io.github.coorus.homework1_19.student.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class Homework119Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Homework119Application.class, args);

        StudentService studentService = ioc.getBean(StudentService.class);

        studentService.initTable();

        //studentService.queryAll().forEach(System.out::println);

        studentService.updateBirthDateById(2, LocalDate.of(2000, 10, 18));

        //studentService.queryAll().forEach(System.out::println);

        System.out.println(studentService.getStudentById(3));


    }

}
