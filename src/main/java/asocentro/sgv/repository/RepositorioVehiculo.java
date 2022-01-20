/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.repository;

import asocentro.sgv.interfaces.InterfazVehiculo;
import asocentro.sgv.model.Vehiculo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gabrielroa
 */
/*componente de spring que permite hacer transacciones con la DB, traer, llevar info, etc.*/
@Repository 
public class RepositorioVehiculo {
    /*para hacer que el framework sea quien se encargue de inicializar se utiliza el autowired,solo se utiliza dentro de componentes de Spring en este caso "Repository"*/
    @Autowired
    private InterfazVehiculo vehiculoCrudRepository;
    
    /*metodo que entrega como una lista todos los elementos que tiene la BD*/ 
    public List <Vehiculo> getAll(){
        return (List<Vehiculo>) vehiculoCrudRepository.findAll();
    }
    
    /*objeto optional : para no trabajar con null,si hay informacion la entrega de lo contrario se entrega el objeto asi no lo encuentre en la BD*/
    
    public Optional<Vehiculo> getVehiculo(int id){
        return vehiculoCrudRepository.findById(id);
    }
    
    public Vehiculo save(Vehiculo v){
        return vehiculoCrudRepository.save(v);
    }
}
