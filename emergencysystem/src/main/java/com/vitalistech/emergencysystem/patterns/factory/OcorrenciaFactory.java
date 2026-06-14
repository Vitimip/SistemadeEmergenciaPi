package com.vitalistech.emergencysystem.patterns.factory;

import com.vitalistech.emergencysystem.model.Ocorrencia;

/**
 * Padrão Factory Method.
 *
 * Objetivo:
 * Definir uma interface responsável pela criação de objetos do tipo
 * Ocorrencia, permitindo que subclasses decidam qual implementação
 * concreta será instanciada.
 */
public abstract class OcorrenciaFactory {

    public abstract Ocorrencia criarOcorrencia();
}