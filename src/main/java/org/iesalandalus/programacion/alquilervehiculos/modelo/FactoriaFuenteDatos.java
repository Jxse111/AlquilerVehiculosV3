package org.iesalandalus.programacion.alquilervehiculos.modelo;

public enum FactoriaFuenteDatos {
MEMORIA;
	public abstract crear() {
		return IFuenteDatos;
	}
}
