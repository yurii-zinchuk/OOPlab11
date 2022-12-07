package org.example.task2.codes;

import org.example.task2.mail.Client;

import java.util.HashMap;

public interface MailCode {
    HashMap<String, String> generate(Client client);
}
