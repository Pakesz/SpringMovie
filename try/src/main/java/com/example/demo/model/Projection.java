package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "default_gen", sequenceName = "projection_seq", allocationSize = 1)
public class Projection extends BaseEntity {

    private Integer seats;

    //TODO @OneToOne, @OneToMany, @ManyToMany...
    private Integer movieId; // vagy az sql alapján movie_id??

    private String time; // sql-ben datetime formátum
}
