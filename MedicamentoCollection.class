package com.vitalistech.emergencysystem.service;

import com.vitalistech.emergencysystem.model.Medicamento;
import com.vitalistech.emergencysystem.patterns.iterator.MedicamentoCollection;
import com.vitalistech.emergencysystem.repository.MedicamentoRepository;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoService {

    @Autowired
    private MedicamentoRepository repository;

    public List<Medicamento> listar() {

        // Padrão Iterator: permite percorrer a coleção de medicamentos
        // sem expor a estrutura interna de armazenamento.
        MedicamentoCollection collection = new MedicamentoCollection();

        List<Medicamento> lista = repository.findAll();

        for (Medicamento medicamento : lista) {
            collection.adicionar(medicamento);
        }

        Iterator<Medicamento> iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getDescricao());
        }

        return lista;
    }

    public Medicamento salvar(Medicamento medicamento) {
        return repository.save(medicamento);
    }

    public Medicamento buscarPorId(String id) {
        return repository.findById(id).orElse(null);
    }

    public Medicamento atualizar(String id, Medicamento medicamento) {

        Medicamento existente = buscarPorId(id);

        if (existente != null) {
            existente.setDescricao(medicamento.getDescricao());
            existente.setPrincipioAtivo(medicamento.getPrincipioAtivo());
            existente.setExcipientes(medicamento.getExcipientes());
            existente.setAdministracao(medicamento.getAdministracao());

            return repository.save(existente);
        }

        return null;
    }

    public void excluir(String id) {
        repository.deleteById(id);
    }
}