package org.cat.springbootenableother.config;


import org.cat.springbootenableother.domain.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public User user() {
        return new User();
    }

}
