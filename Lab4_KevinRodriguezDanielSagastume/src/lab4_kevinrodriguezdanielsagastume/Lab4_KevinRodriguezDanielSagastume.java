/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_kevinrodriguezdanielsagastume;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Lab4_KevinRodriguezDanielSagastume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<equipos> Equipos = new ArrayList();
        int op = 0;
        while (op != 4) {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "=======MENU=======\n"
                    + "1. Agregar \n"
                    + "2. Modificarl \n"
                    + "3. Eliminar \n"
                    + "4. JUGAR\n"
                    + "5. Salir"));
            switch (op) {
                case 1:
                    int op_A = 0;
                    while (op_A != 3) {
                        op_A = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar Equipo\n"
                                + "2. Agregar Jugadores a un equipo\n"
                                + "3. salir"));
                        switch (op_A) {
                            case 1://Agregar Equipo
                                ArrayList<Jugadores> jugadores = new ArrayList();
                                String Nombre = JOptionPane.showInputDialog("Ingrese el nombre del equipo: ");
                                String estadio = JOptionPane.showInputDialog("Ingrese el estadio del equipo: ");
                                String pais = JOptionPane.showInputDialog("Ingrese el pais del equipo: ");
                                String Nombre_de_Entrenador = JOptionPane.showInputDialog("Ingrese el nombre del entrenador del equipo: ");
                                String Nombre_de_Dueño = JOptionPane.showInputDialog("Ingrese el nombre del dueño del equipo: ");
                                String Nombre_de_Mascota = JOptionPane.showInputDialog("Ingrese el nombre de la mascota del equipo: ");
                                String Fecha_de_creacion = JOptionPane.showInputDialog("Ingrese la fecha de creacion del equipo: ");
                                String Color_principal = JOptionPane.showInputDialog("Ingrese el color principal del equipo: ");
                                Equipos.add(new equipos(Nombre, estadio, pais, Nombre_de_Entrenador, Nombre_de_Dueño, Nombre_de_Mascota, Fecha_de_creacion, Color_principal));
                                JOptionPane.showMessageDialog(null, "Equipo Agregado");
                                break;//Break AGregar equipo
                            case 2:
                                ArrayList<Jugadores> jugadores1 = new ArrayList();
                                String salida = "";
                                for (Object t : Equipos) {
                                    if (t instanceof equipos) {
                                        salida += Equipos.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                int p = Integer.parseInt(JOptionPane.showInputDialog(salida + "\n"
                                        + "Ingrese el equipo que quiere agregar los jugadores"));
                                if (Equipos.get(p) instanceof equipos) {
                                    int jugador = 0;
                                    int tirador = 0;
                                    int pateador = 0;
                                    while (jugador <= 5) {
                                        int op_B = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar pateador\n"
                                                + "2. Agregar tirador"));
                                        if (op_B == 1 && pateador <= 3) {
                                            String NombreJ = JOptionPane.showInputDialog("Ingrese el nombre del jugador: ");
                                            String Apodo = JOptionPane.showInputDialog("Ingrese el apodo del jugador: ");
                                            String NumerodeCamiseta = JOptionPane.showInputDialog("Ingrese el numero de la camiseta del jugador: ");
                                            String EquipodeFutbolFavorito = JOptionPane.showInputDialog("Ingrese el equipo de futbol favorito del jugador: ");
                                            String EquipodeBaloncesto_Favorito = JOptionPane.showInputDialog("Ingrese el equipo de baloncesto favorito del jugador: ");
                                            String JugadorFavorito = JOptionPane.showInputDialog("Ingrese el jugador favorito del jugador: ");
                                            String mayor_edad = JOptionPane.showInputDialog("Ingrese si el jugador es mayor de edad: ");
                                            int año_Nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento del jugador: "));
                                            int numero_estrellas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estrellas(1-5) "));
                                            while (numero_estrellas <= 0 || numero_estrellas >= 5) {//Validacion
                                                numero_estrellas = Integer.parseInt(JOptionPane.showInputDialog("Numero de estrellas debe ser (1-5): "));
                                            }
                                            int Habilidad_Pateadora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad pateadora(1-100) "));
                                            int Fuerza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fuerza(1-100): "));
                                            int Habilidad_Regateadora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la habilidad regateadora(1-100) "));
                                            jugadores1.add(new Pateadores(Habilidad_Pateadora, Fuerza, Habilidad_Regateadora, NombreJ, Apodo, NumerodeCamiseta, EquipodeFutbolFavorito, EquipodeBaloncesto_Favorito, JugadorFavorito, mayor_edad, año_Nacimiento, numero_estrellas));
                                            jugador++;
                                        } else if (op_B == 2 && tirador <= 2) {
                                            String NombreJ = JOptionPane.showInputDialog("Ingrese el nombre del jugador: ");
                                            String Apodo = JOptionPane.showInputDialog("Ingrese el apodo del jugador: ");
                                            String NumerodeCamiseta = JOptionPane.showInputDialog("Ingrese el numero de la camiseta del jugador: ");
                                            String EquipodeFutbolFavorito = JOptionPane.showInputDialog("Ingrese el equipo de futbol favorito del jugador: ");
                                            String EquipodeBaloncesto_Favorito = JOptionPane.showInputDialog("Ingrese el equipo de baloncesto favorito del jugador: ");
                                            String JugadorFavorito = JOptionPane.showInputDialog("Ingrese el jugador favorito del jugador: ");
                                            String mayor_edad = JOptionPane.showInputDialog("Ingrese si el jugador es mayor de edad: ");
                                            int año_Nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento del jugador: "));
                                            int numero_estrellas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estrellas(1-5) "));
                                            while (numero_estrellas <= 0 || numero_estrellas >= 5) {//Validacion
                                                numero_estrellas = Integer.parseInt(JOptionPane.showInputDialog("Numero de estrellas debe ser (1-5): "));
                                            }
                                            int Tiro3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiro de 3(1-100) "));
                                            int tiro2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiro de 2(1-100) "));
                                            int ManejoBalon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el manejo de balon(1-100) "));
                                            jugadores1.add(new Tiradores(Tiro3, tiro2, ManejoBalon, NombreJ, Apodo, NumerodeCamiseta, EquipodeFutbolFavorito, EquipodeBaloncesto_Favorito, JugadorFavorito, mayor_edad, año_Nacimiento, numero_estrellas));
                                            jugador++;
                                        }//Fin de tirador
                                        //Fin opcion 1 Agregar pateador
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Equipo equivocado");
                                }
                        }
                    }// 
                    break;//Break agregar jugador
                case 2:
                    int op_C = 0;
                    while (op_C != 3) {
                        op_C = Integer.parseInt(JOptionPane.showInputDialog("1. Modificar equipo\n"
                                + "2. Modificar jugadores de un equipo\n"
                                + "3. Salir"));
                        switch (op_C) {
                            case 1:
                                String salida = "";
                                for (Object t : Equipos) {
                                    if (t instanceof equipos) {
                                        salida += Equipos.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                int p = Integer.parseInt(JOptionPane.showInputDialog(salida + "\n"
                                        + "Ingrese el equipo que quiere modificar"));
                                if (Equipos.get(p) instanceof equipos) {
                                    ArrayList<Jugadores> jugadores = new ArrayList();
                                    int op_D = Integer.parseInt(JOptionPane.showInputDialog("1. Modificar nombre del equipo\n"
                                            + "2. Modificar el estadio\n"
                                            + "3. Modificar pais\n"
                                            + "4. Modificar nombre del entrenador\n"
                                            + "5. Modificar nombre del dueño\n"
                                            + "6. Mofiicar nombre de la mascota\n"
                                            + "7. Modificar Fecha de creacion\n"
                                            + "8. Modificar Color principal"));
                                    if (op_D == 1) {
                                        String Nombre = JOptionPane.showInputDialog("Ingrese el nombre del equipo: ");
                                        ((equipos) Equipos.get(p)).setNombre(Nombre);
                                    }

                                }
                                break;//Modificar equipo
                            case 2:
                                ArrayList<Jugadores> jugadores = new ArrayList();
                                String salida2 = "";
                                for (Object t : Equipos) {
                                    if (t instanceof equipos) {
                                        salida2 += Equipos.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                int p2 = Integer.parseInt(JOptionPane.showInputDialog(salida2 + "\n"
                                        + "Ingrese el equipo que quiere agregar los jugadores"));
                                if (Equipos.get(p2) instanceof equipos) {

                                }
                                break;//Modificar jugador
                        }//Fin del switch modificar jugares o equipo
                    }
                    break;//break modificar
            }//Fin del switch PRINCIPAL
        }//Fin del while PRINCIPAL
    }//Fin del MAIN

}
