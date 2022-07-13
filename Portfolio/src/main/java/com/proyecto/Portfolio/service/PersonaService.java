package com.proyecto.Portfolio.service;

import com.proyecto.Portfolio.model.Persona;
import com.proyecto.Portfolio.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class PersonaService implements IPersonaService {
    
    @Autowired
    public PersonaRepository persoRepo;

    
    public List<Persona> list() {
        return persoRepo.findAll();
    }
    
    
    public Optional<Persona> getOne(int id) {
        return persoRepo.findById(id);
    }
    
    public Optional<Persona> getByNombre(String nombre) {
        return persoRepo.findByNombre(nombre);
    }
    
    public void save (Persona pers) {
        persoRepo.save(pers);
    }
    
    
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    
    public void borrarPersona(Integer id) {
        persoRepo.deleteById(id);
    }

    
    public Persona buscarPersona(Integer id) {
        return persoRepo.findById(id).orElse(null);
    }
    
    public boolean existsById(int id) {
        return persoRepo.existsById(id);
    }
    
    public boolean existsByNombre(String nombre) {
        return persoRepo.existsByNombre(nombre);
    }

    @Override
    public List<Persona> verPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrarPersona(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Persona buscarPersona(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
