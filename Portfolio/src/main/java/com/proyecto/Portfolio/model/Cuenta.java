package com.proyecto.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Cuenta {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @NotNull
    private Long id;
    
    @NotEmpty
    private String email;
    
    @NotEmpty
    private String contraseña;

    
    
    public Cuenta() {
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    public Cuenta(Long id, String email, String contraseña) {
        this.id = id;
        this.email = email;
        this.contraseña = contraseña;
  
}
}
