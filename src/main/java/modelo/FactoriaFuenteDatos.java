package modelo;

public enum FactoriaFuenteDatos {
MEMORIA;
	public abstract crear() {
		return IFuenteDatos;
	}
}
