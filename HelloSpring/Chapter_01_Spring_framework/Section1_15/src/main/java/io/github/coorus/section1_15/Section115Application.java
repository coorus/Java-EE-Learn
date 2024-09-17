package io.github.coorus.section1_15;

import io.github.coorus.section1_15.user.User;
import io.github.coorus.section1_15.user.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Section115Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Section115Application.class, args);
        User user = run.getBean(User.class);
        UserService userService = run.getBean(UserService.class);
        userService.add(user);
        userService.remove(1);
    }

}
