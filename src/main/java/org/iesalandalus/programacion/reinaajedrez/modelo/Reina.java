package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
    private Color color;
    private Posicion posicion;

    // CONSTRUCTOR
    public Reina(){
        this.color = Color.BLANCO;
        this.posicion= new Posicion(1, 'd');
    }

    Reina(Color color){
        this.setColor(color);
        if (Color.NEGRO == color){
            this.setPosicion(new Posicion(8, 'b'));
        } else {
            this.setPosicion(new Posicion(1, 'd'));
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
        } catch (IllegalArgumentException e){
            throw e;
        }

    }
}
