package org.example.hospital_javajee.repository;

import org.example.hospital_javajee.model.CareSheet;
import org.example.hospital_javajee.model.Prescription;
import org.example.hospital_javajee.util.SessionFactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CareSheetRepository {
    private SessionFactory sessionFactory;
    private Session session;

    public CareSheetRepository() {
        sessionFactory = SessionFactorySingleton.getSessionFactory();
    }

    public CareSheet createCareSheet(CareSheet careSheet) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(careSheet);
            session.getTransaction().commit();
            return careSheet;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
        return null;
    }

    public CareSheet findCareSheetById(int id) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            CareSheet careSheet = session.find(CareSheet.class, id);
            session.getTransaction().commit();
            return careSheet;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
        return null;
    }

    public List<CareSheet> findAllCareSheet() {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            Query<CareSheet> query = session.createQuery("from CareSheet ", CareSheet.class);
            session.getTransaction().commit();
            return query.getResultList();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
        return null;
    }

    public CareSheet updateCareSheet(CareSheet careSheet) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(careSheet);
            session.getTransaction().commit();
            return careSheet;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            session.close();

        }
        return null;
    }
    public void deleteCareSheet(int id) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(findCareSheetById(id));
            session.getTransaction().commit();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
    }
}
