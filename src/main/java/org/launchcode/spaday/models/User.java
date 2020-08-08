package org.launchcode.spaday.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Getter
@Setter
public class User {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private static int nextId = 1;
    @Setter(AccessLevel.NONE)
    private int id;
    private String username;
    private String email;
    private String password;
    private final String joinDate;

    public User(String username, String email, String password) {
        this.id = nextId;
        this.username = username;
        this.email = email;
        this.password = password;
        nextId++;
        joinDate = LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

}
