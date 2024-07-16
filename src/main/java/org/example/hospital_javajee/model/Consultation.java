package org.example.hospital_javajee.model;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consultation")
    private int id;

//    @Temporal(TemporalType.DATE)
    private LocalDate dateConsultation;

    private String nameDoctor;

    @ManyToOne
    @JoinColumn(name = "id_patient")
    private Patient patient;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "consultation")
    private Prescription prescription;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consultation")
    private List<CareSheet> careSheets;

}
