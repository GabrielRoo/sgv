/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.controller;

import asocentro.sgv.model.Mantenimiento;
import asocentro.sgv.services.ServicioMantenimiento;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gabrielroa
 */
@RestController
@RequestMapping("/api/Mantenimiento")
@CrossOrigin(origins ="*", methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE}) 
public class ControladorMantenimiento {
    @Autowired
    private ServicioMantenimiento mantenimientoService;
    @GetMapping ("/all")
    
    public List <Mantenimiento> getMantenimientos(){
        return mantenimientoService.getAll();
    }
    
    @GetMapping ("/{id}")
    public Optional <Mantenimiento> getMantenimiento (@PathVariable("id") int mantenimientoId){
        return mantenimientoService.getMantenimiento(mantenimientoId);
    }
    
    @PostMapping ("/save")
    @ResponseStatus (HttpStatus.CREATED)
    public Mantenimiento save(@RequestBody Mantenimiento mantenimiento){
        return mantenimientoService.save(mantenimiento);
    }
    
    @PutMapping ("/update")
    @ResponseStatus (HttpStatus.CREATED)
    public Mantenimiento update (@RequestBody Mantenimiento mantenimiento){
        return mantenimientoService.update(mantenimiento);
    }
    
    @DeleteMapping ("/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int mantenimientoId){
        return mantenimientoService.deleteMantenimiento(mantenimientoId);
    }
    
    
}
