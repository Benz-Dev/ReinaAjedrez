package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.*;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
    public Consola(){}

    public static void mostarMenu(){
        System.out.println("1. Crear una reina por defecto.");
        System.out.println("2. Crear una reina eligiendo el color.");
        System.out.println("3. Mover una reina.");
        System.out.println("4. Salir.");
    }

    public int elegirOpcionMenu(){
        int opcion = 0;
        do{
            System.out.println("Elige una opción: ");
            opcion = Entrada.entero();
        }while(opcion < 1 || opcion > 4);
        return opcion;
    }
    public Color elegirOpcion() {
        int opcion = 0;
        do{
            System.out.println("Elige una opción: ");
            System.out.println("1. Crear una reina blanca.");
            System.out.println("2. Crear una reina negra.");
            opcion = Entrada.entero();
        }while(opcion == 1 || opcion == 2);

        return opcion==1?Color.BLANCO:Color.NEGRO;
    }

    public void mostrarMenuDirecciones(){
        System.out.println("Elige una opción: ");
        System.out.println("N. Norte.");
        System.out.println("S. Sur.");
        System.out.println("E. Este.");
        System.out.println("O. Oeste.");
        System.out.println("NE. Nordeste.");
        System.out.println("NO. Noreste.");
        System.out.println("SE. Sureste.");
        System.out.println("SO. Suroeste.");
    }

    public Direccion elegirDireccion(){
        String opcion = "";
        do{
           System.out.println("Elige una opción: ");
            opcion = Entrada.cadena();
        }while(opcion.equals("N") || opcion.equals("S") || opcion.equals("E") || opcion.equals("O") || opcion.equals("NE") || opcion.equals("NO") || opcion.equals("SE") || opcion.equals("SO"));
        return opcion.equals("N")?Direccion.NORTE:opcion.equals("S")?Direccion.SUR:opcion.equals("E")?Direccion.ESTE:opcion.equals("O")?Direccion.OESTE:opcion.equals("NE")?Direccion.NORESTE:opcion.equals("NO")?Direccion.NOROESTE:opcion.equals("SE")?Direccion.SURESTE:opcion.equals("SO")?Direccion.SUROESTE:null;
    }

    public int elegirPasos(){
        int pasos = 0;
        do{
            System.out.println("Elige una opción: ");
            pasos = Entrada.entero();
        }while(pasos < 1);
        return pasos;
    }

    public void despedirse(){
        System.out.println("Hasta pronto.\nAjedrez terminado");
    }
}
