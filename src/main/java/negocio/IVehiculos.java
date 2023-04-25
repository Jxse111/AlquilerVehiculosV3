package negocio;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import dominio.Autobus;
import dominio.Turismo;
import dominio.Vehiculo;

public interface IVehiculos {

	List<Vehiculo> get();
	Vehiculo buscar(Vehiculo vehiculo);

	void borrar(Autobus vehiculo) throws OperationNotSupportedException;

	void insertar(Vehiculo vehiculo) throws OperationNotSupportedException;

}