package io.github.coorus.section1_18;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class Section118Application {

    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext ioc = SpringApplication.run(Section118Application.class, args);
        DataSource dataSource = ioc.getBean(DataSource.class);

        for (int i = 0; i < 5; i++) {
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
            connection.close();
        }
    }

}
