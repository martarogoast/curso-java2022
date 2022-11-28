package ejercicio10.tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio10.Planeta;

class planetasTest {

	private Planeta tierra;
	private ArrayList<Planeta> planetas;

	@BeforeEach
	void setUp() throws Exception {
		tierra = Planeta.getPlaneta("tierra");
		planetas = new ArrayList<>();
	}

	@AfterEach
	void tearDown() throws Exception {
		tierra = null;
		planetas = null;
	}

	@Test
	void testGetPlaneta() {
		assertEquals(tierra, Planeta.TIERRA);
	}

	@Test
	void testGetPlanetas() {
		planetas.add(Planeta.MERCURIO);
		planetas.add(Planeta.VENUS);
		planetas.add(Planeta.TIERRA);
		planetas.add(Planeta.MARTE);
		planetas.add(Planeta.JUPITER);
		planetas.add(Planeta.SATURNO);
		planetas.add(Planeta.URANO);
		planetas.add(Planeta.NEPTUNO);
		assertEquals(Planeta.getPlanetas(),planetas);
	}

	@Test
	void testToString() {
		assertEquals("Nombre: Tierra, masa: 5.976E24, radio: 6378140.0",tierra.toString());
	}
}
