package com.proyecto.Portfolio.repository;

import com.proyecto.Portfolio.model.tipo_empleo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoRepository extends JpaRepository <tipo_empleo, Long>{
    
}