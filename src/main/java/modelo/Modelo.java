package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import dominio.Alquiler;
import dominio.Autobus;
import dominio.Cliente;
import dominio.Turismo;
import ficheros.Vehiculos;
import modelo.negocio.Turismos;
import negocio.Alquileres;
import negocio.Clientes;
import negocio.IAlquileres;
import negocio.IClientes;
import negocio.IVehiculos;

public class Modelo {
	private IClientes clientes;
	private IAlquileres alquileres;
	private IVehiculos turismos;

	public Modelo() {
	}

	public void comenzar() {
		clientes = new Clientes();
		turismos = new Vehiculos();
		alquileres = new Alquileres();
	}

	public void terminar() {
		System.out.println("AVISO: El modelo ha terminado");
	}

	public void insertar(Cliente cliente) throws OperationNotSupportedException {
		clientes.insertar(new Cliente(cliente));
	}

	public void insertar(Vehiculos vehiculos) throws OperationNotSupportedException {
		turismos.insertar(new Vehiculos(vehiculos));
	}

	public void insertar(Alquiler alquiler) throws OperationNotSupportedException {
		if (alquiler == null) {
			throw new NullPointerException("ERROR: No se puede realizar un alquiler nulo.");
		}

		Cliente cliente = buscar(alquiler.getCliente());
		Turismo turismo = buscar(alquiler.getTurismo());

		if (cliente == null) {
			throw new OperationNotSupportedException("ERROR: No existe el cliente del alquiler.");
		}

		if (turismo == null) {
			throw new OperationNotSupportedException("ERROR: No existe el turismo del alquiler.");
		}

		alquileres.insertar(new Alquiler(new Cliente(cliente), new Turismo(turismo), alquiler.getFechaAlquiler()));
	}

	public Cliente buscar(Cliente cliente) {
		Cliente clienteBuscado = clientes.buscar(cliente);
		return (clienteBuscado == null) ? null : new Cliente(clienteBuscado);
	}

	public Turismo buscar(Vehiculos vehiculos) {
		Turismo turismoBuscado = turismos.buscar(vehiculos);
		return (turismoBuscado == null) ? null : new Vehiculos(turismoBuscado);
	}

	public Alquiler buscar(Alquiler alquiler) {
		return new Alquiler(alquileres.buscar(alquiler));
	}

	public void modificar(Cliente cliente, String nombre, String telefono) throws OperationNotSupportedException {
		clientes.modificar(cliente, nombre, telefono);
	}

	public void devolver(Alquiler alquiler, LocalDate fechaDevolucion) throws OperationNotSupportedException {
		alquiler = alquileres.buscar(alquiler);

		if (alquiler == null) {
			throw new OperationNotSupportedException("ERROR: No existe el alquiler a devolver.");
		}

		alquiler.devolver(fechaDevolucion);
	}

	public void borrar(Cliente cliente) throws OperationNotSupportedException {
		for (Alquiler alquilerAux : alquileres.get(cliente)) {
			borrar(alquilerAux);
		}
		clientes.borrar(cliente);
	}

	public void borrar(Autobus turismo) throws OperationNotSupportedException {
		for (Alquiler alquilerAux : alquileres.get(turismo)) {
			borrar(alquilerAux);
		}
		turismos.borrar(turismo);
	}

	public void borrar(Alquiler alquiler) throws OperationNotSupportedException {
		alquileres.borrar(alquiler);
	}

	public List<Cliente> getClientes() {
		List<Cliente> listaCliente = new ArrayList<>();
		for (Cliente cliente : clientes.get()) {
			listaCliente.add(new Cliente(cliente));
		}
		return listaCliente;
	}

	public List<Turismo> getTurismos() {
		List<Turismo> listaTurismo = new ArrayList<>();
		for (Turismo turismo : turismos.get()) {
			listaTurismo.add(new Turismo(turismo));
		}
		return listaTurismo;
	}

	public List<Alquiler> getAlquileres() {
		List<Alquiler> listaAlquiler = new ArrayList<>();
		for (Alquiler alquiler : alquileres.get()) {
			listaAlquiler.add(new Alquiler(alquiler));
		}
		return listaAlquiler;
	}

	public List<Alquiler> getAlquileres(Cliente cliente) {
		ArrayList<Alquiler> alquilerArray = new ArrayList<>();
		for (Alquiler alquilerAux : alquileres.get(cliente)) {
			alquilerArray.add(new Alquiler(alquilerAux));
		}
		return alquilerArray;
	}

	public List<Alquiler> getAlquileres(Autobus turismo) {
		ArrayList<Alquiler> alquilerArray = new ArrayList<>();
		for (Alquiler alquilerAux : alquileres.get(turismo)) {
			alquilerArray.add(new Alquiler(alquilerAux));
		}
		return alquilerArray;
	}

}