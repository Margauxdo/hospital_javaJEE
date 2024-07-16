package org.example.hospital_javajee.service;

import org.example.hospital_javajee.model.CareSheet;
import org.example.hospital_javajee.model.Consultation;
import org.example.hospital_javajee.repository.CareSheetRepository;
import org.hibernate.Session;

import java.util.List;

public class CareSheetService {

    private CareSheetRepository careSheetRepository;
    private Session session;

    public CareSheetService() {
        this.careSheetRepository = new CareSheetRepository();
    }

    public CareSheet createCareSheet(CareSheet careSheet) {

        return careSheetRepository.createCareSheet(careSheet);
    }
    public CareSheet findCareSheetById(int id) {
        return careSheetRepository.findCareSheetById(id);

    }
    public List<CareSheet> findAllCareSheet(){

        return careSheetRepository.findAllCareSheet();
    }
    public CareSheet updateCareSheet(CareSheet careSheet) {
        return careSheetRepository.updateCareSheet(careSheet);

    }
    public void deleteCareSheet(int id) {
        careSheetRepository.deleteCareSheet(id);

    }

}
