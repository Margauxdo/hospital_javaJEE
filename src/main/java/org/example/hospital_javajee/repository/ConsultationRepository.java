package org.example.hospital_javajee.repository;

import org.example.hospital_javajee.model.Consultation;
import org.example.hospital_javajee.model.Patient;
import org.example.hospital_javajee.util.SessionFactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class ConsultationRepository {
    private SessionFactory sessionFactory;
    private Session session;

    public ConsultationRepository() {
        sessionFactory = SessionFactorySingleton.getSessionFactory();
    }

    public Consultation createConsutation(Consultation consultation) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(consultation);
            session.getTransaction().commit();
            return consultation;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
        return null;
    }

    public Consultation findConsultationById(int id) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            Consultation consultation = session.find(Consultation.class, id);
            session.getTransaction().commit();
            return consultation;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
        return null;
    }

    public List<Consultation> findAllConsultations() {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            Query<Consultation> query = session.createQuery("from Consultation ", Consultation.class);
            session.getTransaction().commit();
            return query.getResultList();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
        return null;
    }

    public Consultation updateConsultation(Consultation consultation) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(consultation);
            session.getTransaction().commit();
            return consultation;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            session.close();

        }
        return null;
    }
    public void deleteConsultation(int id) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(findConsultationById(id));
            session.getTransaction().commit();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
    }
}
