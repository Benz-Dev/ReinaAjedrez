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
}
