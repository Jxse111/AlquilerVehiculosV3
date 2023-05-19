package vista.grafica.controladores;
import dominio.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import vista.utilidades.Controlador;

	public class LeerCliente extends Controlador {

		@FXML private TextField tfNombre;
		@FXML private TextField tfDNI;
		@FXML private TextField tfTeléfono;
	    @FXML
	    void Aceptar(ActionEvent event) {

	    }

	    @FXML
	    void cancelar(ActionEvent event) {
	    	Cliente.getCliente() {
	    		String nombre = tfNombre.getText();
	    		String dni = tfDNI.getText();
	    	String telefono = tfTeléfono.getText();{
	    		return cancelado ? null : new Cliente(nombre,dni,telefono);
	    		}
	    @FXML
	    void cerrar(ActionEvent event) {

	    }

	}
