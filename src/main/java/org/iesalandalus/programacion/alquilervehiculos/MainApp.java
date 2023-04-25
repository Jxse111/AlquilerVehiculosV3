package org.iesalandalus.programacion.alquilervehiculos;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class MainApp {

	public static void main(String[] args) {
		Vista vista = new Vista();
		Controlador controlador = new Controlador(new Modelo(), vista);
		controlador.comenzar();
	}
	
}