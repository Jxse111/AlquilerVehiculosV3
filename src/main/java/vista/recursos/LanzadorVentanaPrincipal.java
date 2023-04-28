package vista.recursos;

import javafx.application.Application;
import javafx.comunicacionventanas.controladores.ControladorVentanaPrincipal;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import vista.grafica.controladores.VentanaPrincipal;
import vista.utilidades.Controlador;
import vista.utilidades.Controladores;
import vista.utilidades.Dialogos;
import javafx.scene.*;

public class LanzadorVentanaPrincipal extends Application {
	
	private static final String TITULO = null;

	@Override
	public void start(Stage escenarioPrincipal) throws Exception {
		try {
			Controlador VentanaPrincipal = Controladores.get("/AlquilerVehiculos-v3/src/main/resources/vistas/VentanaPrincipal.fxml",TITULO, null);
			VentanaPrincipal.getEscenario().setOnCloseRequest(e -> confirmarSalida(VentanaPrincipal.getEscenario(),e));
		    VentanaPrincipal.getEscenario().show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void comenzar() {
	launch(LanzadorVentanaPrincipal.class);
		
	}

	private void confirmarSalida(Stage escenario, WindowEvent e) {
		
	
}
}



