/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.controller;

import asocentro.sgv.model.Vehiculo;
import asocentro.sgv.services.ServicioVehiculo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gabrielroa
 */
/*El controlador recibe las peticiones que lleguen de POSTMAN,frontend, app movil, es quien atiende la peticion*/
@RestController
@RequestMapping ("/api/Vehiculo")/*Es donde se establece la URL mediante la cual el controlador es alcanzado*/
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ControladorVehiculo {
    
    @Autowired
    private ServicioVehiculo vehiculoService;
    
    @GetMapping("/all")
    public List<Vehiculo> getVehiculos(){
        return vehiculoService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Vehiculo> getVehiculo(@PathVariable("id")int id){
        return vehiculoService.getVehiculo(id);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Vehiculo save(@RequestBody Vehiculo v){
        return vehiculoService.save(v);
    }
    
}
