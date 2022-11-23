package ejercicio6;

public abstract class ItemInventario {
	
	public abstract int getID();
	/*
	enum TipoItem {
		PC, SILLA
	};

	// El tipo de item que será este objeto
	final TipoItem tipo;
	// Solo se usa si es una PC
	public int nroSerie;
	public boolean esNotebook;
	// Solo se usa si es una SILLA
	public boolean conRueditas;
	public int lote;
	public int numeroDentroDeLote;

	// Constructor para PC
	public ItemInventario(int nroSerie, boolean esNotebook) {
		tipo = TipoItem.PC;
		this.esNotebook = esNotebook;
		this.nroSerie = nroSerie;
	}

	// Constructor para SILLA
	public ItemInventario(int lote, int numeroDentroDeLote, boolean conRueditas) {
		tipo = TipoItem.SILLA;
		this.lote = lote;
		this.numeroDentroDeLote = numeroDentroDeLote;
		this.conRueditas = conRueditas;
	}

	public int getID() {
		switch (tipo) {
		case PC:
			return nroSerie;
		case SILLA:
			return lote * 1000 + numeroDentroDeLote;
		default:
			throw new AssertionError();
		}
	}*/
}
