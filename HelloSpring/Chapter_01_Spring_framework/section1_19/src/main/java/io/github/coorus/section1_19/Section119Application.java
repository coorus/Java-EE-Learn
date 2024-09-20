package io.github.coorus.section1_19;

import io.github.coorus.section1_19.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class Section119Application {

    public static final String TABLE_NAME = "user";

    public static void main(String[] args) {


        ConfigurableApplicationContext ioc = SpringApplication.run(Section119Application.class, args);

        JdbcTemplate jdbcTemplate = ioc.getBean(JdbcTemplate.class);

        // Insert data
        String insertSql = "INSERT INTO test_table(name) VALUES (?)";

        //Update
        String updateSql = "UPDATE test_table SET name = ? WHERE name = ?";

        // Alter table name
        String alterTableNameSql = String.format("ALTER TABLE %s RENAME TO %s;", "old_name", "user");

        // Select data
        String selectSql = String.format("SELECT * FROM %s WHERE id = ?", TABLE_NAME);
        //String selectAllSql = String.format("SELECT * FROM %s;", TABLE_NAME);
        String selectAllSql = "SELECT id, name, created_at AS createdAt FROM user;";

        List<User> users = jdbcTemplate.query(selectAllSql, new BeanPropertyRowMapper<>(User.class));

        users.forEach(System.out::println);
    }

}
