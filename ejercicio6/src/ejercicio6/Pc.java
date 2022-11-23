package ejercicio6;

public class Pc extends ItemInventario implements BarcodeReadable{
	public int nroSerie;
	public boolean esNotebook;
	private int barcode;
	
	/**
	 * Constructor de PC
	 * @param nroSerie Numero de serie
	 * @param esNotebook Indica si es un notebook
	 * @param code Codigo de barras
	 */
	Pc(int nroSerie, boolean esNotebook, int code) {
		this.esNotebook = esNotebook;
		this.nroSerie = nroSerie;
		this.barcode = code;
	}
	
	public int getID() {
		return nroSerie;
	}

	@Override
	public int getBarcode() {
		return this.barcode;
	}
}
