package com.gestione.viaggi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "viaggi")
public class Viaggi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idViaggio;
    private String destinazione;
    @Column(name = "data_partenza")
    private String dataPartenza;
    @Column(name = "data_ritorno")
    private String dataRitorno;
    @Column(name = "posti_disponibili")
    private int postiDisponibili;

    public Viaggi() {
    }

    public Viaggi(String destinazione, String dataPartenza, String dataRitorno, int postiDisponibili) {
        this.destinazione = destinazione;
        this.dataPartenza = dataPartenza;
        this.dataRitorno = dataRitorno;
        this.postiDisponibili = postiDisponibili;
    }

    public int getIdViaggio() {
        return idViaggio;
    }

    public void setIdViaggio(int idViaggio) {
        this.idViaggio = idViaggio;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public String getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(String dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public String getDataRitorno() {
        return dataRitorno;
    }

    public void setDataRitorno(String dataRitorno) {
        this.dataRitorno = dataRitorno;
    }

    public int getPostiDisponibili() {
        return postiDisponibili;
    }

    public void setPostiDisponibili(int postiDisponibili) {
        this.postiDisponibili = postiDisponibili;
    }

}
