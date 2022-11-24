package figuras;

/**
 * @author  Marta Rodriguez
 * Figura de tipo circulo
 */
public class Circulo extends Figura {
	private float radio;
	
	//Getters y setters
	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	//Constructores
	public Circulo() {}

	public Circulo(String nombre, float pRadio) {
		super(nombre);
		radio=pRadio;
	}
	
	//Métodos sobreescritos de Figura
	@Override
	public float calcularPerimetro() {
		return 2*(float)Math.PI*radio;
	}

	@Override
	public float calcularSuperficie() {
		return (float)Math.PI*radio*radio; //radio al cuadrado también es (float)Math.pow(radio,2)
	}
	
	
	//Metodos sobreescritos de Object
	@Override
	public int hashCode() {
		return super.hashCode()+(int)radio;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) &&
				obj instanceof Circulo &&
				((Circulo)obj).getRadio() == radio;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", radio: ");
		sb.append(radio);
		return sb.toString();
	}

}
