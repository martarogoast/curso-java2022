package ejercicio10;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumerado de planetas del Sistema Solar con sus radios y masas
 * @author Marta Rodriguez
 *
 */
public enum Planeta {
	MERCURIO("Mercurio",3.303e+23, 2.4397e6),
	VENUS ("Venus",4.869e+24,6.0518e6),
	TIERRA ("Tierra",5.976e+24,	6.37814e6),
	MARTE("Marte", 6.421e+23, 3.3972e6),
	JUPITER("Jupiter",1.9e+27, 7.1492e7),
	SATURNO ("Saturno",	5.688e+26,	6.0268e7),
	URANO ("Urano",	8.686e+25,	2.5559e7),
	NEPTUNO("Neptuno", 1.024e+26,2.4746e7);

	private String nombre;
	private double masa;
	private double radio;
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	//Constructor
	Planeta(String nombre, double masa, double radio) {
		if (nombre!=null)	setNombre(nombre);
		if (masa>=0)		setMasa(masa);
		if (radio>=0)		setRadio(radio);
	}
	
	
	//Metodos
	/**
	 * Retorna el planeta dado un nombre
	 * @param nombre Nombre del planeta
	 * @return El planeta pedido
	 */
	public static Planeta getPlaneta(String nombre){
		
		return Planeta.valueOf(nombre.toUpperCase());
	}
	
	/**
	 * Retorna la lista de planetas con sus masas y radios
	 * @return Lista de todos los planetas
	 */
	public static List<Planeta> getPlanetas(){
		List<Planeta> planetas = new ArrayList<Planeta>();
		for (Planeta planeta : Planeta.values()) {
			planetas.add(planeta);
		}
		return planetas;
	}
	
	/**
	 * Devuelve a modo de String los atributos de un planeta.
	 * @param planeta
	 * @return Descripción del planeta
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ");
		sb.append(getNombre());
		sb.append(", masa: ");
		sb.append(getMasa());
		sb.append(", radio: ");
		sb.append(getRadio());
		return sb.toString();
	}
	
}
