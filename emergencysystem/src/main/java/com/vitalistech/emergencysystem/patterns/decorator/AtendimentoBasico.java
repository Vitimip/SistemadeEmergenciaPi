package com.vitalistech.emergencysystem.patterns.decorator;

/**
 * Implementação básica do atendimento.
 *
 * Esta classe representa o objeto concreto que poderá
 * receber funcionalidades adicionais através do Decorator.
 */
public class AtendimentoBasico implements Atendimento {

    @Override
    public String descricao() {
        return "Atendimento Básico";
    }
}