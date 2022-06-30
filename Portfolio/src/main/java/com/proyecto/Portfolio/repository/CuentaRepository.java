package com.proyecto.Portfolio.repository;

import com.proyecto.Portfolio.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository  extends JpaRepository <Cuenta, Long>{
    
}
