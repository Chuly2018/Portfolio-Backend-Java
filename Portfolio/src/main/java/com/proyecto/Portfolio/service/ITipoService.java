package com.proyecto.Portfolio.service;

import com.proyecto.Portfolio.model.tipo_empleo;
import java.util.List;

public interface ITipoService {
    
    public List<tipo_empleo> verTipo ();
    
    public void creartipo (tipo_empleo per);
    
    public void borrarTipo (Long id);
    
    public tipo_empleo buscarTipo (Long id);

}
