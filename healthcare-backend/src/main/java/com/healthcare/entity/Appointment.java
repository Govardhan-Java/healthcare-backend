package com.healthcare.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Provider provider;

    private LocalDateTime appointmentTime;

    // Getters and Setters
}

