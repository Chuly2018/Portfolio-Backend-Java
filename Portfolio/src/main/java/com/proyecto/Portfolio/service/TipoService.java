package com.proyecto.Portfolio.service;

import com.proyecto.Portfolio.model.tipo_empleo;
import com.proyecto.Portfolio.repository.TipoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TipoService implements ITipoService{

    
    @Autowired
    public TipoRepository tipoRepo;
    
    @Override
    public List<tipo_empleo> verTipo() {
        return tipoRepo.findAll();
    }

    @Override
    public void creartipo(tipo_empleo per) {
        tipoRepo.save(per);
    }

    @Override
    public void borrarTipo(Long id) {
        tipoRepo.deleteById(id);
    }

    @Override
    public tipo_empleo buscarTipo(Long id) {
        return tipoRepo.findById(id).orElse(null);
    }
    
}
