/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.services;

import asocentro.sgv.model.Documentacion;
import asocentro.sgv.repository.RepositorioDocumentacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabrielroa
 */
@Service
public class ServicioDocumentacion {
    @Autowired
    
    private RepositorioDocumentacion documentacionRepository;
    
    public List <Documentacion> getAll(){
        return documentacionRepository.getAll();
    }
    
    public Optional <Documentacion> getDocumentacion(int documentacionId){
        return documentacionRepository.getDocumentacion(documentacionId);
    }
    
    public Documentacion save (Documentacion documentacion){
        if (documentacion.getIdDocumentacion()==null){
            return documentacionRepository.save(documentacion);
        }else{
            Optional <Documentacion> d=documentacionRepository.getDocumentacion(documentacion.getIdDocumentacion());
            if (d.isEmpty()){
                return documentacionRepository.save(documentacion);
            }else{
                return documentacion;
            }
        }
    }
    
    public boolean deleteDocumentation (int documentacionId){
        Boolean borrar = getDocumentacion (documentacionId).map(documentacion ->{
            documentacionRepository.delete(documentacion);
            return true;
        }).orElse(false);
        return borrar;
        }
    
}
