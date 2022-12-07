package org.example.task2.codes;

import lombok.NoArgsConstructor;
import org.example.task2.mail.Client;

import java.util.HashMap;

@NoArgsConstructor
public class GiftCode implements MailCode{
    @Override
    public HashMap<String, String> generate(Client client) {
        HashMap<String, String> emailInfo = new HashMap<>();
        emailInfo.put("toName", client.getName());
        emailInfo.put("toEmail", client.getEmail());
        emailInfo.put("subject", "GiftCode email arrived!");
        emailInfo.put("textpart", "Dear " + client.getName() + " you have received a gift message, congrats!!");
        emailInfo.put("htmlpart", "");
        emailInfo.put("customid", "MailjetTesting");
        return emailInfo;
    }
}
