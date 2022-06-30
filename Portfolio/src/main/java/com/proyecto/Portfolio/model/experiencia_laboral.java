package com.proyecto.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class experiencia_laboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nombreEmpresa;
    private Boolean esTrabajoActual;
    private String fechaInicio; 
    private String fechaFin;
    private String descripcion;
    private Long Persona_id;
    private Long tipo_empleo_id;
    
    
    public experiencia_laboral() {
    }
    
    public experiencia_laboral(Long id, String nombreEmpresa, Boolean esTrabajoActual,String fechaInicio, String fechaFin, String descripcion, Long Persona_id, Long tipo_empleo_id) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.Persona_id = Persona_id;
        this.tipo_empleo_id = tipo_empleo_id;
    }
}






