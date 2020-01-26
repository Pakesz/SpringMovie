package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Appointments", schema = "public") // ez lesz a neve, public sémába kerül.
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appointment_generator") // 2. param a javas név
    @SequenceGenerator(name = "appointment_generator", sequenceName = "appointment_seq") // ez a sequencia jön létre a postgre-ban ténylegesen
    private Integer id;
    private Integer claimedSeats;
    private Integer projectionId;
    private Integer userId;
}
