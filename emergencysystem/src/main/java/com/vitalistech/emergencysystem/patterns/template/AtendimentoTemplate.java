package com.vitalistech.emergencysystem.patterns.template;

/**
 * Padrão Template Method.
 *
 * Objetivo:
 * Definir a estrutura geral do algoritmo de atendimento,
 * permitindo que subclasses implementem comportamentos específicos.
 */
public abstract class AtendimentoTemplate {

    public final void executarAtendimento() {
        validarOcorrencia();
        enviarEquipe();
        finalizarAtendimento();
    }

    protected abstract void validarOcorrencia();

    protected abstract void enviarEquipe();

    protected abstract void finalizarAtendimento();
}