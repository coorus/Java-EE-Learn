package io.github.coorus.section1_13;

import io.github.coorus.section1_13.user.User;
import io.github.coorus.section1_13.user.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Section113Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Section113Application.class, args);
        UserService userService = ioc.getBean(UserService.class);
        //userService.add(new User(1, "张三"));
        //userService.add(1);
        User user = userService.get(1);
        System.out.println(user);
    }

}
