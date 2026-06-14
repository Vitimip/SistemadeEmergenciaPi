package com.vitalistech.emergencysystem.patterns.adapter;

/**
 * Padrão Adapter.
 *
 * Objetivo:
 * Adaptar a API externa ViaCepAPI para a interface
 * LocalizacaoService utilizada internamente pelo sistema.
 */
public class ViaCepAdapter implements LocalizacaoService {

    private ViaCepAPI api = new ViaCepAPI();

    @Override
    public String buscarEndereco(String cep) {
        return api.consultarCep(cep);
    }
}