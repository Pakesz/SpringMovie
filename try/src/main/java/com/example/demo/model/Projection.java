package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Projection {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projection_generator") // 2. param a javas név
    @SequenceGenerator(name = "projection_generator", sequenceName = "projection_seq")
    private Integer id;
    private Integer seats;

    // id mezőt nem teszünk fele, az entity kell mint field.
    private Integer movieId; // vagy az sql alapján movie_id??
    private String time; // sql-ben datetime formátum


    @Autowired
    private JavaMailSender javaMailSender;

    void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("norbi1119@gmail.com");

        msg.setSubject("Test email from movie spring project");
        msg.setText("A küldés működik");

        javaMailSender.send(msg);

    }
}
