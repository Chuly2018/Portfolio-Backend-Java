package com.proyecto.Portfolio.service;

import com.proyecto.Portfolio.model.Cuenta;
import com.proyecto.Portfolio.repository.CuentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaService implements ICuentasService{

    @Autowired
    public CuentaRepository cuentaRepo;
    
    @Override
    public List<Cuenta> verCuentas() {
        return cuentaRepo.findAll();
    }

    @Override
    public void crearCuentas(Cuenta per) {
        cuentaRepo.save(per);
    }

    @Override
    public void borrarCuenta(Long id) {
        cuentaRepo.deleteById(id);
    }

    @Override
    public Cuenta buscarCuenta(Long id) {
        return cuentaRepo.findById(id).orElse(null);
    }
  
}
