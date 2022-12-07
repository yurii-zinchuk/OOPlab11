package org.example.task2.mail;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Objects;

public class MailSender {

    private static MailSender sender;
    private MailSender() {}
    public static MailSender getSender() {
        if (sender == null)
            sender = new MailSender();
        return sender;
    }

    public void sendMail(MailInfo info) {
        try {
            send(info.generate());
        } catch (MailjetException | MailjetSocketTimeoutException e) {
            System.out.println("Message not sent. See error below:");
            System.out.println(e);
        }
    }

    private void send(HashMap<String, String> email) throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("YOUR_API_KEY", "YOUR_SECRET_KEY", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "yurii.zinchuk@ucu.edu.ua")
                                        .put("Name", "Yurii Zinchuk"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", email.get("toEmail"))
                                                .put("Name", email.get("toName"))))
                                .put(Emailv31.Message.SUBJECT, email.get("subject"))
                                .put(Emailv31.Message.TEXTPART, email.get("textpart"))
                                .put(Emailv31.Message.HTMLPART, email.get("htmlpart"))
                                .put(Emailv31.Message.CUSTOMID, email.get("customid"))));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
