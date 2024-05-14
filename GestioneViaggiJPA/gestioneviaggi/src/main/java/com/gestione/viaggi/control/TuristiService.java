package com.gestione.viaggi.control;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import com.gestione.viaggi.entity.Turisti;

public class TuristiService {

    private EntityManager em;

    public TuristiService(EntityManager em) {
        this.em = em;
    }

    public Turisti createTuristi(Turisti turisti) {

        EntityTransaction transaction = em.getTransaction();
        Turisti saved = null;
        try {
            transaction.begin();
            saved = em.merge(turisti);
            transaction.commit();
            return saved;
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace();
            System.out.println("Errore durante la creazione del turista.");
            return saved;
        }
    }

    public Turisti getTuristiById(int id) {

        Turisti turisti = em.find(Turisti.class, id);

        if (turisti != null) {
            printTuristiDetails(turisti);
        } else {
            System.out.println("Turista non trovato con ID: " + id);
        }
        return turisti;
    }

    public void getTuristi() {

        TypedQuery<Turisti> query = em.createQuery("SELECT t FROM Turisti t", Turisti.class);
        List<Turisti> turisti = query.getResultList();

        if (!turisti.isEmpty()) {
            System.out.println("Elenco dei Turisti:");
            for (Turisti t : turisti) {
                printTuristiDetails(t);
            }
        } else {
            System.out.println("Nessun turista trovato.");
        }

    }

    public void updateTuristi(Turisti turisti, int id) {

        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            Turisti t = em.find(Turisti.class, id);
            if (t != null) {
                t.setNome(turisti.getNome());
                t.setCognome(turisti.getCognome());
                t.setDataNascita(turisti.getDataNascita());
                t.setNazionalita(turisti.getNazionalita());
                t.setEmail(turisti.getEmail());
                t.setDocumento(turisti.getDocumento());
                em.merge(t);
                transaction.commit();
                System.out.println("Turista aggiornato con successo!");
            } else {
                System.out.println("Turista non trovato con ID: " + id);
            }
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace();
            System.out.println("Errore durante l'aggiornamento del turista.");
        }
    }

    public void deleteTuristi(int id) {
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            Turisti turisti = em.find(Turisti.class, id);
            if (turisti != null) {
                em.remove(turisti);
                transaction.commit();
                System.out.println("Turista eliminato con successo!");
            } else {
                System.out.println("Turista non trovato con ID: " + id);
            }
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace();
            System.out.println("Errore durante l'eliminazione del turista.");
        }
    }
    
    public List<Turisti> read() {
        List<Turisti> turista = null;

        try {
            TypedQuery<Turisti> query = em.createQuery("SELECT t FROM Turisti t", Turisti.class);
            turista = query.getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        return turista;
    }

    private void printTuristiDetails(Turisti t) {
        System.out.println("----------------------------------------------");
        System.out.println("ID Turista: " + t.getIdTurista());
        System.out.println("Nome: " + t.getNome());
        System.out.println("Cognome: " + t.getCognome());
        System.out.println("Data Nascita: " + t.getDataNascita());
        System.out.println("Nazionalita: " + t.getNazionalita());
        System.out.println("Email: " + t.getEmail());
        System.out.println("Documento: " + t.getDocumento());
        System.out.println("----------------------------------------------");
    }
}