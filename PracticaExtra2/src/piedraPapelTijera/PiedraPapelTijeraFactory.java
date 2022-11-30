package piedraPapelTijera;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marta Rodriguez
 *
 */
public abstract class PiedraPapelTijeraFactory {
	public static final int PIEDRA = 1;
	public static final int  PAPEL = 2;
	public static final int TIJERA = 3;
	
	protected String 								descripcionResultado;
	private static  List<PiedraPapelTijeraFactory> 	elementos;
	protected String 								nombre;
	protected int 									numero;
	
	//Constructor
	public PiedraPapelTijeraFactory(String nombre, int numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}
	
	//Getters y setters
	public String getNombre() {						return nombre;					}
	public void setNombre(String nombre) {			this.nombre = nombre;			}
	
	public int getNumero() {						return numero;					}
	public void setNumero(int numero) {				this.numero = numero;			}
	
	public String getDescripcionResultado() {		return descripcionResultado;	}
	
	//Metodos
	public abstract boolean isMe(int numero);
	public abstract int comparar(PiedraPapelTijeraFactory factory) ;
	
	public static PiedraPapelTijeraFactory getInstance(int numero) {
		//El padre conoce a todos sus hijos
		elementos = new ArrayList<PiedraPapelTijeraFactory>();
		elementos.add(new Piedra());
		elementos.add(new Papel());
		elementos.add(new Tijera());
		
		for (PiedraPapelTijeraFactory piedraPapelTijeraFactory : elementos) {
			if (piedraPapelTijeraFactory.isMe(numero))
				return piedraPapelTijeraFactory;
		}
		return null;
	}
}
