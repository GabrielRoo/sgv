/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.repository;

import asocentro.sgv.interfaces.InterfazDocumentacion;
import asocentro.sgv.model.Documentacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gabrielroa
 */
@Repository
public class RepositorioDocumentacion {
    @Autowired
    
    private InterfazDocumentacion documentacionCrudRepository;
    
    public List <Documentacion> getAll(){
        return (List <Documentacion>) documentacionCrudRepository.findAll();
    }
    
    public Optional <Documentacion> getDocumentacion(int id){
        return documentacionCrudRepository.findById(id);
    }
    
    public Documentacion save(Documentacion documentacion){
        return documentacionCrudRepository.save(documentacion);
    }
    
    public void delete (Documentacion documentacion){
        documentacionCrudRepository.delete(documentacion);
    }
    
}
