package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "IdMascota")
    private int idMascota;
    @Column(name = "NombreMascota", columnDefinition = "VARCHAR(20) NOT NULL CHECK (NombreMascota REGEXP '^[a-zA-Zá-úÁ-ÚñÑ ]*$')")
    private String nombreMascota;
    @Column(name = "RazaMascota", columnDefinition = "VARCHAR(20) NOT NULL CHECK (RazaMascota REGEXP '^[a-zA-Zá-úÁ-ÚñÑ ]*$')")
    private String razaMascota;
    @Column(name = "ColorMascota", columnDefinition = "VARCHAR(50) NOT NULL CHECK (ColorMascota REGEXP '^[a-zA-Zá-úÁ-ÚñÑ ]*$')")
    private String colorMascota;
    @Column(name = "Alergico", columnDefinition = "VARCHAR(2) NOT NULL CHECK (Alergico REGEXP '^[a-zA-Zá-úÁ-ÚñÑ ]*$')")
    private String alergico;
    @Column(name = "AtencionEspecial", columnDefinition = "VARCHAR(2) NOT NULL CHECK (AtencionEspecial REGEXP '^[a-zA-Zá-úÁ-ÚñÑ ]*$')")
    private String atencionEspecial;
    @Column(name = "Observaciones", columnDefinition = "VARCHAR(200) NOT NULL")
    private String observaciones;
    
    @OneToOne
    private Dueno dueno;
    
    public Mascota() {
    }

    public Mascota(String nombreMascota, String razaMascota, String colorMascota, String alergico, String atencionEspecial, String observaciones, Dueno dueno) {
        this.nombreMascota = nombreMascota;
        this.razaMascota = razaMascota;
        this.colorMascota = colorMascota;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.observaciones = observaciones;
        this.dueno = dueno;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRazaMascota() {
        return razaMascota;
    }

    public void setRazaMascota(String razaMascota) {
        this.razaMascota = razaMascota;
    }

    public String getColorMascota() {
        return colorMascota;
    }

    public void setColorMascota(String colorMascota) {
        this.colorMascota = colorMascota;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }
    
}