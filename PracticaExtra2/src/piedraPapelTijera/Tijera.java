package piedraPapelTijera;

/**
 * @author Marta Rodriguez
 *
 */
public class Tijera extends PiedraPapelTijeraFactory {

	//Constructores
	public Tijera() {
		this("tijera", TIJERA);
	}
	public Tijera(String nombre, int numero) {
		super(nombre, numero);
	}

	@Override
	public boolean isMe(int numero) {
		return numero == TIJERA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijera) {
		int result = 0;
		int numeroRecibido = pPiedraPapelTijera.getNumero();
		switch (numeroRecibido) {
		case PIEDRA:
			result = -1; // Pierde
			descripcionResultado = nombre + " pierde con " + pPiedraPapelTijera.getNombre();
			break;
		case PAPEL:
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

}
