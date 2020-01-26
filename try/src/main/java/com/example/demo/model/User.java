package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Positive;

@Entity
@Getter
@Setter
public class User {
/*
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator") // 2. param a javas név
    @SequenceGenerator(name = "user_generator", sequenceName = "user_seq")
    private int id;
*/
    @Column(length = 64)
    private String name;

    @Email
    private String email;

    private String password;

    @Positive
    private int status;

}
