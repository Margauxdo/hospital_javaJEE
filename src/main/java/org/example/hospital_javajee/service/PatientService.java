package org.example.hospital_javajee.service;

import org.example.hospital_javajee.model.Patient;
import org.example.hospital_javajee.repository.PatientRepository;
import org.hibernate.Session;

import java.util.List;

public class PatientService {

    private PatientRepository patientRepository;
    private Session session;

    public PatientService() {

        this.patientRepository = new PatientRepository();
    }

    public Patient createPatient(Patient patient) {

        return patientRepository.createPatient(patient);
    }
    public Patient findPatientById(int id) {
        return patientRepository.findPatientById(id);

    }
    public List<Patient> findAllPatient(){
        return patientRepository.findAllPatient();
    }
    public Patient updatePatient(Patient patient) {
        return patientRepository.updatePatient(patient);

    }
    public void deletePatient(int id) {
        patientRepository.deletePatient(id);

    }
    public List<Patient> findPatientByName(String name) {
        return patientRepository.findPatientByName(name);
    }
}
