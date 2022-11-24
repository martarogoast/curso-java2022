package figuras;

import figuras.exceptions.FiguraException;

/**
 * @author Marta Rodriguez
 * Figura de tipo cuadrado
 */
public class Cuadrado extends Figura {
	
	private float lado;	

	//Contructores
	public Cuadrado() {	}

	public Cuadrado(String pNombre, float plado) throws FiguraException {
		super(pNombre);
		setLado(plado); 	//Para que compruebe que no es un numero negativo
	}

	
	//Getters y setters
	public float getLado() {
		return lado;
	}

	
	public void setLado(float lado) throws FiguraException {
		if (lado<0) {
			throw new FiguraException("El valor de lado no puede ser negativo");
		}
		this.lado = lado;
	}
	
	
	//Metodos de Figura sobreescritos

	/**
	 * Calcula el perimetro del cuadrado
	 */
	@Override
	public float calcularPerimetro() {
		return lado*4;
	}

	/**
	 * Calcula la superficie del cuadrado
	 */
	@Override
	public float calcularSuperficie() {
		return lado*lado;
	}

	
	//Metodos sobreescritos de Object
	/**
	 * Retorna el hashCode al que se le añade el lado
	 */
	@Override
	public int hashCode() {
		return super.hashCode() + (int)lado;
	}

	/**
	 *Comprueba si el objeto pasado es un cuadrado de mismo lado
	 */
	@Override
	public boolean equals(Object obj) {
		// super.equals(obj) - Ejecuta el equals del padre (si es una figura que se llame igual)
		// obj instanceof Cuadrado - Si es un cuadrado
		// compruebo si el lado del objeto parámetro tiene el mismo lado (comparamos float con ==)
		return super.equals(obj) &&
				obj instanceof Cuadrado &&
				((Cuadrado)obj).getLado()==lado;
	}

	/**
	 * Retorna un String con el nombre y el lado del cuadrado
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", lado: ");
		sb.append(lado);
		return sb.toString();
	}

}
