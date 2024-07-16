package org.example.hospital_javajee.repository;

import org.example.hospital_javajee.model.Patient;
import org.example.hospital_javajee.util.SessionFactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class PatientRepository {

    private SessionFactory sessionFactory;
    private Session session;

    public PatientRepository() {
        sessionFactory = SessionFactorySingleton.getSessionFactory();
    }
    public Patient createPatient(Patient patient) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(patient);
            session.getTransaction().commit();
            return patient;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
        return null;
    }

    public Patient findPatientById(int id) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            Patient patient = session.find(Patient.class, id);
            session.getTransaction().commit();
            return patient;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
        return null;
    }

    public List<Patient> findAllPatient() {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            Query<Patient> query = session.createQuery("from Patient", Patient.class);
            session.getTransaction().commit();
//            return query.list();
            return query.getResultList();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
        return null;
    }

    public Patient updatePatient(Patient patient) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(patient);
            session.getTransaction().commit();
            return patient;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            session.close();

        }
        return null;
    }
    public void deletePatient(int id) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(findPatientById(id));
            session.getTransaction().commit();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
    }
}

