package com.proyecto.Portfolio.service;

import com.proyecto.Portfolio.model.Cuenta;
import java.util.List;

public interface ICuentasService {
    
    public List<Cuenta> verCuentas ();
    
    public void crearCuentas (Cuenta per);
    
    public void borrarCuenta (Long id);
    
    public Cuenta buscarCuenta (Long id);   
}
