package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
    private Color color;
    private Posicion posicion;

    // CONSTRUCTOR
    public Reina(){
        this.color = Color.BLANCO;
        this.posicion= new Posicion(1, 'd');
    }

    Reina(Color color){
        if(color != null) {
            this.setColor(color);
            if (Color.NEGRO == color) {
                this.setPosicion(new Posicion(8, 'd'));
            } else {
                this.setPosicion(new Posicion(1, 'd'));
            }
        }else {
            throw new NullPointerException("ERROR: El color no puede ser nulo.");
        }
    }

    // COLOR
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (Color.BLANCO == color || Color.NEGRO == color){
            this.color = color;
        }else {
            throw new IllegalArgumentException("El color no es el esperado.");
        }
    }

    // POSICION
    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        try {
            this.posicion = posicion;
        } catch(IllegalArgumentException e) {
            throw new IllegalArgumentException("La posición no es la esperada.");
        }

    }

    public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
        if(direccion != null) {
            if (pasos >= 1 && pasos <= 7) {

                if(pasos + posicion.getFila() > 8 || pasos + posicion.getColumna() > 'h' || posicion.getFila() - pasos < 1 || posicion.getColumna() - pasos < 'a') {
                    throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
                } else {
                    switch (direccion){
                        case NORTE -> posicion.setFila(posicion.getFila() + pasos);
                        case SUR -> posicion.setFila(posicion.getFila() - pasos);
                        case ESTE -> posicion.setColumna((char) (posicion.getColumna() + pasos));
                        case OESTE -> posicion.setColumna((char) (posicion.getColumna() - pasos));
                        case NORESTE -> {
                            posicion.setColumna((char) (posicion.getColumna() + pasos));
                            posicion.setColumna((char) (posicion.getColumna() + pasos));
                        }
                        case NOROESTE -> {
                            posicion.setFila(posicion.getFila() + pasos);
                            posicion.setColumna((char) (posicion.getColumna() - pasos));
                        }
                        case SURESTE -> {
                            posicion.setFila(posicion.getFila() - pasos);
                            posicion.setColumna((char) (posicion.getColumna() + pasos));
                        }
                        case SUROESTE -> {
                            posicion.setFila(posicion.getFila() - pasos);
                            posicion.setColumna((char) (posicion.getColumna() - pasos));
                        }
                        default -> throw new OperationNotSupportedException("ERROR: Dirección no válida.");
                    }
                }

            } else {
                throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
            }
        } else {
            throw new NullPointerException("ERROR: La dirección no puede ser nula.");
        }
    }

    @Override
    public String toString() {
        return "color="+color+", posicion=("+posicion+')';
    }
}
