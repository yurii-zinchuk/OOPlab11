package org.example.task2.mail;

import java.util.LinkedList;
import java.util.List;

public class MailBox {
    private final List<MailInfo> infos;
    private final MailSender sender;

    public MailBox() {
        infos = new LinkedList<>();
        sender = MailSender.getSender();
    }

    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }

    public void sendAll() {
        for (MailInfo info:
             infos) {
            info.generate();
            sender.sendMail(info);
        }
    }
}
