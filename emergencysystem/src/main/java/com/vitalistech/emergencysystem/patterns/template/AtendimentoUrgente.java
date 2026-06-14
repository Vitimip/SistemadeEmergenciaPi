package com.vitalistech.emergencysystem.patterns.template;

/**
 * Implementação concreta do fluxo de atendimento urgente.
 *
 * Especializa as etapas definidas pela classe
 * AtendimentoTemplate.
 */
public class AtendimentoUrgente extends AtendimentoTemplate {

    @Override
    protected void validarOcorrencia() {
        System.out.println("Ocorrência validada.");
    }

    @Override
    protected void enviarEquipe() {
        System.out.println("Equipe enviada.");
    }

    @Override
    protected void finalizarAtendimento() {
        System.out.println("Atendimento finalizado.");
    }
}