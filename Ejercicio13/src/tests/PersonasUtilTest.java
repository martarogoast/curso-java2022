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
	private List<Persona> personasList;
	private Map<Integer, Persona> personasMap;

	@BeforeEach
	void setUp() throws Exception {
		marta = new Persona(123456, 30, "Marta");
		marina = new Persona(654321, 37, "Marina");
		
		personasList = new ArrayList<Persona>();
		personasList.add(marta);
		personasList.add(marina);
		
		personasMap = new HashMap<Integer, Persona>();
		personasMap.put((Integer)marta.getExpediente(), marta);
		personasMap.put((Integer)marina.getExpediente(), marina);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		marta = null;
		marina = null;
		personasList = null;
		personasMap = null;
	}

	@Test
	void testGetPersonasMap_true() {
		Map<Integer, Persona> expectedMap = new HashMap<Integer, Persona>();
		expectedMap.put(marta.getExpediente(), new Persona(marta.getExpediente(), marta.getEdad(), marta.getNombre()));
		expectedMap.put(marina.getExpediente(), new Persona(marina.getExpediente(), marina.getEdad(), marina.getNombre()));
		assertEquals(expectedMap, PersonasUtil.getPersonas(personasList));
	}
	
	@Test
	void testGetPersonasMap_false() {
		Map<Integer, Persona> expectedMap = new HashMap<Integer, Persona>();
		expectedMap.put(marta.getExpediente(), new Persona(marta.getExpediente(), 19, marta.getNombre()));
		expectedMap.put(marina.getExpediente(), new Persona(marina.getExpediente(), 27, marina.getNombre()));
		assertFalse(expectedMap.equals(PersonasUtil.getPersonas(personasList)));
	}
	
	
	@Test
	void testInsertion() {
		Persona nPersona = new Persona(666, 60, "Herminia");
		personasMap.put(nPersona.getExpediente(), nPersona);
		assertTrue(personasMap.containsKey(nPersona.getExpediente()));
	}
}
