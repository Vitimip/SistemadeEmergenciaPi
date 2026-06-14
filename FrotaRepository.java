package com.vitalistech.emergencysystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medicamento {

    @Id
    private String id;

    private String descricao;
    private String principioAtivo;
    private String excipientes;
    private String administracao;

    public Medicamento() {
    }

    public Medicamento(String id, String descricao, String principioAtivo,
            String excipientes, String administracao) {
        this.id = id;
        this.descricao = descricao;
        this.principioAtivo = principioAtivo;
        this.excipientes = excipientes;
        this.administracao = administracao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public String getExcipientes() {
        return excipientes;
    }

    public void setExcipientes(String excipientes) {
        this.excipientes = excipientes;
    }

    public String getAdministracao() {
        return administracao;
    }

    public void setAdministracao(String administracao) {
        this.administracao = administracao;
    }
}