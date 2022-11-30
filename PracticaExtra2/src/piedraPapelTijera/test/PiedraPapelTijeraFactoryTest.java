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

class PiedraPapelTijeraFactoryTest {
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
	}
	@Test
	void testPiedraEmpataPiedra() {
		assertEquals(piedra.comparar(new Piedra()), 0);
	}
	@Test
	void testPiedraPierdeConPapel() {
		assertEquals(piedra.comparar(papel), -1);
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
		}
		@Test
		void testPapelPierdeConTijeraTexto() {
			papel.comparar(tijera);
			assertEquals(papel.getDescripcionResultado(), "papel pierde con tijera");
		}
		
		//Tijera - comparar
		@Test
		void testTijeraGanaPapel() {
			assertEquals(tijera.comparar(papel), 1);
		}
		@Test
		void testTijeraGanaPapelTexto() {
			tijera.comparar(papel);
			assertEquals(tijera.getDescripcionResultado(), "tijera gana a papel");
		}
		
		@Test
		void testTijeraEmpataTijera() {
			assertEquals(tijera.comparar(new Tijera()), 0);
		}
		@Test
		void testTijeraEmpataTijeraTexto() {
			tijera.comparar(new Tijera());
			assertEquals(tijera.getDescripcionResultado(), "tijera empata con tijera");
		}
		
		@Test
		void testTijeraPierdeConPiedra() {
			assertEquals(tijera.comparar(piedra), -1);
		}
		@Test
		void testTijeraPierdeConPiedraTexto() {
			tijera.comparar(piedra);
			assertEquals(tijera.getDescripcionResultado(), "tijera pierde con piedra");
		}
}
