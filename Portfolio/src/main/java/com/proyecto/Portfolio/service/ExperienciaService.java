package com.proyecto.Portfolio.service;

import com.proyecto.Portfolio.model.experiencia_laboral;
import com.proyecto.Portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository expeRepo;

    @Override
    public List<experiencia_laboral> verExperiencia() {
        return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(experiencia_laboral per) {
        expeRepo.save(per);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public experiencia_laboral buscarExperiencia(Long id) {
        return expeRepo.findById(id).orElse(null);
    }
    

}
