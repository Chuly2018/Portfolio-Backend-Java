package com.proyecto.Portfolio.Controller;

import com.proyecto.Portfolio.model.Cuenta;
import com.proyecto.Portfolio.model.Persona;
import com.proyecto.Portfolio.model.experiencia_laboral;
import com.proyecto.Portfolio.model.tipo_empleo;
import com.proyecto.Portfolio.service.ICuentasService;
import com.proyecto.Portfolio.service.IExperienciaService;
import com.proyecto.Portfolio.service.IPersonaService;
import com.proyecto.Portfolio.service.ITipoService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {
    
   @Autowired
   private IPersonaService persoServ;
    
   @Autowired
   private IExperienciaService expeServ;
   
   @Autowired
   private ITipoService tipoServ;
   
   @Autowired
   private ICuentasService cuentasServ;
     
 
    @PostMapping ("/personas/new")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/personas/ver")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/personas/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }
    
 
        @PostMapping ("/new/experiencia")
    public void agregarExperiencia (@RequestBody experiencia_laboral pers) {
        expeServ.crearExperiencia(pers);
    }
    
    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<experiencia_laboral> verExperiencia () {
        return expeServ.verExperiencia();
    }
    
    @DeleteMapping ("/deleteExperiencia/{id}")
    public void borrarExperiencia (@PathVariable Long id) {
        expeServ.borrarExperiencia(id);
    }
    
    @PostMapping ("/new/tipo")
    public void agregarTipo(@RequestBody tipo_empleo pers) {
        tipoServ.creartipo(pers);
    }
    
    @GetMapping ("/ver/tipo")
    @ResponseBody
    public List<tipo_empleo> verTipo () {
        return tipoServ.verTipo();
    }
    
    @DeleteMapping ("/deleteTipo/{id}")
    public void borrarTipo (@PathVariable Long id) {
        tipoServ.borrarTipo(id);
    }
    
    @PostMapping ("/cuenta/new")
    public void agregarCuentas(@RequestBody Cuenta pers) {
        cuentasServ.crearCuentas(pers);
    }
    
    @GetMapping ("/cuenta/new")
    @ResponseBody
    public List<Cuenta> verCuenta () {
        return cuentasServ.verCuentas();
    }
    
    @DeleteMapping ("/cuenta/delete/{id}")
    public void borrarCuenta (@PathVariable Long id) {
        cuentasServ.borrarCuenta(id);
    }
}