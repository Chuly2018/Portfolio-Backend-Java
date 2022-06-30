package com.proyecto.Portfolio.service;

import com.proyecto.Portfolio.model.experiencia_laboral;
import java.util.List;

public interface IExperienciaService {
    
    public List<experiencia_laboral> verExperiencia ();
    
    public void crearExperiencia (experiencia_laboral per);
    
    public void borrarExperiencia (Long id);
    
    public experiencia_laboral buscarExperiencia (Long id);
}



