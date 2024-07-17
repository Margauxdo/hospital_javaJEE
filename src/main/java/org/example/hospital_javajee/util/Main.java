package org.example.hospital_javajee.util;

import org.example.hospital_javajee.model.Patient;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Patient patient = Patient.builder()
                .name("Marie")
                .firstname("Doe")
                .dateOfBirth(LocalDate.parse("2023-05-05"))
                .urlCustomerPhoto("www.photo.com")
                .build();
    }
}
