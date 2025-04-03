package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void GuardarDatos(String nombreMascota, String razaMascota, String colorMascota, String observaciones, String alergico, String atencion, String nombreDueno, String celDueno, String dirDueno) {
        
        //Creamos Dueno y asignamos valores
        Dueno dueno = new Dueno();
        dueno.setNombreDueno(nombreDueno);
        dueno.setCelDueno(celDueno);
        dueno.setDireccionDueno(dirDueno);
        
        Mascota mascota = new Mascota();
        mascota.setNombreMascota(nombreMascota);
        mascota.setRazaMascota(razaMascota);
        mascota.setColorMascota(colorMascota);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencion);
        mascota.setObservaciones(observaciones);
        mascota.setDueno(dueno);
        
        controlPersis.Guardar(dueno, mascota);
    }

    public List<Mascota> TraerMascotas(){
        return controlPersis.TraerMascotas();
    }
    
    public Mascota TraerMascota(int idMascota){
        return controlPersis.TraerMascota(idMascota);
    }
    
    public void BorrarMascota(int idMascota){
        controlPersis.BorrarMascota(idMascota);
    }

    public void ModificarMascota(Mascota mascota, String nombreMascota, String razaMascota, String colorMascota, String observaciones, String alergico, String atencion, String nombreDueno, String celDueno, String dirDueno) {
        
        mascota.setNombreMascota(nombreMascota);
        mascota.setRazaMascota(razaMascota);
        mascota.setColorMascota(colorMascota);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencion);
        mascota.setObservaciones(observaciones);
        
        //Modifica mascota
        controlPersis.ModificarMascota(mascota);
        
        Dueno dueno = this.BuscarDueno(mascota.getDueno().getIdDueno());
        
        //Seteo nuevos valores del dueño
        dueno.setNombreDueno(nombreDueno);
        dueno.setCelDueno(celDueno);
        dueno.setDireccionDueno(dirDueno);
        
        //Llamar a modicar dueno
        this.ModificarDueno(dueno); 
        
    }

    private Dueno BuscarDueno(int idDueno) {
        return controlPersis.TraerDueno(idDueno);
    }

    private void ModificarDueno(Dueno dueno) {
        controlPersis.ModificarDueno(dueno);
    }
}