package io.github.coorus.section1_20;

import io.github.coorus.section1_20.student.Student;
import io.github.coorus.section1_20.student.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@SpringBootApplication
public class Section120Application {

    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext ioc = SpringApplication.run(Section120Application.class, args);
        StudentService studentService = ioc.getBean(StudentService.class);
        studentService.insertByAnnotation();


    }

}
