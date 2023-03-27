package org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Autobus;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;

public interface IVehiculos {

	List<Turismo> get();

	void insertar(Turismo turismo) throws OperationNotSupportedException;

	Turismo buscar(Turismo turismo);

	void borrar(Autobus turismo) throws OperationNotSupportedException;

}