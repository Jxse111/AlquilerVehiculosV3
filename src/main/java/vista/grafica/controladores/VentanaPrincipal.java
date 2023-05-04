package vista.grafica.controladores;

import java.awt.Button;

import javafx.fxml.FXML;
import vista.utilidades.Controlador;
import vista.utilidades.Controladores;

public class VentanaPrincipal extends Controlador {

	private Button btPulsme;
	
	private void initialize() {
		System.out.println("Método initialize de VentanaPrincipal");
	}
	
	void saludar() {
		System.out.println("Botón pulsado");

		@FXML
		void Leercliente() {
			LeerCliente leerCliente = (LeerCliente) Controladores.get("Vistas/LeerCliente.fxml", "leer Cliente", getEscenario())
		    leerCliente.getEscenario().showAndWait();
			System.out.println()leerCliente.getCliente());
		}
	}
}
