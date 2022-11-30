package ejercicio14;

import java.util.Objects;

public class Persona implements Comparable<Persona>{
	private int expediente;
	private int edad;
	private String nombre;
	
	//getters y setters TODO mejorarlos
	public int getExpediente() {
		return expediente;
	}
	public void setExpediente(int exp) {
		this.expediente = exp;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Constructores
	/**
	 * Objeto Persona con sus datos
	 * @param expediente Numero de expediente del trabajador
	 * @param edad Edad del trabajador
	 * @param nombre Nombre completo en formato Nombre Apellidos
	 */
	public Persona(int expediente, int edad, String nombre) {
		super();
		setExpediente(expediente);
		setEdad(edad);
		setNombre(nombre);
	}
	
	@Override
	public String toString() {
		return "Persona [expediente=" + expediente + ", edad=" + edad + ", nombre=" + nombre + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(edad, expediente, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && expediente == other.expediente && Objects.equals(nombre, other.nombre);
	}
	
	@Override
	public int compareTo(Persona o) {
		return ((Integer)edad).compareTo(o.getEdad());
	}
	
}
