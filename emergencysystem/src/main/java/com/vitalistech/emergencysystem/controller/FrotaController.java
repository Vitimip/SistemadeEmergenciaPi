package com.vitalistech.emergencysystem.controller;

import com.vitalistech.emergencysystem.model.Frota;
import com.vitalistech.emergencysystem.service.FrotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/frota")
@CrossOrigin("*")
public class FrotaController {

    @Autowired
    private FrotaService service;

    @GetMapping
    public List<Frota> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Frota buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Frota salvar(@RequestBody Frota frota) {
        return service.salvar(frota);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}