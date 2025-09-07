package ru.yandex.practicum.catsgram.model;

import java.time.Instant;

public class User {
    Long id;
    String username;
    String email;
    String password;
    Instant registrationDate;

    public User() {
    }
}