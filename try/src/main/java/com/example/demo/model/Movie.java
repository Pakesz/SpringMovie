package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Movie {
    // @Getter(AccessLevel.NONE) // erre nem generál
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_generator") // 2. param a javas név
    @SequenceGenerator(name = "movie_generator", sequenceName = "movie_seq")
    private int id;
    private String director;
    private int length;

    @Column(length = 128) // ilyen hosszú lehet maxn
    private String title;
}
