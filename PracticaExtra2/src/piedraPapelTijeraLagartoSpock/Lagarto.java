package piedraPapelTijeraLagartoSpock;

/**
 * 
 * @author Marta Rodriguez
 *
 */
public class Lagarto extends PiedraPapelTijeraFactory {

	//Constructores
	public Lagarto() {
		this("lagarto", LAGARTO);
	}
	
	public Lagarto(String nombre, int numero) {
		super(nombre, numero);
	}

	@Override
	public boolean isMe(int numero) {
		return numero == LAGARTO;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijera) {
		int result = 0;
		int numeroRecibido = pPiedraPapelTijera.getNumero();
		switch (numeroRecibido) {
		case PAPEL:
			result = 1; // Gana
			descripcionResultado = nombre + " devora " + pPiedraPapelTijera.getNombre();
			break;
		case TIJERA:
			result = -1; // Pierde
			descripcionResultado = nombre + " es decapitado por " + pPiedraPapelTijera.getNombre();
			break;
		case PIEDRA:
			result = -1; // Pierde
			descripcionResultado = nombre + " es aplastado por " + pPiedraPapelTijera.getNombre();
			break;
		case SPOCK:
			result = 1; // Gana
			descripcionResultado = nombre + " envenena a " + pPiedraPapelTijera.getNombre();
			break;
		default:
			result = 0; // Empate
			descripcionResultado = nombre + " empata con " + pPiedraPapelTijera.getNombre();
			break;
		}
		return result;
	}

}
