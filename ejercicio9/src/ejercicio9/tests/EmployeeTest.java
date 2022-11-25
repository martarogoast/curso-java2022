package ejercicio9.tests;

import java.util.Date;

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
	
	Employee marta;
	Employee lucy;
	Employee nadie;
	Employee jefe;
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	void setUp() throws Exception {
		marta = new Employee("Marta", 30, 15000);
		lucy = new Employee("Lucy", 25, 17000);
		nadie = new Employee(null, 0, 0);
		jefe = new Employee("Jefazo", 57, 100000, new Date(1980,12,25));
	}

	@AfterEach
	void tearDown() throws Exception {
		marta = null;
		lucy = null;
		nadie = null;
		jefe = null;
	}

	@Test
	void testEquals_true() {
		@SuppressWarnings("deprecation")
		Date ingresoPrueba = new Date(1980,12,25);
		Employee jefeTest = new Employee("Jefazo", 57, 100000, ingresoPrueba);
		assertTrue(jefe.equals(jefeTest));
	}
	
	@Test
	void testEquals_false() {
		@SuppressWarnings("deprecation")
		Date ingresoPrueba = new Date(2002,12,15);
		Employee newEmployee = new Employee("Novato", 57, 100000, ingresoPrueba);
		assertFalse(jefe.equals(newEmployee));
	}
	
	@Test
	void testToString_true() {
		String stringEmployee = new String("Nombre: Jefazo, Edad: 57, Salario: 100000€, Fecha de ingreso: 1980/11/25");
		assertTrue(jefe.toString().equals(stringEmployee));
	}

}
