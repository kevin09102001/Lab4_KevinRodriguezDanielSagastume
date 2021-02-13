/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_kevinrodriguez_danielsagastume;

/**
 *
 * @author Kevin
 */
public abstract class Jugadores {

    protected String NombreJ, Apodo, NumerodeCamiseta, EquipodeFutbolFavorito, EquipodeBaloncesto_Favorito, JugadorFavorito, mayor_edad;
    protected int año_Nacimiento, numero_estrellas;

    public Jugadores() {

    }

    public Jugadores(String NombreJ, String Apodo, String NumerodeCamiseta, String EquipodeFutbolFavorito, String EquipodeBaloncesto_Favorito, String JugadorFavorito, String mayor_edad, int año_Nacimiento, int numero_estrellas) {
        this.NombreJ = NombreJ;
        this.Apodo = Apodo;
        this.NumerodeCamiseta = NumerodeCamiseta;
        this.EquipodeFutbolFavorito = EquipodeFutbolFavorito;
        this.EquipodeBaloncesto_Favorito = EquipodeBaloncesto_Favorito;
        this.JugadorFavorito = JugadorFavorito;
        this.mayor_edad = mayor_edad;
        this.año_Nacimiento = año_Nacimiento;
        this.setNumero_estrellas(numero_estrellas);
    }

    public String getNombreJ() {
        return NombreJ;
    }

    public void setNombreJ(String NombreJ) {
        this.NombreJ = NombreJ;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public String getNumerodeCamiseta() {
        return NumerodeCamiseta;
    }

    public void setNumerodeCamiseta(String NumerodeCamiseta) {
        this.NumerodeCamiseta = NumerodeCamiseta;
    }

    public String getEquipodeFutbolFavorito() {
        return EquipodeFutbolFavorito;
    }

    public void setEquipodeFutbolFavorito(String EquipodeFutbolFavorito) {
        this.EquipodeFutbolFavorito = EquipodeFutbolFavorito;
    }

    public String getEquipodeBaloncesto_Favorito() {
        return EquipodeBaloncesto_Favorito;
    }

    public void setEquipodeBaloncesto_Favorito(String EquipodeBaloncesto_Favorito) {
        this.EquipodeBaloncesto_Favorito = EquipodeBaloncesto_Favorito;
    }

    public String getJugadorFavorito() {
        return JugadorFavorito;
    }

    public void setJugadorFavorito(String JugadorFavorito) {
        this.JugadorFavorito = JugadorFavorito;
    }

    public String getMayor_edad() {
        return mayor_edad;
    }

    public void setMayor_edad(String mayor_edad) {
        this.mayor_edad = mayor_edad;
    }

    public int getAño_Nacimiento() {
        return año_Nacimiento;
    }

    public void setAño_Nacimiento(int año_Nacimiento) {
        this.año_Nacimiento = año_Nacimiento;
    }

    public int getNumero_estrellas() {
        return numero_estrellas;
    }

    public void setNumero_estrellas(int numero_estrellas) {
        if (numero_estrellas>=1 || numero_estrellas<=5) {
            this.numero_estrellas = numero_estrellas;
        }
        
    }

    @Override
    public String toString() {
        return "Jugadores= " + "NombreJ=" + NombreJ + ", Apodo=" + Apodo + ", NumerodeCamiseta=" + NumerodeCamiseta + ", EquipodeFutbolFavorito=" + EquipodeFutbolFavorito + ", EquipodeBaloncesto_Favorito=" + EquipodeBaloncesto_Favorito + ", JugadorFavorito=" + JugadorFavorito + ", mayor_edad=" + mayor_edad + ", año_Nacimiento=" + año_Nacimiento + ", numero_estrellas=" + numero_estrellas +"\n";
    }
    
    public abstract int Probabilidad();

}
