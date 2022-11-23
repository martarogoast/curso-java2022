package ejercicio6;

public class Pc extends ItemInventario {
	public int nroSerie;
	public boolean esNotebook;
	
	/**
	 * Constructor de PC
	 * @param nroSerie Numero de serie
	 * @param esNotebook Indica si es un notebook
	 */
	Pc(int nroSerie, boolean esNotebook) {
		this.esNotebook = esNotebook;
		this.nroSerie = nroSerie;
	}
	
	public int getID() {
		return nroSerie;
	}
}
