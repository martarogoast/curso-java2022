package ejercicio6;

public class Silla extends ItemInventario {
	protected boolean conRueditas;
	protected int lote;
	protected int numeroDentroDeLote;
	
	/**
	 * Constructor de silla
	 * @param lote Numero de lote
	 * @param numeroDentroDeLote Numero de dentro del lote
	 * @param conRueditas indica si tiene ruedas o no
	 */
	Silla (int lote, int numeroDentroDeLote, boolean conRueditas) {
		this.lote = lote;
		this.numeroDentroDeLote = numeroDentroDeLote;
		this.conRueditas = conRueditas;
	}
	
	public int getID() {
		return lote * 1000 + numeroDentroDeLote;
	}
}
