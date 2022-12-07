package org.example.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating User with lombok Builder.");
        User user = User.builder().name("Yura").age(18).gender(Gender.MALE).weight(75).height(186).occupation("Student").build();
        System.out.println(user);
    }
}