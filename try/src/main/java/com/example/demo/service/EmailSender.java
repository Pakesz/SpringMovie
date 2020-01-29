package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmailSender implements MessageSender {

    private final JavaMailSender javaMailSender;

//    public EmailSender(JavaMailSender javaMailSender) {
//        this.javaMailSender = javaMailSender;
//    } --> @RequiredArgsConstructor

    @Override
    public void send(String from, String to, String subject, String body) {
        //TODO
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(to);
        msg.setSubject(subject);
        msg.setText(body);

        try {
            javaMailSender.send(msg);
        } catch (Exception e) {
            log.error("An error has occurred during email sending!", e);
        }
    }
}
