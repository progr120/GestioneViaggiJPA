package com.gestione.viaggi.control;

import java.util.List;

import com.gestione.viaggi.entity.Viaggi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

public class ViaggiService {

    private EntityManager em;

    public ViaggiService(EntityManager em) {
        this.em = em;
    }

    public Viaggi createViaggi(Viaggi viaggi) {

        EntityTransaction transaction = em.getTransaction();
        Viaggi saved = null;
        try {
            transaction.begin();
            saved = em.merge(viaggi);
            transaction.commit();
            return saved;
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            ex.printStackTrace();
            return saved;
        }
    }

    public Viaggi getViaggiById(int id) {

        Viaggi viaggio = em.find(Viaggi.class, id);

        if (viaggio != null) {
            printViaggioDetails(viaggio);
        } else {
            System.out.println("Viaggio non trovato con ID: " + id);
        }

        return viaggio;
    }

    public void getViaggi() {
        TypedQuery<Viaggi> query = em.createQuery("SELECT v FROM Viaggi v", Viaggi.class);
        List<Viaggi> viaggi = query.getResultList();

        if (!viaggi.isEmpty()) {
            System.out.println("Elenco dei Viaggi: ");
            for (Viaggi viaggio : viaggi) {
                printViaggioDetails(viaggio);
            }
        } else {
            System.out.println("Nessun viaggio trovato.");
        }

    }

    public void updateViaggi(Viaggi viaggi, int id) {

        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            Viaggi v = em.find(Viaggi.class, id);
            if (v != null) {
                v.setDestinazione(viaggi.getDestinazione());
                v.setDataPartenza(viaggi.getDataPartenza());
                v.setDataRitorno(viaggi.getDataRitorno());
                v.setPostiDisponibili(viaggi.getPostiDisponibili());
                em.merge(v);
            }
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }

            ex.printStackTrace();
        }
    }

    public void deleteViaggi(int id) {

        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            Viaggi viaggi = em.find(Viaggi.class, id);
            if (viaggi != null) {
                em.remove(viaggi);
            }
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }

            ex.printStackTrace();
        }

    }
        
    public List<Viaggi> read() {
        List<Viaggi> viaggio = null;

        try {
            TypedQuery<Viaggi> query = em.createQuery("SELECT v FROM Viaggi v", Viaggi.class);
            viaggio = query.getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        return viaggio;
    }

public void printViaggioDetails(Viaggi viaggio) {
        System.out.println("----------------------------------------------");
        System.out.println("ID viaggio: " + viaggio.getIdViaggio());
        System.out.println("Destinazione: " + viaggio.getDestinazione());
        System.out.println("Data Partenza: " + viaggio.getDataPartenza());
        System.out.println("Data Ritorno: " + viaggio.getDataRitorno());
        System.out.println("Posti Disponibili: " + viaggio.getPostiDisponibili());
        System.out.println("----------------------------------------------");
    }

}
