package ejercicio6;

import java.util.Objects;

public class Pc extends ItemInventario implements BarcodeReadable{
	private int nroSerie;
	private boolean esNotebook;
	private int barcode;
	
	/**
	 * Constructor de PC
	 * @param nroSerie Numero de serie
	 * @param esNotebook Indica si es un notebook
	 * @param code Codigo de barras
	 */
	public Pc(int nroSerie, boolean esNotebook, int code) {
		this.esNotebook = esNotebook;
		this.nroSerie = nroSerie;
		this.barcode = code;
	}
	
	//Getters y setters
	public int getNroSerie() {					return nroSerie;			}
	public void setNroSerie(int nroSerie) {		this.nroSerie = nroSerie;	}

	public boolean isNotebook() {						return esNotebook;				}
	public void setEsNotebook(boolean esNotebook) {		this.esNotebook = esNotebook;	}

	public void setBarcode(int barcode) {		this.barcode = barcode;	}
	@Override
	public int getBarcode() {					return this.barcode;	}
	
	//Metodos
	public int getID() {
		return nroSerie;
	}

	@Override
	public int hashCode() {
		return Objects.hash(barcode, esNotebook, nroSerie);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pc other = (Pc) obj;
		return barcode == other.barcode && esNotebook == other.esNotebook && nroSerie == other.nroSerie;
	}
	
	
}
