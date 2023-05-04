package org.iesalandalus.programacion.alquilervehiculos;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class MainApp {

	public static void main(String[] args) {
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador(new Modelo(),vista);
		controlador.comenzar();
	}
	
}