package io.github.coorus.section1_15.config;

import io.github.coorus.section1_15.user.User;
import io.github.coorus.section1_15.user.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public User user() {
        return new User(1001, "zhaoxiaoyu");
    }
    @Bean
    public UserService userService() {
        return new UserService();
    }
}
