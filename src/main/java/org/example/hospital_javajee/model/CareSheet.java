package org.example.hospital_javajee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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
    private int id;
    private String contenerCareSheet;

    @ManyToOne
    private Consultation consultation;
}
