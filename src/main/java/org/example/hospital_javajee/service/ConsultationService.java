package org.example.hospital_javajee.service;

import org.example.hospital_javajee.model.Consultation;
import org.example.hospital_javajee.model.Patient;
import org.example.hospital_javajee.repository.ConsultationRepository;
import org.hibernate.Session;

import java.util.List;

public class ConsultationService {
    private ConsultationRepository consultationRepository;
    private Session session;

    public ConsultationService() {
        this.consultationRepository = new ConsultationRepository();
    }
    public Consultation createConsultation(Consultation consultation) {

        return consultationRepository.createConsutation(consultation);
    }
    public Consultation findConsultationById(int id) {
        return consultationRepository.findConsultationById(id);

    }
    public List<Consultation> findAllConsultation(){

        return consultationRepository.findAllConsultations();
    }
    public Consultation updateConsultation(Consultation consultation) {
        return consultationRepository.updateConsultation(consultation);

    }
    public void deleteConsultation(int id) {
        consultationRepository.deleteConsultation(id);

    }

}
