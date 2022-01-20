/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.services;

import asocentro.sgv.model.Vehiculo;
import asocentro.sgv.repository.RepositorioVehiculo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabrielroa
 */
/*Llamados logica del negocio*/
@Service
public class ServicioVehiculo {
    
    @Autowired /*instanciar objetos*/
    private RepositorioVehiculo vehiculoRepository;
    
    public List <Vehiculo> getAll(){
        return vehiculoRepository.getAll();
    }
    
    public Optional <Vehiculo>getVehiculo(int id){
        return vehiculoRepository.getVehiculo(id);
    }
    /*metodo para verificar si vehiculo no tiene id,y es nuevo lo guarde, pero si no quiere decir que ya existe o que no existe.*/ 
    public Vehiculo save(Vehiculo v){
        if(v.getId()==null){
            return vehiculoRepository.save(v);
        }else{    
            Optional<Vehiculo> vaux = vehiculoRepository.getVehiculo(v.getId());
            if (vaux.isEmpty()){
                return vehiculoRepository.save(v);
            }else{
                return v;
            }
        }
    }
    
    
}
