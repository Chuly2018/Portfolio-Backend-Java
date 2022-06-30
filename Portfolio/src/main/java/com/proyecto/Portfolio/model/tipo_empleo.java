package com.proyecto.Portfolio.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

        
@Getter @Setter
@Entity
public class tipo_empleo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String nombreTipo;
    
    
    public tipo_empleo() {
    }
    
    public tipo_empleo(Long id, String nombreTipo) {
        this.id = id;
        this.nombreTipo = nombreTipo;
 
    }
}
