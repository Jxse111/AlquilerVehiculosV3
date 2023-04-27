package vista;

import javafx.application.Application;
import vista.recursos.LanzadorVentanaPrincipal;

public enum FactoriaVista {
	GRAFICA {
		@Override
		public Application crear() {
			return new LanzadorVentanaPrincipal();
		}
	};
	public abstract Application crear();
}
