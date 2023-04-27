package vista.recursos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;

public class LanzadorVentanaPrincipal extends Application {
	
	@Override
	public void start(Stage escenarioPrincipal) throws Exception {
		try {
			FXMLLoader cargadorVentanaPrincipal = new FXMLLoader((LocalizadorRecursos.class.getResource("src/main/resources/Vistas/VentanaPrincipal.fxml")));
			Parent raiz = cargadorVentanaPrincipal.load();
			
			Scene escena = new Scene(raiz);
			escenarioPrincipal.setTitle("Vista Gráfica de Vehículos");
			escenarioPrincipal.setScene(escena);
			escenarioPrincipal.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void comenzar() {
	launch(LanzadorVentanaPrincipal.class);
		
	
}
}


