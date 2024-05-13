package com.gestione.viaggi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "turisti")
public class Turisti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTurista;
    private String nome;
    private String cognome;
    @Column(name = "data_nascita")
    private String dataNascita;
    private String nazionalita;
    private String email;
    private String documento;

    public Turisti() {
    }

    public Turisti(String nome, String cognome, String dataNascita, String nazionalita, String email,
            String documento) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.nazionalita = nazionalita;
        this.email = email;
        this.documento = documento;
    }

    public int getIdTurista() {
        return idTurista;
    }

    public void setIdTurista(int idTurista) {
        this.idTurista = idTurista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

}
