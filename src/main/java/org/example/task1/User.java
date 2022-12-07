package org.example.task1;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

enum Gender {
    MALE, FEMALE
}

@Builder
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular
    private List<String> occupations;

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Weight: " + weight + "\n" +
                "Height: " + height;
    }
}