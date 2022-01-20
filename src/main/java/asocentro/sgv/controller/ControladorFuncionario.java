/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.controller;

import asocentro.sgv.model.Funcionario;
import asocentro.sgv.services.ServicioFuncionario;
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
@RequestMapping("api/Funcionario")
@CrossOrigin (origins ="*", methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE}) 
public class ControladorFuncionario {
    @Autowired
    private ServicioFuncionario funcionarioService;
    @GetMapping ("/all")
    public List <Funcionario> getFuncionarios(){
        return funcionarioService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional <Funcionario> getFuncionario (@PathVariable("id")int funcionarioId){
        return funcionarioService.getFuncionario(funcionarioId);
    }
    
    @PostMapping("/save")
    @ResponseStatus (HttpStatus.CREATED)
    public Funcionario save (@RequestBody Funcionario funcionario){
        return funcionarioService.save(funcionario);
    }
    
    @PutMapping("/update")
    @ResponseStatus (HttpStatus.CREATED)
    public Funcionario update (@RequestBody Funcionario funcionario){
        return funcionarioService.update(funcionario);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int funcionarioId){
        return funcionarioService.deleteFuncionario(funcionarioId);
    }
            
    
}
