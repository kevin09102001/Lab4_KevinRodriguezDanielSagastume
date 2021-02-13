package lab4_kevinrodriguez_danielsagastume;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Lab4_KevinRodriguez_DanielSagastume {

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
                                            ((equipos) Equipos.get(p)).setJugador(jugadores1);
                                            jugadores1.add(new Pateadores(Habilidad_Pateadora, Fuerza, Habilidad_Regateadora, NombreJ, Apodo, NumerodeCamiseta, EquipodeFutbolFavorito, EquipodeBaloncesto_Favorito, JugadorFavorito, mayor_edad, año_Nacimiento, numero_estrellas));
                                            jugador++;
                                            ((equipos) Equipos.get(p)).setJugador(jugadores1);
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
                                            int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiro que desea: \n" + "1) Tiro 3  \n" + "2) Tiro 2 \n"));
                                            int Tiro3 = 0, tiro2 = 0;
                                            switch (opc) {
                                                case 1:
                                                    Tiro3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiro de 3(1-100) "));
                                                    tiro2 = 0;
                                                    break;
                                                case 2:
                                                    tiro2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiro de 2(1-100) "));
                                                    Tiro3 = 0;
                                                    break;
                                                default:
                                                    JOptionPane.showMessageDialog(null, "opcion equivocada");
                                                    break;
                                            }
                                            int ManejoBalon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el manejo de balon(1-100) "));
                                            ((equipos) Equipos.get(p)).setJugador(jugadores1);
                                            jugadores1.add(new Tiradores(Tiro3, tiro2, ManejoBalon, NombreJ, Apodo, NumerodeCamiseta, EquipodeFutbolFavorito, EquipodeBaloncesto_Favorito, JugadorFavorito, mayor_edad, año_Nacimiento, numero_estrellas));
                                            ((equipos) Equipos.get(p)).setJugador(jugadores1);
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
                                    } else if (op_D == 2) {
                                        String estadio = JOptionPane.showInputDialog("Ingrese el estadio del equipo: ");
                                        ((equipos) Equipos.get(p)).setEstadio(estadio);
                                    } else if (op_D == 3) {
                                        String pais = JOptionPane.showInputDialog("Ingrese el pais del equipo: ");
                                        ((equipos) Equipos.get(p)).setPais(pais);
                                    } else if (op_D == 4) {
                                        String Nombre_de_Entrenador = JOptionPane.showInputDialog("Ingrese el nombre del entrenador del equipo: ");
                                        ((equipos) Equipos.get(p)).setNombre_de_Entrenador(Nombre_de_Entrenador);
                                    } else if (op_D == 5) {
                                        String Nombre_de_Dueño = JOptionPane.showInputDialog("Ingrese el nombre del dueño del equipo: ");
                                        ((equipos) Equipos.get(p)).setNombre_de_Dueño(Nombre_de_Dueño);
                                    } else if (op_D == 6) {
                                        String Nombre_de_Mascota = JOptionPane.showInputDialog("Ingrese el nombre de la mascota del equipo: ");
                                        ((equipos) Equipos.get(p)).setNombre_de_Mascota(Nombre_de_Mascota);
                                    } else if (op_D == 7) {
                                        String Fecha_de_creacion = JOptionPane.showInputDialog("Ingrese la fecha de creacion del equipo: ");
                                        ((equipos) Equipos.get(p)).setFecha_de_creacion(Fecha_de_creacion);
                                    } else if (op_D == 8) {
                                        String Color_principal = JOptionPane.showInputDialog("Ingrese el color principal del equipo: ");
                                        ((equipos) Equipos.get(p)).setColor_principal(Color_principal);
                                    }
                                }
                                break;//Modificar equipo
                            case 2:
                                String salida4 = "";
                                for (Object t : Equipos) {
                                    if (t instanceof equipos) {
                                        salida4 += Equipos.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                int p4 = Integer.parseInt(JOptionPane.showInputDialog(salida4 + "\n"
                                        + "Ingrese el equipo que quiere modificar los jugadores"));
                                if (Equipos.get(p4) instanceof equipos) {
                                    String salida5 = "";
                                    for (Object t : Equipos.get(p4).getJugador()) {
                                        if (t instanceof Jugadores) {
                                            salida5 += Equipos.get(p4).getJugador().indexOf(t) + "- " + t + "\n";
                                        }
                                    }
                                    int p5 = Integer.parseInt(JOptionPane.showInputDialog(salida5 + "\n"
                                            + "Ingrese el jugador que quiere modificar"));
                                    if (Equipos.get(p4).getJugador().get(p5) instanceof Jugadores) {
                                        if (Equipos.get(p4).getJugador().get(p5) instanceof Pateadores) {
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
                                            ((equipos) Equipos.get(p4)).getJugador().set(p5, new Pateadores(Habilidad_Pateadora, Fuerza, Habilidad_Regateadora, NombreJ, Apodo, NumerodeCamiseta, EquipodeFutbolFavorito, EquipodeBaloncesto_Favorito, JugadorFavorito, mayor_edad, año_Nacimiento, numero_estrellas));

                                        } else if (Equipos.get(p4).getJugador().get(p5) instanceof Tiradores) {
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
                                            int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiro que desea: \n" + "1) Tiro 3  \n" + "2) Tiro 2 \n"));
                                            int Tiro3 = 0, tiro2 = 0;
                                            switch (opc) {
                                                case 1:
                                                    Tiro3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiro de 3(1-100) "));
                                                    tiro2 = 0;
                                                    break;
                                                case 2:
                                                    tiro2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiro de 2(1-100) "));
                                                    Tiro3 = 0;
                                                    break;
                                                default:
                                                    JOptionPane.showMessageDialog(null, "opcion equivocada");
                                                    break;
                                            }
                                            int ManejoBalon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el manejo de balon(1-100) "));
                                            ((equipos) Equipos.get(p4)).getJugador().set(p5, new Tiradores(Tiro3, tiro2, ManejoBalon, NombreJ, Apodo, NumerodeCamiseta, EquipodeFutbolFavorito, EquipodeBaloncesto_Favorito, JugadorFavorito, mayor_edad, año_Nacimiento, numero_estrellas));
                                        }
                                    }
                                }
                                break;
                        }
                    }
                    break;//break modificar

                case 3://Eliminar
                    int op_D = 0;
                    while (op_D != 3) {
                        op_D = Integer.parseInt(JOptionPane.showInputDialog("1. Modificar equipo\n"
                                + "2. Modificar jugadores de un equipo\n"
                                + "3. Salir"));
                        switch (op_D) {
                            case 1://Eliminar equipos
                                String salida3 = "";
                                for (Object t : Equipos) {
                                    if (t instanceof equipos) {
                                        salida3 += Equipos.indexOf(t) + "- " + t + "\n";
                                    }
                                }
                                int p3 = Integer.parseInt(JOptionPane.showInputDialog(salida3 + "\n"
                                        + "Ingrese el equipo que quiere eliminar"));
                                if (Equipos.get(p3) instanceof equipos) {
                                    Equipos.remove(p3);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Equipo equivocado");
                                }
                                break;//Break modificar

                            case 2:// Eliminar jugadores
                                char resp = 's';
                                while (resp == 's' || resp == 'S') {
                                    String salida5 = "";
                                    for (Object t : Equipos) {
                                        if (t instanceof equipos) {
                                            salida5 += Equipos.indexOf(t) + "- " + t + "\n";
                                        }
                                    }
                                    int p5 = Integer.parseInt(JOptionPane.showInputDialog(salida5 + "\n"
                                            + "Ingrese el equipo que quiere eliminar los jugadores"));
                                    if (Equipos.get(p5) instanceof equipos) {
                                        String salida6 = "";
                                        for (Object t : Equipos.get(p5).getJugador()) {
                                            if (t instanceof Jugadores) {
                                                salida6 += Equipos.get(p5).getJugador().indexOf(t) + "- " + t + "\n";
                                            }
                                        }
                                        int p6 = Integer.parseInt(JOptionPane.showInputDialog(salida6 + "\n"
                                                + "Ingrese el jugador que quiere eliminar"));
                                        if (Equipos.get(p5).getJugador().get(p6) instanceof Jugadores) {

                                            Equipos.get(p5).getJugador().remove(p6);
                                        }
                                    }
                                    resp = (JOptionPane.showInputDialog("Desea eliminar otro jugador(s/n): ")).charAt(0);
                                }
                                break;//Break ¿
                        }
                    }
                    break;
                case 4:
                    equipos Equipo1 = new equipos();
                    equipos Equipo2 = new equipos();
                    String salida = "";
                    for (Object t : Equipos) {
                        if (t instanceof equipos) {
                            salida += Equipos.indexOf(t) + "- " + t + "\n";
                        }
                    }
                    int p = Integer.parseInt(JOptionPane.showInputDialog(salida + "\n"
                            + "Jugador1 Eliga su equipo"));
                    if (Equipos.get(p) instanceof equipos) {
                        Equipo1 = ((equipos) Equipos.get(p));
                    }
                    String salida1 = "";
                    for (Object t : Equipos) {
                        if (t instanceof equipos && t != Equipo1) {
                            salida1 += Equipos.indexOf(t) + "- " + t + "\n";
                        }
                    }
                    int p1 = Integer.parseInt(JOptionPane.showInputDialog(salida1 + "\n"
                            + "Jugador2 Eliga su equipo"));
                    if (Equipos.get(p1) instanceof equipos) {
                        Equipo2 = ((equipos) Equipos.get(p1));
                    }
                    int puntos1 = 0;
                    int puntos2 = 0;
                    int turno = 1;
                    ArrayList<String> Jugador_punto1 = new ArrayList();
                    ArrayList<String> Jugador_punto2 = new ArrayList();
                    int J0_P1 = 0;
                    int J1_P1 = 0;
                    int J2_P1 = 0;
                    int J3_P1 = 0;
                    int J4_P1 = 0;
                    int J0_P2 = 0;
                    int J1_P2 = 0;
                    int J2_P2 = 0;
                    int J3_P2 = 0;
                    int J4_P2 = 0;
                    while (puntos1 < 11 && puntos2 < 11) {
                        char resp_p = 's';
                        int pases = 0;
                        while (resp_p == 's' || resp_p == 'S' && turno == 1 && pases < 5) {
                            String salida2 = "";
                            for (Object t : Equipo1.jugador) {
                                if (t instanceof Jugadores) {
                                    salida2 += Equipo1.getJugador().indexOf(t) + "- " + t + "\n";
                                }
                            }
                            int p2 = Integer.parseInt(JOptionPane.showInputDialog(salida2 + "\n"
                                    + "Jugador1 Eliga su jugador que reciba el balon"));
                            if (Equipo1.getJugador().get(p2) instanceof Jugadores) {
                                int punto_anotado;
                                resp_p = (JOptionPane.showInputDialog(Equipo1.getJugador().get(p2).getNombreJ() + " tiene el balon " + " Desea dar pase a otro jugar(s/n): ")).charAt(0);
                                if (resp_p == 'n' || resp_p == 'N') {
                                    punto_anotado = Equipo1.getJugador().get(p).Probabilidad();
                                    puntos1 += punto_anotado;
                                    if (punto_anotado > 0) {
                                        JOptionPane.showMessageDialog(null, "Felicidades anotaste " + punto_anotado);

                                        if (p2 == 0) {
                                            J0_P1 += punto_anotado;
                                        } else if (p2 == 1) {
                                            J1_P1 += punto_anotado;
                                        } else if (p2 == 2) {
                                            J2_P1 += punto_anotado;
                                        } else if (p2 == 3) {
                                            J3_P1 += punto_anotado;
                                        } else if (p2 == 4) {
                                            J4_P1 += punto_anotado;
                                        }
                                        turno = 2;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Fallaste");
                                    }
                                } else if (resp_p == 's' || resp_p == 'S') {
                                    pases++;
                                }
                            }
                        }//Fin turno 1
                        char resp_p2 = 's';
                        int pases2 = 0;

                        while (resp_p2 == 's' || resp_p2 == 'S' && turno == 2 && pases2 < 5) {
                            String salida2 = "";
                            for (Object t : Equipo2.jugador) {
                                if (t instanceof Jugadores) {
                                    salida2 += Equipo2.getJugador().indexOf(t) + "- " + t + "\n";
                                }
                            }
                            int p2 = Integer.parseInt(JOptionPane.showInputDialog(salida2 + "\n"
                                    + "Jugador2 Eliga su jugador que reciba el balon"));
                            if (Equipo2.getJugador().get(p2) instanceof Jugadores) {
                                int punto_anotado;
                                resp_p = (JOptionPane.showInputDialog(Equipo2.getJugador().get(p2).getNombreJ() + " tiene el balon " + " Desea dar pase a otro jugar(s/n): ")).charAt(0);
                                if (resp_p == 'n' || resp_p == 'N') {
                                    punto_anotado = Equipo2.getJugador().get(p).Probabilidad();
                                    puntos2 += punto_anotado;
                                    if (punto_anotado > 0) {
                                        JOptionPane.showMessageDialog(null, "Felicidades anotaste " + punto_anotado);

                                        if (p2 == 0) {
                                            J0_P2 += punto_anotado;
                                        } else if (p2 == 1) {
                                            J1_P2 += punto_anotado;
                                        } else if (p2 == 2) {
                                            J2_P2 += punto_anotado;
                                        } else if (p2 == 3) {
                                            J3_P2 += punto_anotado;
                                        } else if (p2 == 4) {
                                            J4_P2 += punto_anotado;
                                        }
                                        turno = 1;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Fallaste");
                                    }
                                } else if (resp_p == 's' || resp_p == 'S') {
                                    pases2++;
                                }
                            }
                        }//Fin turno2 
                    }//Fin del juego
                    String puntosJ1 = "";
                    puntosJ1 += puntos1;
                    String puntosJ2 = "";
                    puntosJ2 += puntos2;
                    JOptionPane.showMessageDialog(null, "El equipo 1 unos hizo " + puntosJ1 + "\n"
                            + "El Equipo 2 hizo " + puntosJ2 + "\n");
                    if (J0_P1 > J1_P1 && J1_P1 > J2_P1 && J2_P1 > J3_P1 && J3_P1 > J4_P1) {
                        JOptionPane.showMessageDialog(null, "Maximos anotadores del Equipo 1: \n"
                                + Equipo1.getJugador().get(0).getNombreJ() + ": " + J0_P1 + "\n"
                                + Equipo1.getJugador().get(1).getNombreJ() + ": " + J1_P1 + "\n"
                                + Equipo1.getJugador().get(2).getNombreJ() + ": " + J2_P1 + "\n"
                                + Equipo1.getJugador().get(3).getNombreJ() + ": " + J3_P1 + "\n"
                                + Equipo1.getJugador().get(4).getNombreJ() + ": " + J4_P1 + "\n");
                    }
                    break;//Break jugar
            }//Fin del switch PRINCIPAL
        }//Fin del while PRINCIPAL
    }//Fin del main
}//Fin de la clase
