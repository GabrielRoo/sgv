/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author gabrielroa
 */
@Entity
@Table (name = "funcionarios")
public class Funcionario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer idFuncionario;
    private String numeroDocumento;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String numeroLicencia;
    private String categoria;
    private String restriccionesConductor;
    private String organismoTransito;
    private String placaVehiculoEncargado;
    
    
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getRestriccionesConductor() {
        return restriccionesConductor;
    }

    public void setRestriccionesConductor(String restriccionesConductor) {
        this.restriccionesConductor = restriccionesConductor;
    }

    public String getOrganismoTransito() {
        return organismoTransito;
    }

    public void setOrganismoTransito(String organismoTransito) {
        this.organismoTransito = organismoTransito;
    }

    public String getPlacaVehiculoEncargado() {
        return placaVehiculoEncargado;
    }

    public void setPlacaVehiculoEncargado(String placaVehiculoEncargado) {
        this.placaVehiculoEncargado = placaVehiculoEncargado;
    }

    
    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    
    
}
