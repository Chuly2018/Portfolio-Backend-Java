package com.proyecto.Portfolio.repository;

import com.proyecto.Portfolio.model.experiencia_laboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <experiencia_laboral, Long> {
    
}
