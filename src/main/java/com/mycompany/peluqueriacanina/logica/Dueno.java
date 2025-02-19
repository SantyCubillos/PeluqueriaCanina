package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dueno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "IdDueno")
    private int idDueno;
    @Column(name = "NombreDueno", columnDefinition = "VARCHAR(50) NOT NULL CHECK (NombreDueno REGEXP '^[a-zA-Zá-úÁ-ÚñÑ ]*$')")
    private String nombreDueno;
    @Column(name = "CelDueno", columnDefinition = "VARCHAR(10) NOT NULL CHECK (CelDueno REGEXP '^[0-9]*$')")
    private String celDueno;
    @Column(name = "DireccionDueno", columnDefinition = "VARCHAR(100) NOT NULL")
    private String direccionDueno;
   
    public Dueno() {
    }

    public Dueno(String nombreDueno, String celDueno, String direccionDueno) {
        this.nombreDueno = nombreDueno;
        this.celDueno = celDueno;
        this.direccionDueno = direccionDueno;
    }

    public int getIdDueno() {
        return idDueno;
    }

    public void setIdDueno(int idDueno) {
        this.idDueno = idDueno;
    }
    
    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }
    
    public String getCelDueno() {
        return celDueno;
    }

    public void setCelDueno(String celDueno) {
        this.celDueno = celDueno;
    }

    public String getDireccionDueno() {
        return direccionDueno;
    }

    public void setDireccionDueno(String direccionDueno) {
        this.direccionDueno = direccionDueno;
    }
    
    
}
