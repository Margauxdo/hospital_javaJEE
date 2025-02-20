package org.example.hospital_javajee.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;


//entité et relation
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient")
    private int id;
    private String name;
    private String firstname;
//    @Temporal(TemporalType.DATE)
    private LocalDate dateOfBirth;
    private String urlCustomerPhoto;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Consultation> consultationList;





}
