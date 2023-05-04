package vista.grafica.controladores;
import dominio.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
public class LeerCliente {

	public class PleaseProvideControllerClassName {

	@FXML private TextField tfNombre;
	@FXML private TextField tfDNI;
	@FXML private TextField tfTeléfono;
	    void Aceptar(ActionEvent event) {

	    }

	    
	    void Cancelar(ActionEvent event) {
	    	public Cliente getCliente() {
	    		String nombre = tfNombre.getText();
	    		String dni = tfDNI.getText();
	    		String telefono = tfTeléfono.getText();
	    		return Cancelar ? null : new Cliente(nombre,dni,telefono);
	    	}
	    }

}
}
