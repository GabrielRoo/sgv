/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author gabrielroa
 */
@Entity
@Table (name = "mantenimiento")
public class Mantenimiento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer idMantenimiento;
    private String placaMantenimiento;
    private String fecha;
    private String observaciones;
    
    public Integer getIdMantenimiento() {
        return idMantenimiento;
    }

    public void setIdMantenimiento(Integer idMantenimiento) {
        this.idMantenimiento = idMantenimiento;
    }

    public String getPlacaMantenimiento() {
        return placaMantenimiento;
    }

    public void setPlacaMantenimiento(String placaMantenimiento) {
        this.placaMantenimiento = placaMantenimiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
    
    
}
