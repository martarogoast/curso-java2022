package piedraPapelTijeraLagartoSpock;

/**
 * @author Marta Rodriguez
 *
 */
public class Piedra extends PiedraPapelTijeraFactory {

	//Constructores
	public Piedra() {
		this("piedra", PIEDRA);
	}
	
	public Piedra(String nombre, int numero) {
		super(nombre, numero);
	}

	@Override
	public boolean isMe(int numero) {
		return numero == PIEDRA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijera) {
		int result = 0;
		int numeroRecibido = pPiedraPapelTijera.getNumero();
		switch (numeroRecibido) {
		case PAPEL:
			result = -1; // Pierde
			descripcionResultado = nombre + " pierde con " + pPiedraPapelTijera.getNombre();
			break;
		case TIJERA:
			result = 1; // Gana
			descripcionResultado = nombre + " gana a " + pPiedraPapelTijera.getNombre();
			break;
		case LAGARTO:
			result = 1; // Gana
			descripcionResultado = nombre + " aplasta a " + pPiedraPapelTijera.getNombre();
			break;
		case SPOCK:
			result = -1; // Pierde
			descripcionResultado = nombre + " es vaporizada por " + pPiedraPapelTijera.getNombre();
			break;
		default:
			result = 0; // Empate
			descripcionResultado = nombre + " empata con " + pPiedraPapelTijera.getNombre();
			break;
		}
		return result;
	}

}
