package org.example.task2.mail;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.task2.codes.MailCode;

import java.util.HashMap;

@AllArgsConstructor
@Getter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public HashMap<String, String> generate() {
        return mailCode.generate(client);
    }

}

