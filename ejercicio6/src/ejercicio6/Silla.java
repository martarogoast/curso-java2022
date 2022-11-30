package ejercicio6;

import java.util.Objects;

public class Silla extends ItemInventario {
	private boolean conRueditas;
	private int lote;
	private int numeroDentroDeLote;
	
	/**
	 * Constructor de silla
	 * @param lote Numero de lote
	 * @param numeroDentroDeLote Numero de dentro del lote
	 * @param conRueditas indica si tiene ruedas o no
	 */
		public Silla (int lote, int numeroDentroDeLote, boolean conRueditas) {
		this.lote = lote;
		this.numeroDentroDeLote = numeroDentroDeLote;
		this.conRueditas = conRueditas;
	}
	
	//Getters y setters
	public boolean isConRueditas() {							return conRueditas;				}
	public void setConRueditas(boolean conRueditas) {			this.conRueditas = conRueditas;	}

	public int getLote() {										return lote;		}
	public void setLote(int lote) {								this.lote = lote;	}

	public int getNumeroDentroDeLote() {						return numeroDentroDeLote;						}
	public void setNumeroDentroDeLote(int numeroDentroDeLote) {	this.numeroDentroDeLote = numeroDentroDeLote;	}
	
	//Metodo
	/**
	 * Devuelve el número identificativo de esta silla
	 */
	public int getID() {
		return lote * 1000 + numeroDentroDeLote;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conRueditas, lote, numeroDentroDeLote);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Silla other = (Silla) obj;
		return conRueditas == other.conRueditas && lote == other.lote && numeroDentroDeLote == other.numeroDentroDeLote;
	}
	
	
}
