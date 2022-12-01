package piedraPapelTijeraLagartoSpock;

/**
 * 
 * @author Marta Rodriguez
 *
 */
public class Spock extends PiedraPapelTijeraFactory {

	//Constructores
	public Spock() {
		super("spock", SPOCK);
	}
	
	public Spock(String nombre, int numero) {
		super(nombre, numero);
	}

	//Metodos del padre
	@Override
	public boolean isMe(int numero) {
		return numero == SPOCK;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijera) {
		int result = 0;
		int numeroRecibido = pPiedraPapelTijera.getNumero();
		switch (numeroRecibido) {
		case PAPEL:
			result = -1; // Pierde
			descripcionResultado = nombre + " es desautorizado por " + pPiedraPapelTijera.getNombre();
			break;
		case TIJERA:
			result = 1; // Gana
			descripcionResultado = nombre + " rompe " + pPiedraPapelTijera.getNombre();
			break;
		case PIEDRA:
			result = 1; // Gana
			descripcionResultado = nombre + " vaporiza a " + pPiedraPapelTijera.getNombre();
			break;
		case LAGARTO:
			result = 1; // Pierde
			descripcionResultado = nombre + " es envenenado por " + pPiedraPapelTijera.getNombre();
			break;
		default:
			result = 0; // Empate
			descripcionResultado = nombre + " empata con " + pPiedraPapelTijera.getNombre();
			break;
		}
		return result;
	}

}
