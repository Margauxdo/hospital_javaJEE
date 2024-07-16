package org.example.hospital_javajee.service;

import org.example.hospital_javajee.model.Consultation;
import org.example.hospital_javajee.model.Prescription;
import org.example.hospital_javajee.repository.PresciptionRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class PrescriptionService {
    private PresciptionRepository presciptionRepository;
    private Session session;

    public PrescriptionService() {
        this.presciptionRepository = new PresciptionRepository();
    }
    public Prescription createPrescription(Prescription prescription) {

        return presciptionRepository.createPrescription(prescription);
    }
    public Prescription findPrescriptionById(int id) {
        return presciptionRepository.findPrescriptionById(id);

    }
    public List<Prescription> findAllPrescription(){

        return presciptionRepository.findAllPrescription();
    }
    public Prescription updatePrescription(Prescription prescription) {
        return presciptionRepository.updatePrescription(prescription);

    }
    public void deleteprescription(int id) {
        presciptionRepository.deletePrescription(id);

    }

}
