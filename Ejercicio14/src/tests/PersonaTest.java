package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio14.Persona;

class PersonaTest {
	private Persona persona;
	
	@BeforeEach
	void setUp() throws Exception {
		persona = new Persona(123456, 30, "Marta");
	}

	@AfterEach
	void tearDown() throws Exception {
		persona = null;
	}

	@Test
	void testPersonaGetNombre() {
		assertEquals(persona.getNombre(), "Marta");
	}
	
	@Test
	void testPersonaGetExp() {
		assertEquals(persona.getExpediente(), 123456);
	}
	
	@Test
	void testPersonaGetEdad() {
		assertEquals(persona.getEdad(), 30);
	}
	
	@Test
	void testPersonaSetEdad() {
		persona.setEdad(35);
		assertEquals(persona.getEdad(), 35);
	}
	
	@Test
	void testPersonaSetNombre() {
		persona.setNombre("Martaaaaa");
		assertEquals(persona.getNombre(), "Martaaaaa");
	}
	
	@Test
	void testPersonaSetExp() {
		persona.setExpediente(13848233);
		assertEquals(persona.getExpediente(), 13848233);
	}

}
