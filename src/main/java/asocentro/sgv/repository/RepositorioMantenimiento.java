/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.repository;

import asocentro.sgv.interfaces.InterfazMantenimiento;
import asocentro.sgv.model.Mantenimiento;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gabrielroa
 */
@Repository
public class RepositorioMantenimiento {
    @Autowired
    private InterfazMantenimiento mantenimientoCrudRepository;
    
    public List <Mantenimiento> getAll(){
        return (List<Mantenimiento>) mantenimientoCrudRepository.findAll();
    }
    
    public Optional <Mantenimiento> getMantenimiento(int id){
        return mantenimientoCrudRepository.findById(id);
    }
    
    public Mantenimiento save(Mantenimiento mantenimiento){
        return mantenimientoCrudRepository.save(mantenimiento);
    }
    
    public void delete (Mantenimiento mantenimiento){
        mantenimientoCrudRepository.delete(mantenimiento);
    }
    
}
