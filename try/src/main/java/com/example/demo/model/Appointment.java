package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "default_gen", sequenceName = "appointment_seq", allocationSize = 1)
public class Appointment extends BaseEntity {

    private Integer claimedSeats;

    //TODO @OneToOne, @OneToMany, @ManyToMany...
    private Integer projectionId;

    //TODO @OneToOne, @OneToMany, @ManyToMany...
    private Integer userId;

}
