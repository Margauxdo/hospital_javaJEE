package org.example.hospital_javajee.repository;

import org.example.hospital_javajee.model.Patient;
import org.example.hospital_javajee.model.Prescription;
import org.example.hospital_javajee.util.SessionFactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class PresciptionRepository {

    private SessionFactory sessionFactory;
    private Session session;

    public PresciptionRepository() {
        sessionFactory = SessionFactorySingleton.getSessionFactory();
    }
    public Prescription createPrescription(Prescription prescription) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(prescription);
            session.getTransaction().commit();
            return prescription;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
        return null;
    }

    public Prescription findPrescriptionById(int id) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            Prescription prescription = session.find(Prescription.class, id);
            session.getTransaction().commit();
            return prescription;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
        return null;
    }

    public List<Prescription> findAllPrescription() {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            Query<Prescription> query = session.createQuery("from Prescription ", Prescription.class);
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

    public Prescription updatePrescription(Prescription prescription) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(prescription);
            session.getTransaction().commit();
            return prescription;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            session.close();

        }
        return null;
    }
    public void deletePrescription(int id) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(findPrescriptionById(id));
            session.getTransaction().commit();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
    }
}
