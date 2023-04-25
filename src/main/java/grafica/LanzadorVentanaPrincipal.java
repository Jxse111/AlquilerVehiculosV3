package grafica;

public class LanzadorVentanaPrincipal extends Application {
	
	@Override
	public void start(Stage escenarioPrincipal) {
		try {
			FXMLLoader cargadorVentanaPrincipal = new FXMLLoader((LocalizadorRecursos.class.getResource("Vistas/VentanaPrincipal.fxml"))
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

