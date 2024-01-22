package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    MascotaJpaController mascotaJpa = new MascotaJpaController();
    DuenioJpaController duenioJpa = new DuenioJpaController();

    
    // ------------------------------------ CREATE ------------------------------------
    
    public void guardarDatos(Duenio duenio, Mascota mascota) {

        //CREA LOS REGISTROS EN LA BD
        mascotaJpa.create(mascota);
        duenioJpa.create(duenio);
    }
    
    // ------------------------------------- READ -------------------------------------

    public Duenio consultarDuenio(int idDuenio) {
        return duenioJpa.findDuenio(idDuenio);
    }

    public Mascota consultarMascota(int idMascota) {
        return mascotaJpa.findMascota(idMascota);
    }
    
    public List<Duenio> consultarListaDuenios() {
        return duenioJpa.findDuenioEntities();
    }

    // ------------------------------------ UPDATE ------------------------------------
    
    public void modificarDuenio(Duenio duenio) {
        try {
            duenioJpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarMascota(Mascota mascota) {
        try {
            mascotaJpa.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // ------------------------------------ DELETE ------------------------------------    
    
    public void borrarDuenio(int idDuenio) {
        try {
            duenioJpa.destroy(idDuenio);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarMascota(int idMascota) {
        try {
            mascotaJpa.destroy(idMascota);

        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
