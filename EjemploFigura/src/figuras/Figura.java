package figuras;

/**
 * 
 * @author Marta Rodríguez
 * Clase padre que da pautas para todas las figuras
 */
public abstract class Figura {
	private String nombre;
	private static int cantidadFiguras;

	//Constructores
	public Figura() {
		super();	//Llama al constructor de su padre (clase Object). Si no se escribe explicitamente, lo hace por defecto
		cantidadFiguras++;
	};

	public Figura(String nombre) {
		this(); //Llama al constructor sin atributos para añadir una figura mas al contador: Figura() 
		this.nombre = nombre;
	}

	
	//metodos
	public abstract float calcularPerimetro();
	public abstract float calcularSuperficie();
	
	public static void clear() {
		cantidadFiguras = 0;
	}
	
	//getters y setters
	public String getNombre() {
			return nombre;
		}

	/**
	 * Asigna el nombre del atributo
	 * @param nombre, corresponde con el de la figura	
	  */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static int getCantidadFiguras() {
		return cantidadFiguras;
	}

	
	//metodos sobreescritos
	@Override
	public int hashCode() {
		return nombre==null?0:nombre.hashCode();
	}
	

	@Override
	public boolean equals(Object obj) {
		boolean bln = false;
		if (obj instanceof Figura) {	//Saber si obj es de la clase Figura
			Figura fig = (Figura) obj; 	//Downcast - nos hace tener disponibles los métodos de Figura
			bln=fig.getNombre()!=null && fig.getNombre().equals(nombre);
			fig.getNombre();
		}
		return bln;
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("\nNombre: "); 	//Esto es mucho más rápido que hacer
		sb.append(nombre);									//"Nombre: " + nombre porque StringBuilder 
		return sb.toString();								//es mutable, no como String
	}

	
}
