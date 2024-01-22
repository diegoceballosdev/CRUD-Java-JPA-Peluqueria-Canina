package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controladoraPers = new ControladoraPersistencia();  
    
    // ------------------------------------ CREATE ------------------------------------

    public void guardarDatos(String nombreMasco, String raza, String color, String observaciones, String alergico, String atEspecial, String nombreDuenio, String celDuenio) {      
        
        //CREAMOS OBJETO "MASCOTA":
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMasco);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atEspecial);
        mascota.setObservaciones(observaciones);
                
        //CREAMOS OBJETO "DUENIO":
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        duenio.setMascota(mascota);

        controladoraPers.guardarDatos(duenio, mascota);
    } 
    
    // ------------------------------------ READ ------------------------------------

    public Duenio consultarDuenio(int idDuenio) {
        return controladoraPers.consultarDuenio(idDuenio);
    }

    public Mascota consultarMascota(int idMascota) {
        return controladoraPers.consultarMascota(idMascota);
    }

    public List<Duenio> consultarListaDuenios() {
        return controladoraPers.consultarListaDuenios();
    }
 
    // ------------------------------------ UPDATE ------------------------------------
    
    public void modificarDatos(Duenio duenio, String nombreMasco, String raza, String color, 
            String observaciones, String alergico, String atEspecial, String nombreDuenio, String celDuenio) {
        
        //SETEAR LOS DATOS DE DUENIO POR LOS DATOS NUEVOS Y LLAMAR A LA CONTROLADROA DE PERSISTENCIA:
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        this.modificarDuenio(duenio);
        
        //OBTENER MASCOTA MEDIANTE ID, SETEAR Y REENVIAR A PERSISTENCIA PARA MODIFICAR BD
        Mascota mascota = controladoraPers.consultarMascota(duenio.getMascota().getNumCliente());
        mascota.setNombre(nombreMasco);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atEspecial);
        mascota.setAtencionEspecial(atEspecial);
        this.modificarMascota(mascota);
    }

    private void modificarDuenio(Duenio duenio) {
        controladoraPers.modificarDuenio(duenio);
    }

    private void modificarMascota(Mascota mascota) {
        controladoraPers.modificarMascota(mascota);
    }
    
    // ------------------------------------ DELETE ------------------------------------
    
    public void borrarDatos(int idMascota, int idDuenio) {
        this.borrarDuenio(idDuenio);
        this.borrarMascota(idMascota);
    }

    private void borrarDuenio(int idDuenio) {
        controladoraPers.borrarDuenio(idDuenio);
    }

    private void borrarMascota(int idMascota) {
        controladoraPers.borrarMascota(idMascota);
    }
  
}
