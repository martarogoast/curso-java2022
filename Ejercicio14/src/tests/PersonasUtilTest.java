package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio14.Persona;
import util.PersonasUtil;

class PersonasUtilTest {
	private Persona marta;
	private Persona marina;
	private Persona martaCopia;
	private Persona marinaCopia;
	private List<Persona> personasList;
	private List<Persona> copiaPersonasList;
	private Map<Integer, Persona> personasMap;

	@BeforeEach
	void setUp() throws Exception {
		marta = new Persona(123456, 30, "Marta");
		martaCopia = new Persona(123456, 30, "Marta");
		marina = new Persona(654321, 37, "Marina");
		marinaCopia = new Persona(654321, 37, "Marina");
		
		personasList = new ArrayList<Persona>();
		personasList.add(marta);
		personasList.add(marina);
		
		copiaPersonasList = new ArrayList<Persona>();
		copiaPersonasList.add(martaCopia);
		copiaPersonasList.add(marinaCopia);
		
		personasMap = new HashMap<Integer, Persona>();
		personasMap.put((Integer)marta.getExpediente(), marta);
		personasMap.put((Integer)marina.getExpediente(), marina);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		marta = null;
		marina = null;
		martaCopia = null;
		marinaCopia = null;
		personasList = null;
		copiaPersonasList = null;
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
	void testOrdenaPersonas_true(){
		Persona fulanito = new Persona(12,5, "fulanito"); 		//El mas joven
		personasList.add(fulanito);
		Persona menganito = new Persona(593,42, "menganito");	//El mas mayor
		personasList.add(menganito);
		
		Set<Persona> persOrd = PersonasUtil.ordenarPersonas(personasList);
		Iterator<Persona> it = persOrd.iterator();
		assertEquals(it.next().getNombre(), "fulanito");
		assertEquals(it.next().getNombre(), "Marta");
		assertEquals(it.next().getNombre(), "Marina");
		assertEquals(it.next().getNombre(), "menganito");
	}
}
