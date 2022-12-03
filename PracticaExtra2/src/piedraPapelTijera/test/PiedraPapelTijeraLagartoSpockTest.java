package piedraPapelTijera.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import piedraPapelTijera.Papel;
import piedraPapelTijera.Piedra;
import piedraPapelTijera.PiedraPapelTijeraFactory;
import piedraPapelTijera.Tijera;

class PiedraPapelTijeraLagartoSpockTest {
	//lote de pruebas
	PiedraPapelTijeraFactory piedra, papel, tijera;
	
	@BeforeEach
	void setUp() throws Exception {
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
	}

	@AfterEach
	void tearDown() throws Exception {
		piedra = null;
		papel  = null;
		tijera = null;
	}

	//GetInstance
	@Test
	void testGetInstancePiedra() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA) instanceof Piedra);;
	}
	@Test
	void testGetInstancePiedra_false() {
		assertFalse(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA) instanceof Papel);;
	}

	@Test
	void testGetInstancePapel() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PAPEL) instanceof Papel);;
	}
	
	@Test
	void testGetInstanceTijera() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.TIJERA) instanceof Tijera);;
	}
	
	
	//Piedra - comparar
	@Test
	void testPiedraGanaTijera() {
		assertEquals(piedra.comparar(tijera), 1);
		assertEquals(piedra.getDescripcionResultado(), "piedra gana a tijera");
	}
	@Test
	void testPiedraEmpataPiedra() {
		assertEquals(piedra.comparar(new Piedra()), 0);
		assertEquals(piedra.getDescripcionResultado(), "piedra empata con piedra");
	}
	@Test
	void testPiedraPierdeConPapel() {
		assertEquals(piedra.comparar(papel), -1);
		assertEquals(piedra.getDescripcionResultado(), "piedra pierde con papel");
	}
	
	//Papel - comparar
		@Test
		void testPapelGanaPiedra() {
			assertEquals(papel.comparar(piedra), 1);
			assertEquals(papel.getDescripcionResultado(), "papel gana a piedra");
		}
		
		@Test
		void testPapelEmpataPapel() {
			assertEquals(papel.comparar(new Papel()), 0);
			assertEquals(papel.getDescripcionResultado(), "papel empata con papel");
		}
		
		@Test
		void testPapelPierdeConTijera() {
			assertEquals(papel.comparar(tijera), -1);
			assertEquals(papel.getDescripcionResultado(), "papel pierde con tijera");
		}
		
		//Tijera - comparar
		@Test
		void testTijeraGanaPapel() {
			assertEquals(tijera.comparar(papel), 1);
			assertEquals(tijera.getDescripcionResultado(), "tijera gana a papel");
		}
		
		@Test
		void testTijeraEmpataTijera() {
			assertEquals(tijera.comparar(new Tijera()), 0);
			assertEquals(tijera.getDescripcionResultado(), "tijera empata con tijera");
		}
		
		@Test
		void testTijeraPierdeConPiedra() {
			assertEquals(tijera.comparar(piedra), -1);
			assertEquals(tijera.getDescripcionResultado(), "tijera pierde con piedra");
		}
}
