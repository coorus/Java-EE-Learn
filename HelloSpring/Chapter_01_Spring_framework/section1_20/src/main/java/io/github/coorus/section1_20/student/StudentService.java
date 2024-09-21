package io.github.coorus.section1_20.student;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

@Service
@AllArgsConstructor

public class StudentService {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public void insertJdbc() throws SQLException {
        Connection connection = dataSource.getConnection();
        connection.setAutoCommit(false);
        String sql = "INSERT INTO student(name, gender, birth_date) VALUES(?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "小老三");
        preparedStatement.setString(2, "男");
        preparedStatement.setDate(3, java.sql.Date.valueOf(LocalDate.of(2024, 12, 21)));
        try {
            preparedStatement.execute();
            int a = 1/0;
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            System.out.println(e);
        }
        connection.close();
    }

    @Transactional
    public void insertByAnnotation() {
        String sql = "INSERT INTO student(name, gender, birth_date) VALUES(?, ?, ?)";
        jdbcTemplate.update(sql, "小老四", "女", LocalDate.of(2024, 12, 31));
        // 模拟异常以触发事务回滚
        int a = 1 / 0;

    }
}
