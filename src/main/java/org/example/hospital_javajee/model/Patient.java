package org.example.hospital_javajee.model;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.List;


//entité et relation
public class Patient {
    private int id;
    private String name;
    private String firstname;
    private LocalDate dateOfBirth;
    private List<Consultation> consultations;
    //type img
}
