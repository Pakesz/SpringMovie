package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "default_gen", sequenceName = "movie_seq", allocationSize = 1)
public class Movie extends BaseEntity {

    private String director;

    private int length;

    @Column(length = 128) // ilyen hosszú lehet maxn
    private String title;
}
