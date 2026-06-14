package com.vitalistech.emergencysystem.service;

import com.vitalistech.emergencysystem.model.Frota;
import com.vitalistech.emergencysystem.repository.FrotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrotaService {

    @Autowired
    private FrotaRepository repository;

    public List<Frota> listar() {
        return repository.findAll();
    }

    public Frota salvar(Frota frota) {
        return repository.save(frota);
    }

    public Frota buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}