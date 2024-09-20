package io.github.coorus.homework1_19.student;

import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {

    private JdbcTemplate jdbcTemplate;

    private static final String TABLE_NAME = "student";

    public void add(Student student) {
        String sql = String.format("INSERT INTO %s(name, gender, birth_date) VALUES(?, ?, ?);", TABLE_NAME);
        jdbcTemplate.update(sql,  student.getName(), Character.toString(student.getGender()), student.getBirthDate());
    }

    public void initTable() {
        String sql = String.format("TRUNCATE TABLE %s;", TABLE_NAME);
        jdbcTemplate.update(sql);
        add(new Student("赵小花", '女', LocalDate.of(2001, 11, 24)));
        add(new Student("殷小昊", '男', LocalDate.of(2001, 10, 18)));
        add(new Student("右右", '女', LocalDate.of(2022, 10, 18)));
        add(new Student("虎虎", '男', LocalDate.of(2023, 1, 29)));
        add(new Student("小老大", '男', LocalDate.of(2024, 7, 24)));
        add(new Student("小老二", '男', LocalDate.of(2024, 7, 24)));
    }

    public Student getStudentById(Integer id) {
        String sql = String.format("SELECT * FROM %s WHERE id = ?", TABLE_NAME);
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class), id);
    }
    public Student updateBirthDateById(int id, LocalDate newBirthDate) {
        Student student = getStudentById(id);
        student.setBirthDate(newBirthDate);
        String sql = String.format("UPDATE %s SET birth_date = ? WHERE id = ?;", TABLE_NAME);
        jdbcTemplate.update(sql, student.getBirthDate(), student.getId());
        return student;
    }

    public List<Student> queryAll() {
        String sql = String.format("SELECT * FROM %s", TABLE_NAME);
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
    }
}
