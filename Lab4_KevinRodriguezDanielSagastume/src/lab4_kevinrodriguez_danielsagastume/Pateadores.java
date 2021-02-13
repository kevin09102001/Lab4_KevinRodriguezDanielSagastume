/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_kevinrodriguez_danielsagastume;

import java.util.Random;

/**
 *
 * @author Kevin
 */
public class Pateadores extends Jugadores {

    Random r = new Random();

    public int Habilidad_Pateadora, Fuerza, Habilidad_Regateadora;

    public Pateadores(int Habilidad_Pateadora, int Fuerza, int Habilidad_Regateadora, String NombreJ, String Apodo, String NumerodeCamiseta, String EquipodeFutbolFavorito, String EquipodeBaloncesto_Favorito, String JugadorFavorito, String mayor_edad, int año_Nacimiento, int numero_estrellas) {
        super(NombreJ, Apodo, NumerodeCamiseta, EquipodeFutbolFavorito, EquipodeBaloncesto_Favorito, JugadorFavorito, mayor_edad, año_Nacimiento, numero_estrellas);
        this.setHabilidad_Pateadora(Habilidad_Pateadora);
        this.setFuerza(Fuerza);
        this.setHabilidad_Regateadora(Habilidad_Regateadora);
    }

    public int getHabilidad_Pateadora() {
        return Habilidad_Pateadora;
    }

    public void setHabilidad_Pateadora(int Habilidad_Pateadora) {
        if (Habilidad_Pateadora >= 1 || Habilidad_Pateadora <= 100) {
            this.Habilidad_Pateadora = Habilidad_Pateadora;
        }
    }

    public int getFuerza() {
        return Fuerza;
    }

    public void setFuerza(int Fuerza) {
        if (Fuerza >= 1 || Fuerza <= 100) {
            this.Fuerza = Fuerza;
        }
    }

    public int getHabilidad_Regateadora() {
        return Habilidad_Regateadora;
    }

    public void setHabilidad_Regateadora(int Habilidad_Regateadora) {
        if (Habilidad_Regateadora >= 1 || Habilidad_Regateadora <= 100) {
            this.Habilidad_Regateadora = Habilidad_Regateadora;
        }

    }

    @Override
    public String toString() {
        return super.toString() + " " + "Pateadores{" + "Habilidad_Pateadora=" + Habilidad_Pateadora + ", Fuerza=" + Fuerza + ", Habilidad_Regateadora=" + Habilidad_Regateadora + '}'+"\n";
    }

    @Override
    public int Probabilidad() {
        int resultado =0;
        int pro = (int) ((Habilidad_Pateadora + Fuerza + Habilidad_Regateadora) * 0.65 * numero_estrellas / 10);
        int numer = r.nextInt(101);
        if (numer >= 1 && numer <= pro) {
            resultado = 1;
        } else if (numer > pro && numer <= 100) {
            resultado = 1;
        }
        return resultado;
    }

}
