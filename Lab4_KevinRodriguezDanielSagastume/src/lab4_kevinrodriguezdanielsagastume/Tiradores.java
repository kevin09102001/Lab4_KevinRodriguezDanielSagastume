/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_kevinrodriguezdanielsagastume;

/**
 *
 * @author Kevin
 */
public  class Tiradores extends Jugadores{
    public int Tiro3,tiro2,ManejoBalon;

    public Tiradores(int Tiro3, int tiro2, int ManejoBalon, String NombreJ, String Apodo, String NumerodeCamiseta, String EquipodeFutbolFavorito, String EquipodeBaloncesto_Favorito, String JugadorFavorito, String mayor_edad, int año_Nacimiento, int numero_estrellas) {
        super(NombreJ, Apodo, NumerodeCamiseta, EquipodeFutbolFavorito, EquipodeBaloncesto_Favorito, JugadorFavorito, mayor_edad, año_Nacimiento, numero_estrellas);
        setTiro3(Tiro3);
        setTiro2(tiro2);
        setManejoBalon(ManejoBalon);
    }

    public int getTiro3() {
        return Tiro3;
    }

    public void setTiro3(int Tiro3) {
        if (Tiro3>=1 || Tiro3<=100) {
            this.Tiro3 = Tiro3;
        }
    }

    public int getTiro2() {
        return tiro2;
    }

    public void setTiro2(int tiro2) {
        if (tiro2>=1 || tiro2<=100) {
            this.tiro2 = tiro2;
        }
    }

    public int getManejoBalon() {
        return ManejoBalon;
    }

    public void setManejoBalon(int ManejoBalon) {
        if (ManejoBalon>=1 || ManejoBalon<=100) {
            this.ManejoBalon = ManejoBalon;
        }
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Tiradores{" + "Tiro3=" + Tiro3 + ", tiro2=" + tiro2 + ", ManejoBalon=" + ManejoBalon + '}';
    }

    @Override
    public String Probabilidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
