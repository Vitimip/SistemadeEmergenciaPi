package com.vitalistech.emergencysystem.patterns.singleton;

/*
 * Padrão Singleton.
 *
 * Objetivo:
 * Garantir que exista apenas uma única instância do objeto Logger
 * durante toda a execução do sistema, centralizando o registro de
 * eventos e operações realizadas.
 */
public class LoggerSingleton {

    private static LoggerSingleton instance;

    private LoggerSingleton() {
    }

    public static LoggerSingleton getInstance() {
        if (instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }

    public void log(String mensagem) {
        System.out.println("[LOG] " + mensagem);
    }
}