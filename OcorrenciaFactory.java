package com.vitalistech.emergencysystem.controller;

import com.vitalistech.emergencysystem.model.Ocorrencia;
import com.vitalistech.emergencysystem.service.OcorrenciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ocorrencias")
@CrossOrigin("*")
public class OcorrenciaController {

    @Autowired
    private OcorrenciaService service;

    @GetMapping
    public List<Ocorrencia> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Ocorrencia buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Ocorrencia salvar(@RequestBody Ocorrencia ocorrencia) {
        return service.salvar(ocorrencia);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}