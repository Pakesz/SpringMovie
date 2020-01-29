package com.example.demo.service;

public interface MessageSender {

    void send(String from, String to, String subject, String body);

}
