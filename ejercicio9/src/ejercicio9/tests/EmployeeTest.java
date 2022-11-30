package ejercicio9.tests;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio9.Employee;

/**
 * Test de la clase Employee
 * @author Marta Rodriguez
 *
 */
class EmployeeTest {
	
	private SimpleDateFormat dateFormat;
	private Date hoy;
	Calendar cal;
	
	private Employee marta;
	private List<Employee> empleados;
	private Employee jefe;
	
	@BeforeEach
	void setUp() throws Exception {
		cal = Calendar.getInstance();
		hoy = cal.getTime();
		dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		
		marta = new Employee("Marta", 30, 15000);
		
		cal.set(1980, 11, 25);
		jefe = new Employee("Jefazo", 57, 100000, cal.getTime());
		
		empleados = new ArrayList<Employee>();
		empleados.add(marta);
		empleados.add(jefe);
		empleados.add(new Employee("Lucy", 25, 17000));
		empleados.add(new Employee(null, 0, 0));
		
	}

	@AfterEach
	void tearDown() throws Exception {
		cal = null;
		hoy = null;
		dateFormat = null;
		marta = null;
		jefe = null;
		empleados = null;
	}

	//Constructores
	@Test
	void testConstructorSinIngreso() {
		assertEquals(marta.getNombre(), "Marta");
		assertEquals(marta.getEdad(), 30);
		assertEquals(marta.getSalario(), 15000);
		assertEquals(dateFormat.format(marta.getFechaIngreso()), dateFormat.format(hoy));
	}
	@Test
	void testConstructorConIngreso() {
		cal.set(2022, 11, 15);		//15 Dic 2022
		Employee novato = new Employee("Novato", 21, 100000, cal.getTime());
		
		assertEquals(novato.getNombre(), "Novato");
		assertEquals(novato.getEdad(), 21);
		assertEquals(novato.getSalario(), 100000);
		assertEquals(novato.getFechaIngreso(),cal.getTime());
	}
	
	@Test
	void testEquals_true() {
		cal.set(1980, 11, 25);
		Employee jefeTest = new Employee("Jefazo", 57, 100000, cal.getTime());
		
		assertTrue(jefe.equals(jefeTest));
	}
	
	@Test
	void testEquals_false() {
		cal.set(1980, 11, 25);
		Employee newEmployee = new Employee("Novato", 57, 100000, cal.getTime());
		assertFalse(jefe.equals(newEmployee));
	}
	
	//TODO Falla
	@Test
	void testToString_true() {
		String stringEmployee = new String("Nombre: Jefazo, Edad: 57, Salario: 100000€, Fecha de ingreso: 1980/12/25");
		assertTrue(jefe.toString().equals(stringEmployee));
	}

}
