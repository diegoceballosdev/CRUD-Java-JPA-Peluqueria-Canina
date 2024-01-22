package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Duenio implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int numDuenio;
    
    @Basic
    private String nombre;
    private String celDuenio;
    
    @OneToOne
    private Mascota mascota;

    public Duenio() {
    }

    public Duenio(int numDuenio, String nombre, String celDuenio, Mascota mascota) {
        this.numDuenio = numDuenio;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
        this.mascota = mascota;
    }

    public int getNumDuenio() {
        return numDuenio;
    }

    public void setNumDuenio(int numDuenio) {
        this.numDuenio = numDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Duenio{" + "numDuenio=" + numDuenio + ", nombre=" + nombre + ", celDuenio=" + celDuenio + ", mascota=" + mascota + '}';
    }

}
