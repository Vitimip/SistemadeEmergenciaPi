package com.vitalistech.emergencysystem.model;

import jakarta.persistence.*;

@Entity
public class Ocorrencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String endereco;
    private String tipo;
    private String status;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Frota ambulancia;

    public Ocorrencia() {
    }

    public Long getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Frota getAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(Frota ambulancia) {
        this.ambulancia = ambulancia;
    }
}