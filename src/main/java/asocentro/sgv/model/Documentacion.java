/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asocentro.sgv.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
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
@Table (name = "documentacion")
public class Documentacion implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    private Integer idDocumentacion;
    private String numeroPolizaSoat;
    private Date fechaExpSoat;
    private Date fechaVenSoat;
    private String numeroControlRtm;
    private Date fechaExpRtm;
    private Date fechaVenRtm;
    private String numeroLt;
    private Date fechaExpLt;

    public Integer getIdDocumentacion() {
        return idDocumentacion;
    }

    public void setIdDocumentacion(Integer idDocumentacion) {
        this.idDocumentacion = idDocumentacion;
    }

    public String getNumeroPolizaSoat() {
        return numeroPolizaSoat;
    }

    public void setNumeroPolizaSoat(String numeroPolizaSoat) {
        this.numeroPolizaSoat = numeroPolizaSoat;
    }

    public Date getFechaExpSoat() {
        return fechaExpSoat;
    }

    public void setFechaExpSoat(Date fechaExpSoat) {
        this.fechaExpSoat = fechaExpSoat;
    }

    public Date getFechaVenSoat() {
        return fechaVenSoat;
    }

    public void setFechaVenSoat(Date fechaVenSoat) {
        this.fechaVenSoat = fechaVenSoat;
    }

    public String getNumeroControlRtm() {
        return numeroControlRtm;
    }

    public void setNumeroControlRtm(String numeroControlRtm) {
        this.numeroControlRtm = numeroControlRtm;
    }

    public Date getFechaExpRtm() {
        return fechaExpRtm;
    }

    public void setFechaExpRtm(Date fechaExpRtm) {
        this.fechaExpRtm = fechaExpRtm;
    }

    public Date getFechaVenRtm() {
        return fechaVenRtm;
    }

    public void setFechaVenRtm(Date fechaVenRtm) {
        this.fechaVenRtm = fechaVenRtm;
    }

    public String getNumeroLt() {
        return numeroLt;
    }

    public void setNumeroLt(String numeroLt) {
        this.numeroLt = numeroLt;
    }

    public Date getFechaExpLt() {
        return fechaExpLt;
    }

    public void setFechaExpLt(Date fechaExpLt) {
        this.fechaExpLt = fechaExpLt;
    }
        
}
