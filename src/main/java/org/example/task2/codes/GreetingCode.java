package org.example.task2.codes;

import lombok.NoArgsConstructor;
import org.example.task2.mail.Client;

import java.util.HashMap;

@NoArgsConstructor
public class GreetingCode implements MailCode{
    @Override
    public HashMap<String, String> generate(Client client) {
        HashMap<String, String> emailInfo = new HashMap<>();
        emailInfo.put("toName", client.getName());
        emailInfo.put("toEmail", client.getEmail());
        emailInfo.put("subject", "GreetingCode email arrived!");
        emailInfo.put("textpart", "Mister " + client.getName() + " you have received a greeting message, good for you!!");
        emailInfo.put("htmlpart", "");
        emailInfo.put("customid", "MailjetTesting");
        return emailInfo;
    }
}
