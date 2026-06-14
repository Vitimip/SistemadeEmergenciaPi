package com.vitalistech.emergencysystem.util;

// Classe responsável pelas validações usando Expressões Regulares (Regex).
public class Validador {

    public static boolean validarNome(String nome) {
        return nome.matches("^[A-Za-zÀ-ÿ ]{3,100}$");
    }

    public static boolean validarEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    public static boolean validarTelefone(String telefone) {
        return telefone.matches("^\\(?(62)?\\)?\\s?9?\\d{4}-?\\d{4}$");
    }

    public static boolean validarCPF(String cpf) {
        return cpf.matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
    }

    public static boolean validarCNPJ(String cnpj) {
        return cnpj.matches("^\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}$");
    }

    public static boolean validarPlaca(String placa) {
        return placa.matches("^[A-Z]{3}[0-9][A-Z][0-9]{2}$");
    }

    public static boolean validarCEP(String cep) {
        return cep.matches("^\\d{5}-?\\d{3}$");
    }
}