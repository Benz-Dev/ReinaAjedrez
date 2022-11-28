package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	private Reina reina;
	public static void main(String[] args) {
		System.out.println("hola");
	}
	public void ejecutarOpcion(int opcion) {
		// No entiendo que tengo que poner aqui 😅
	}

	public void crearReinaPorDefecto() {
		reina = new Reina();
	}

	public void crearReina(Color color) {
		reina = new Reina(color);
	}
}
