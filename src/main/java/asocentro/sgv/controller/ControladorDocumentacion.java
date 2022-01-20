/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.controller;

import asocentro.sgv.model.Documentacion;
import asocentro.sgv.services.ServicioDocumentacion;
import java.util.List;
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
@RequestMapping ("/api/Documentacion")
@CrossOrigin (origins ="*", methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE}) 
public class ControladorDocumentacion {
    
    @Autowired
    private ServicioDocumentacion documentacionService;
    
    @GetMapping("/all")
    public List <Documentacion> getDocumentacion(){
        return documentacionService.getAll();
    }
    
    @PostMapping("/save")
    @ResponseStatus (HttpStatus.CREATED)
    public Documentacion save(@RequestBody Documentacion documentacion){
        return documentacionService.save(documentacion);
    }
    
    /*@PutMapping ("/update")
    @ResponseStatus (HttpStatus.CREATED)
    public Documentacion update (@RequestBody Documentacion documentacion){
        return documentacionService.update(documentacion);
    }*/
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int documentacionId){
        return documentacionService.deleteDocumentation(documentacionId);
    }
}
