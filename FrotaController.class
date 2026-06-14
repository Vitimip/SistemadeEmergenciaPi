package com.vitalistech.emergencysystem.patterns.decorator;

/**
 * Decorador concreto.
 *
 * Adiciona prioridade alta ao atendimento,
 * estendendo o comportamento do AtendimentoBasico.
 */
public class AtendimentoPrioritario extends AtendimentoDecorator {

    public AtendimentoPrioritario(Atendimento atendimento) {
        super(atendimento);
    }

    @Override
    public String descricao() {
        return atendimento.descricao() + " + Prioridade Alta";
    }
}