/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.services;
import asocentro.sgv.model.Funcionario;
import asocentro.sgv.repository.RepositorioFuncionario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabrielroa
 */
@Service
public class ServicioFuncionario {
    @Autowired
    
    private RepositorioFuncionario funcionarioRepository;
    
    public List <Funcionario> getAll(){
        return funcionarioRepository.getAll();
    }
    
    public Optional <Funcionario> getFuncionario(int funcionarioId){
        return funcionarioRepository.getFuncionario(funcionarioId);
    }
    
    public Funcionario save (Funcionario funcionario){
        if (funcionario.getIdFuncionario()==null){
            return funcionarioRepository.save(funcionario);
        } else {
            Optional <Funcionario> f=funcionarioRepository.getFuncionario(funcionario.getIdFuncionario());
            if (f.isEmpty()){
                return funcionarioRepository.save(funcionario);
            } else {
                return funcionario;
            }
        }
    }
    
    public Funcionario update (Funcionario funcionario){
        if (funcionario.getIdFuncionario()!=null){
            Optional <Funcionario> u=funcionarioRepository.getFuncionario(funcionario.getIdFuncionario());
            if (!u.isEmpty()){
                if (funcionario.getCategoria()!=null){
                    u.get().setCategoria(funcionario.getCategoria());
                }
                if (funcionario.getPlacaVehiculoEncargado()!=null){
                    u.get().setPlacaVehiculoEncargado(funcionario.getPlacaVehiculoEncargado());
                }
                funcionarioRepository.save(u.get());
                return u.get();
            } else {
                return funcionario;
            }
        }else{
            return funcionario;
        }
    }
    
    public boolean deleteFuncionario (int funcionarioId){
        Boolean aBoolean = getFuncionario(funcionarioId).map(funcionario ->{
            funcionarioRepository.detele(funcionario);
            return true;
        }).orElse(false);
        return aBoolean;
        }
    
}
