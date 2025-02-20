package org.example.hospital_javajee.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CareSheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_careSheet")
    private int id;
    private String contenerCareSheet;

    @ManyToOne
    @JoinColumn(name = "id_consultation")
    private Consultation consultation;
}
