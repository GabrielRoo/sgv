/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.repository;

import asocentro.sgv.model.Funcionario;
import asocentro.sgv.interfaces.InterfazFuncionario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gabrielroa
 */
@Repository
public class RepositorioFuncionario {
    @Autowired
    
    private InterfazFuncionario funcionarioCrudRepository;
    
    public List <Funcionario> getAll(){
        return (List<Funcionario>) funcionarioCrudRepository.findAll();
    }
    
    public Optional <Funcionario> getFuncionario(int id){
        return funcionarioCrudRepository.findById(id);
    }
    public Funcionario save(Funcionario funcionario){
        return funcionarioCrudRepository.save(funcionario);
    }
    
    public void detele (Funcionario funcionario){
        funcionarioCrudRepository.delete(funcionario);
    }
}
