package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

import javax.naming.OperationNotSupportedException;

public class MainApp {
	private Reina reina;
	public static void main(String[] args) {
		Consola console = new Consola();
		console.mostarMenu();
		console.elegirOpcionMenu();
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
	public void moverReina() throws OperationNotSupportedException {
		Direccion posicion =  new Consola().elegirDireccion();
		int pasos =  new Consola().elegirPasos();
		reina.mover(posicion, pasos);
	}

	public void mostrarReina() {
		if (reina != null) {
			System.out.println(reina);
		} else {
			System.out.println("No hay ninguna reina creada.");
		}
	}
}
