package piedraPapelTijera;

/**
 * @author Marta Rodriguez
 *
 */
public class Papel extends PiedraPapelTijeraFactory {

	//Constructores
	public Papel() {
		this("papel", PAPEL);
	}
	
	public Papel(String nombre, int numero) {
		super(nombre, numero);
	}

	//Metodos heredados
	@Override
	public int comparar (PiedraPapelTijeraFactory pPiedraPapelTijera) {
		int result = 0;
		int numeroRecibido = pPiedraPapelTijera.getNumero();
		switch (numeroRecibido) {
		case TIJERA:
			result = -1; // Pierde
			descripcionResultado = nombre + " pierde con " + pPiedraPapelTijera.getNombre();
			break;
		case PIEDRA:
			result = 1; // Pierde
			descripcionResultado = nombre + " gana a " + pPiedraPapelTijera.getNombre();
			break;
		default:
			result = 0; // Empate
			descripcionResultado = nombre + " empata con " + pPiedraPapelTijera.getNombre();
			break;
		}
		return result;
	}
	@Override
	public boolean isMe(int numero) {
		return numero == PAPEL;
	}
}
