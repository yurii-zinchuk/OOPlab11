package org.example.task2;

import org.example.task2.codes.GiftCode;
import org.example.task2.codes.GreetingCode;
import org.example.task2.mail.Client;
import org.example.task2.mail.MailBox;
import org.example.task2.mail.MailInfo;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Afanasii");
        client.setEmail("zinchukyurii25@gmail.com");

        GiftCode giftCode = new GiftCode();
        GreetingCode greetingCode = new GreetingCode();

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(new MailInfo(client, giftCode));
        mailBox.addMailInfo(new MailInfo(client, greetingCode));

        mailBox.sendAll();
    }
}
