package ru.netology.restapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.restapp.controller.AuthorizationController;
import ru.netology.restapp.repository.UserRepository;
import ru.netology.restapp.service.AuthorizationService;

@Configuration
public class JavaConfig {
    @Bean
    public AuthorizationController authorizationController() {
        return new AuthorizationController(authorizationService());
    }

    @Bean
    public AuthorizationService authorizationService() {
        return new AuthorizationService(userRepository());
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }


}
