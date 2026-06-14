package com.vitalistech.emergencysystem.repository;

import com.vitalistech.emergencysystem.model.Frota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrotaRepository extends JpaRepository<Frota, Long> {

}