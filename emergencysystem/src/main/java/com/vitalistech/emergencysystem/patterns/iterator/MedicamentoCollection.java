package com.vitalistech.emergencysystem.patterns.iterator;

import com.vitalistech.emergencysystem.model.Medicamento;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Padrão Iterator: percorre uma coleção de medicamentos.
public class MedicamentoCollection {

    private List<Medicamento> medicamentos = new ArrayList<>();

    public void adicionar(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    public Iterator<Medicamento> iterator() {
        return medicamentos.iterator();
    }
}