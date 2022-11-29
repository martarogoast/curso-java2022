package ejercicio13;

public class Persona {
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
}
