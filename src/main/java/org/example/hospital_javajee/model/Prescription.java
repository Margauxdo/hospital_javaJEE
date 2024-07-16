package org.example.hospital_javajee.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prescription")
    private int id;
    private String contenerPrescription;

    @OneToOne
    @JoinColumn(name = "id_consultation")
    private Consultation consultation;
}
