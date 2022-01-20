/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.interfaces;

import asocentro.sgv.model.Funcionario;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author gabrielroa
 */
public interface InterfazFuncionario extends CrudRepository<Funcionario,Integer> {
    
}
