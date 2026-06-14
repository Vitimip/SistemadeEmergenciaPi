package com.vitalistech.emergencysystem.service;

import com.vitalistech.emergencysystem.model.Ocorrencia;
import com.vitalistech.emergencysystem.patterns.adapter.LocalizacaoService;
import com.vitalistech.emergencysystem.patterns.adapter.ViaCepAdapter;
import com.vitalistech.emergencysystem.patterns.factory.AcidenteFactory;
import com.vitalistech.emergencysystem.patterns.factory.OcorrenciaFactory;
import com.vitalistech.emergencysystem.patterns.singleton.LoggerSingleton;
import com.vitalistech.emergencysystem.repository.OcorrenciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OcorrenciaService {

    @Autowired
    private OcorrenciaRepository repository;

    public List<Ocorrencia> listar() {
        return repository.findAll();
    }

    public Ocorrencia salvar(Ocorrencia ocorrencia) {

        // Padrão Factory Method: responsável por encapsular
        // a criação de objetos do tipo Ocorrencia.
        OcorrenciaFactory factory = new AcidenteFactory();
        Ocorrencia novaOcorrencia = factory.criarOcorrencia();

        novaOcorrencia.setEndereco(ocorrencia.getEndereco());

        // Padrão Adapter: integra uma API externa de consulta
        // de endereço utilizando uma interface compatível com o sistema.
        LocalizacaoService localizacao = new ViaCepAdapter();
        String endereco = localizacao.buscarEndereco("74000-000");

        LoggerSingleton.getInstance().log(endereco);

        return repository.save(novaOcorrencia);
    }

    public Ocorrencia buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Ocorrencia atualizar(Long id, Ocorrencia ocorrencia) {

        Ocorrencia existente = buscarPorId(id);

        if (existente != null) {
            existente.setEndereco(ocorrencia.getEndereco());
            existente.setTipo(ocorrencia.getTipo());
            existente.setStatus(ocorrencia.getStatus());

            return repository.save(existente);
        }

        return null;
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}