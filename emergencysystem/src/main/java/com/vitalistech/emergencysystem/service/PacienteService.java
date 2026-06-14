package com.vitalistech.emergencysystem.service;

import com.vitalistech.emergencysystem.model.Paciente;
import com.vitalistech.emergencysystem.patterns.singleton.LoggerSingleton;
import com.vitalistech.emergencysystem.patterns.decorator.Atendimento;
import com.vitalistech.emergencysystem.patterns.decorator.AtendimentoBasico;
import com.vitalistech.emergencysystem.patterns.decorator.AtendimentoPrioritario;
import com.vitalistech.emergencysystem.patterns.template.AtendimentoTemplate;
import com.vitalistech.emergencysystem.patterns.template.AtendimentoUrgente;
import com.vitalistech.emergencysystem.repository.PacienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public List<Paciente> listar() {
        return repository.findAll();
    }

    public Paciente salvar(Paciente paciente) {

        // Padrão Singleton: utilizado para centralizar os logs do sistema,
        // garantindo uma única instância do objeto Logger.
        LoggerSingleton.getInstance()
                .log("Paciente cadastrado: " + paciente.getNome());

        // Padrão Decorator: adiciona funcionalidades extras ao atendimento
        // sem alterar a implementação da classe AtendimentoBasico.
        Atendimento atendimento = new AtendimentoBasico();
        atendimento = new AtendimentoPrioritario(atendimento);

        LoggerSingleton.getInstance()
                .log(atendimento.descricao());

        // Padrão Template Method: define um fluxo padrão de atendimento,
        // permitindo especializações através das subclasses.
        AtendimentoTemplate fluxo = new AtendimentoUrgente();
        fluxo.executarAtendimento();

        return repository.save(paciente);
    }

    public Paciente buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Paciente atualizar(Long id, Paciente paciente) {

        Paciente existente = buscarPorId(id);

        if (existente != null) {
            existente.setNome(paciente.getNome());
            existente.setEmail(paciente.getEmail());
            existente.setTelefone(paciente.getTelefone());
            existente.setSintomas(paciente.getSintomas());

            LoggerSingleton.getInstance()
                    .log("Paciente atualizado: " + existente.getNome());

            return repository.save(existente);
        }

        return null;
    }

    public void excluir(Long id) {

        LoggerSingleton.getInstance()
                .log("Paciente removido. ID: " + id);

        repository.deleteById(id);
    }
}