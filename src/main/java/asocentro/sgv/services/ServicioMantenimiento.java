/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.services;

import asocentro.sgv.model.Mantenimiento;
import asocentro.sgv.repository.RepositorioMantenimiento;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabrielroa
 */
@Service
public class ServicioMantenimiento {
    @Autowired
    private RepositorioMantenimiento mantenimientoRepository;
    
    public List <Mantenimiento> getAll(){
        return mantenimientoRepository.getAll();
    }
    
    public Optional <Mantenimiento> getMantenimiento(int mantenimientoId){
        return mantenimientoRepository.getMantenimiento(mantenimientoId);
    }
    
    public Mantenimiento save (Mantenimiento mantenimiento){
        if (mantenimiento.getIdMantenimiento()==null){
            return mantenimientoRepository.save(mantenimiento);
        }else{
            Optional <Mantenimiento> m=mantenimientoRepository.getMantenimiento(mantenimiento.getIdMantenimiento());
            if (m.isEmpty()){
                return mantenimientoRepository.save(mantenimiento);
            } else {
                return mantenimiento;
            }
        }   
    }
    
    public Mantenimiento update (Mantenimiento mantenimiento){
        if (mantenimiento.getIdMantenimiento() != null){
            Optional<Mantenimiento> m=mantenimientoRepository.getMantenimiento(mantenimiento.getIdMantenimiento());
            if (!m.isEmpty()){
                if (mantenimiento.getObservaciones()!=null){
                    m.get().setObservaciones(mantenimiento.getObservaciones());
                }
                mantenimientoRepository.save(m.get());
                return m.get();
            } else {
                return mantenimiento;
            }
        }else{
            return mantenimiento;
        }
    }
    public boolean deleteMantenimiento (int mantenimientoId){
        Boolean borrar = getMantenimiento(mantenimientoId).map(mantenimiento ->{
            mantenimientoRepository.delete(mantenimiento);
            return true;
        }).orElse(false);
        return borrar;
        }
    
}
