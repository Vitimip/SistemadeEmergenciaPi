package com.vitalistech.emergencysystem.patterns.adapter;

/**
 * Simulação de uma API externa de consulta de CEP.
 *
 * Esta classe representa um serviço externo que precisa
 * ser adaptado para o formato utilizado pelo sistema.
 */
public class ViaCepAPI {

    public String consultarCep(String cep) {
        return "Endereço encontrado para o CEP: " + cep;
    }
}