package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Dueno;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    DuenoJpaController duenoJpa = new DuenoJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void Guardar(Dueno dueno, Mascota mascota) {
        // Crea en la bd Dueno
        duenoJpa.create(dueno);
        // Crea en la bd mascota
        mascotaJpa.create(mascota);
    }

    public List<Mascota> TraerMascotas() {
        return mascotaJpa.findMascotaEntities();
    }
    
    public Mascota TraerMascota(int idMascota){
        return mascotaJpa.findMascota(idMascota);
    }
    
    public void BorrarMascota(int idMascota){
        try {
            mascotaJpa.destroy(idMascota);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }

    public void ModificarMascota(Mascota mascota) {
        try {
            mascotaJpa.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Dueno TraerDueno(int idDueño) {
        return duenoJpa.findDueno(idDueño);
    }

    public void ModificarDueno(Dueno dueno) {
        try {
            duenoJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}