package ru.netology.restapp.service;

import ru.netology.restapp.exception.InvalidCredentials;
import ru.netology.restapp.exception.UnauthorizedUser;
import ru.netology.restapp.authorities.Authorities;
import ru.netology.restapp.repository.UserRepository;

import java.util.List;

public class AuthorizationService {
   final private UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(String user, String password) {
        System.out.println(user);
        System.out.println(password);
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
