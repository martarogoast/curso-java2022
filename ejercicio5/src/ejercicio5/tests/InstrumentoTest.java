package ejercicio5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio5.Guitarra;
import ejercicio5.Piano;
import ejercicio5.Violin;
import ejercicio5.Tambor;

class InstrumentoTest {

	private Piano piano;
	private Guitarra guitarra;
	private Violin violin;
	private Tambor tambor;
	
	@BeforeEach
	void setUp() throws Exception {
		piano = new Piano();
		guitarra = new Guitarra();
		violin = new Violin();
		tambor = new Tambor();
	}

	@AfterEach
	void tearDown() throws Exception {
		piano = null;
		guitarra = null;
		violin = null;
		tambor = null;
	}

	@Test
	void testSonar() {
		assertEquals("Soy el piano",piano.sonar());
		assertEquals("Soy la guitarra",guitarra.sonar());
		assertEquals("Soy el violin",violin.sonar());
		assertEquals("Soy el tambor",tambor.sonar());
	}

}
