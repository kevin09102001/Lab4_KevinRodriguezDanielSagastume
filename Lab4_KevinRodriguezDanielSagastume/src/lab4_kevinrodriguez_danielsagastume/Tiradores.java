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
public class Tiradores extends Jugadores {

    Random r = new Random();
    public int Tiro3, tiro2, ManejoBalon;

    public Tiradores(int Tiro3, int tiro2, int ManejoBalon, String NombreJ, String Apodo, String NumerodeCamiseta, String EquipodeFutbolFavorito, String EquipodeBaloncesto_Favorito, String JugadorFavorito, String mayor_edad, int año_Nacimiento, int numero_estrellas) {
        super(NombreJ, Apodo, NumerodeCamiseta, EquipodeFutbolFavorito, EquipodeBaloncesto_Favorito, JugadorFavorito, mayor_edad, año_Nacimiento, numero_estrellas);
        this.setTiro3(Tiro3);
        this.setTiro2(tiro2);
        this.setManejoBalon(ManejoBalon);
    }

    public int getTiro3() {
        return Tiro3;
    }

    public void setTiro3(int Tiro3) {
        if (Tiro3 >= 1 || Tiro3 <= 100) {
            this.Tiro3 = Tiro3;
        }
    }

    public int getTiro2() {
        return tiro2;
    }

    public void setTiro2(int tiro2) {
        if (tiro2 >= 1 || tiro2 <= 100) {
            this.tiro2 = tiro2;
        }
    }

    public int getManejoBalon() {
        return ManejoBalon;
    }

    public void setManejoBalon(int ManejoBalon) {
        if (ManejoBalon >= 1 || ManejoBalon <= 100) {
            this.ManejoBalon = ManejoBalon;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Tiradores{" + "Tiro3=" + Tiro3 + ", tiro2=" + tiro2 + ", ManejoBalon=" + ManejoBalon + '}'+"\n";
    }

    @Override
    public int Probabilidad() {
        int resultado = 0;
        if (tiro2 == 0) {
            int pro = (int) ((Tiro3 + ManejoBalon) * 0.90 * numero_estrellas / 10);
            int numer = r.nextInt(101);
            if (numer >= 1 && numer <= pro) {
                resultado = 3;
            } else if (numer > pro && numer <= 100) {
                resultado = 0;
            }
        } else if (Tiro3 == 0) {
            int pro = (int) ((tiro2 + ManejoBalon) * 0.95 * numero_estrellas / 10);
            int numer = r.nextInt(101);
            if (numer >= 1 && numer <= pro) {
                resultado = 2;
            } else if (numer > pro && numer <= 100) {
                resultado = 0;
            }
        }
        return resultado;
    }
}
