package com.vitalistech.emergencysystem.repository;

import com.vitalistech.emergencysystem.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, String> {

}