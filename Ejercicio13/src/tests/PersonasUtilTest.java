package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio13.Persona;
import util.PersonasUtil;

class PersonasUtilTest {
	private Persona marta;
	private Persona marina;

	@BeforeEach
	void setUp() throws Exception {
		marta = new Persona(123456, 30, "Marta");
		marina = new Persona(654321, 37, "Marina");
	}

	@AfterEach
	void tearDown() throws Exception {
		marta = null;
		marina = null;
	}

	@Test
	void testPersonaGetNombre() {
		assertEquals(marta.getNombre(), "Marta");
	}
	
	@Test
	void testPersonaGetExp() {
		assertEquals(marta.getExpediente(), 123456);
	}
	
	@Test
	void testPersonaGetEdad() {
		assertEquals(marta.getEdad(), 30);
	}
	
	@Test
	void testPersonaSetEdad() {
		marta.setEdad(35);
		assertEquals(marta.getEdad(), 35);
	}
	
	@Test
	void testPersonaSetNombre() {
		marta.setNombre("Martaaaaa");
		assertEquals(marta.getNombre(), "Martaaaaa");
	}
	
	@Test
	void testPersonaSetExp() {
		marta.setExpediente(13848233);
		assertEquals(marta.getExpediente(), 13848233);
	}
	

	@Test
	void testGetPersonasMap() {
		Map<Integer, Persona> personasMap = new HashMap<Integer, Persona>();
		personasMap.put((Integer)marta.getExpediente(), marta);
		personasMap.put((Integer)marina.getExpediente(), marina);
		
		List<Persona> personaList = new ArrayList<Persona>();
		personaList.add(marta);
		personaList.add(marina);
		
		Map<Integer, Persona> personasGetPersonas =  PersonasUtil.getPersonas(personaList);
		assertTrue(personasMap.equals(personasGetPersonas));
	}
}
