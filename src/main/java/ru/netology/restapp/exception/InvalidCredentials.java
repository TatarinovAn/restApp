package ru.netology.restapp.exception;


public class InvalidCredentials extends RuntimeException {

    public InvalidCredentials(String msg) {
        super(msg);
    }
}
