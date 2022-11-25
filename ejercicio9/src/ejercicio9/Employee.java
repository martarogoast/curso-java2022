package ejercicio9;

import java.text.SimpleDateFormat;
/**
 * @author Marta Rodriguez
 */
import java.util.Date;

/**
 * Clase con la que crear un empleado de una empresa y almacenar algunos detalles básicos de dicho empleado
 * @author Marta Rodriguez
 *
 */
public class Employee {
	private Date fechaIngreso;
	private double salario;
	private String nombre;
	private int edad;
	
	// getters y setters
	/**
	 * Obtiene la fecha de ingreso del empleado.
	 * @return java.util.Date: Fecha de ingreso del empleado
	 */
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	
	/**
	 * Añade la fecha de ingreso. Si es null, se agrega la fecha de hoy
	 * @param fechaIngreso Fecha de ingreso a la empresa
	 */
	public void setFechaIngreso(Date fechaIngreso) {
		if (fechaIngreso == null) 
			fechaIngreso = new Date();
		else 
			this.fechaIngreso = fechaIngreso;
	}
	
	/**
	 * Salario anual bruto en euros.
	 * @return double 
	 */
	public double getSalario() {
		return salario;
	}
	
	/**
	 * Cambiar el salario del empleado.
	 * @param salario Salario anual bruto en euros.
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * Obtiene el nombre completo del empleado. 
	 * @return String Nombre del empleado.
	 */
	public String getNombre() {
		return nombre;
	}
	
	//TODO Acabar documentacion
	public void setNombre(String nombre) {
		if (nombre ==null) nombre = ""; 	//Garantizamos que el nombre no sea nunca null
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Constructores
	private Employee() {
		nombre = "";
		fechaIngreso = new Date();
	}
	
	/**
	 * Crea un Empleado e introduce como fecha de ingreso hoy
	 * @param nombre Nombre Completo del empleado: Nombre Apellidos
	 * @param edad Edad del empleadp
	 * @param salario Salario anual bruto en euros
	 */
	public Employee(String nombre, int edad, double salario) {
		this();
		setNombre(nombre);
		this.edad = edad;
		this.salario = salario;
		setFechaIngreso(new Date());
	}
	
	/**
	 * Crea un Empleado e introduce como fecha de ingreso hoy
	 * @param nombre Nombre Completo del empleado: Nombre Apellidos
	 * @param edad Edad del empleadp
	 * @param salario Salario anual bruto en euros
	 * @param fechaIngreso Fecha de ingreso en la empresa
	 */
	public Employee(String nombre, int edad, double salario, Date fechaIngreso) {
		this();
		setNombre(nombre);
		this.edad = edad;
		this.salario = salario;
		setFechaIngreso(new Date());
	}
	
	/**
	 * Retorna un código hash para el objeto.
	 */
	@SuppressWarnings("removal")
	@Override
	public int hashCode() {
		return 7 * nombre.hashCode()
				+ 11 * new Double(salario).hashCode()
				+ 13 * fechaIngreso.hashCode()
				+ 17 * new Integer(edad).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if (obj instanceof Employee) {
			Employee newEmployee = (Employee) obj;
			isEqual = this.edad == newEmployee.edad &&
					this.salario == newEmployee.salario &&
					this.nombre.equals(newEmployee.nombre) &&
					this.fechaIngreso.equals(fechaIngreso);
		}
		return isEqual;
	}
	
	@Override
	public String toString() {  
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre: ");
		sb.append(getNombre());
		sb.append(", Edad: ");
		sb.append(getEdad());
		sb.append(", Salario: ");
		sb.append((int)getSalario());
		sb.append("€, Fecha de ingreso: ");
		sb.append((new SimpleDateFormat("yyyy/MM/dd"))
				.format(getFechaIngreso())).toString();
		return sb.toString();
	}
	
}
