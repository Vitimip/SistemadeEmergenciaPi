package com.vitalistech.emergencysystem.patterns.adapter;

/**
 * Interface utilizada pelo padrão Adapter.
 *
 * Define o contrato que o sistema utiliza para obter
 * informações de localização, independentemente da API externa.
 */
public interface LocalizacaoService {

    String buscarEndereco(String cep);
}