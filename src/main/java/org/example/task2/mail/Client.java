package org.example.task2.mail;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {
    private static int count;
    private final int id;
    private int age;
    private String name;
    private String gender;
    private String email;

    public Client() {
        id = count++;
    }
}
