package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {
    BLANCO("Blanco"),
    NEGRO("Negro");

    public String cadenaAMostrar;

    Color(String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;
    }

    @Override
    public String toString() {
        return this.cadenaAMostrar;
    }
}
