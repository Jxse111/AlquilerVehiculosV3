package org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Autobus;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Vehiculo;

public interface IVehiculos {

	List<Vehiculo> get();
	Vehiculo buscar(Vehiculo vehiculo);

	void borrar(Autobus vehiculo) throws OperationNotSupportedException;

	void insertar(Vehiculo vehiculo) throws OperationNotSupportedException;

}