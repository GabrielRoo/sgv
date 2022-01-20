/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.interfaces;

import asocentro.sgv.model.Vehiculo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author gabrielroa
 */
/*Crud repository es un componente de spring que se encarga de gestionar acciones CRUD en la base de datos*/
    
public interface InterfazVehiculo extends CrudRepository<Vehiculo,Integer> {
    
    
}
