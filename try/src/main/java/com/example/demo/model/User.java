package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.Positive;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "default_gen", sequenceName = "user_seq", allocationSize = 1)
public class User extends BaseEntity {

    @Column(length = 64)
    private String name;

    @Email
    private String email;

    private String password;

    @Positive
    private int status;

}
