/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_kevinrodriguezdanielsagastume;

import java.util.Date;

/**
 *
 * @author Kevin
 */
public class equipos {
    protected String Nombre,estadio,pais,Nombre_de_Entrenador, Nombre_de_Dueño, Nombre_de_Mascota,Fecha_de_creacion,Color_principal;

    public equipos() {
    }

    public equipos(String Nombre, String estadio, String pais, String Nombre_de_Entrenador, String Nombre_de_Dueño, String Nombre_de_Mascota, String Fecha_de_creacion, String Color_principal) {
        this.Nombre = Nombre;
        this.estadio = estadio;
        this.pais = pais;
        this.Nombre_de_Entrenador = Nombre_de_Entrenador;
        this.Nombre_de_Dueño = Nombre_de_Dueño;
        this.Nombre_de_Mascota = Nombre_de_Mascota;
        this.Fecha_de_creacion = Fecha_de_creacion;
        this.Color_principal = Color_principal;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre_de_Entrenador() {
        return Nombre_de_Entrenador;
    }

    public void setNombre_de_Entrenador(String Nombre_de_Entrenador) {
        this.Nombre_de_Entrenador = Nombre_de_Entrenador;
    }

    public String getNombre_de_Dueño() {
        return Nombre_de_Dueño;
    }

    public void setNombre_de_Dueño(String Nombre_de_Dueño) {
        this.Nombre_de_Dueño = Nombre_de_Dueño;
    }

    public String getNombre_de_Mascota() {
        return Nombre_de_Mascota;
    }

    public void setNombre_de_Mascota(String Nombre_de_Mascota) {
        this.Nombre_de_Mascota = Nombre_de_Mascota;
    }

    public String getFecha_de_creacion() {
        return Fecha_de_creacion;
    }

    public void setFecha_de_creacion(String Fecha_de_creacion) {
        this.Fecha_de_creacion = Fecha_de_creacion;
    }

    public String getColor_principal() {
        return Color_principal;
    }

    public void setColor_principal(String Color_principal) {
        this.Color_principal = Color_principal;
    }
    
    
    
    
    
}
