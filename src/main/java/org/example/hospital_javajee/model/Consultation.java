package org.example.hospital_javajee.model;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    private LocalDate dateConsultation;

    private String nameDoctor;

    @ManyToOne
    private Patient patient;
    @OneToOne(mappedBy = "consultation")
    private Prescription prescription;
    @OneToMany(mappedBy = "consultation")
    private List<CareSheet> careSheets;

    //consultation
    //prescription



}
