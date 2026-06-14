package com.vitalistech.emergencysystem.controller;

import com.vitalistech.emergencysystem.model.Paciente;
import com.vitalistech.emergencysystem.service.PacienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
@CrossOrigin("*")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @GetMapping
    public List<Paciente> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Paciente buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Paciente salvar(@RequestBody Paciente paciente) {
        return service.salvar(paciente);
    }

    @PutMapping("/{id}")
    public Paciente atualizar(@PathVariable Long id,
                              @RequestBody Paciente paciente) {
        return service.atualizar(id, paciente);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}