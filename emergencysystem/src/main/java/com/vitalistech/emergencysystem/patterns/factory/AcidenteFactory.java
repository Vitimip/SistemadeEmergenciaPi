package com.vitalistech.emergencysystem.patterns.factory;

import com.vitalistech.emergencysystem.model.Ocorrencia;

/**
 * Implementação concreta do padrão Factory Method.
 *
 * Responsável por criar objetos do tipo Ocorrencia
 * configurados para representar acidentes.
 */
public class AcidenteFactory extends OcorrenciaFactory {

    @Override
    public Ocorrencia criarOcorrencia() {
        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setTipo("Acidente");
        ocorrencia.setStatus("Aberta");
        return ocorrencia;
    }
}