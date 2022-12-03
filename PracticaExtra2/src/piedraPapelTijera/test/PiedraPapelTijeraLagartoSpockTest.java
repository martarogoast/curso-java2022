package piedraPapelTijera.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import piedraPapelTijeraLagartoSpock.*;

class PiedraPapelTijeraLagartoSpockTest {
	//lote de pruebas
	PiedraPapelTijeraFactory piedra, papel, tijera, lagarto, spock;
	
	@BeforeEach
	void setUp() throws Exception {
		piedra = 	new Piedra();
		papel = 	new Papel();
		tijera = 	new Tijera();
		lagarto = 	new Lagarto();
		spock = 	new Spock();
	}

	@AfterEach
	void tearDown() throws Exception {
		piedra = 	null;
		papel  = 	null;
		tijera = 	null;
		lagarto = 	null;
		spock = 	null;
	}

	//GetInstance
	@Test
	void testGetInstancePiedra() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA) instanceof Piedra);
	}
	@Test
	void testGetInstancePiedra_false() {
		assertFalse(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA) instanceof Papel);
	}

	@Test
	void testGetInstancePapel() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PAPEL) instanceof Papel);
	}
	
	@Test
	void testGetInstanceTijera() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.TIJERA) instanceof Tijera);
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
	@Test
	void testPiedraGanaLagarto() {
		assertEquals(piedra.comparar(lagarto), 1);
		assertEquals(piedra.getDescripcionResultado(), "piedra aplasta a lagarto");
	}
	@Test
	void testPiedraPierdeConSpock() {
		assertEquals(piedra.comparar(spock), -1);
		assertEquals(piedra.getDescripcionResultado(), "piedra es vaporizada por spock");
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
		@Test
		void testPapelPierdeConLagarto() {
			assertEquals(papel.comparar(lagarto), -1);
			assertEquals(papel.getDescripcionResultado(), "papel es devorado por lagarto");
		}
		@Test
		void testPapelGanaASpock() {
			assertEquals(papel.comparar(spock), 1);
			assertEquals(papel.getDescripcionResultado(), "papel desautoriza a spock");
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
		
		@Test
		void testTijeraGanaLagarto() {
			assertEquals(tijera.comparar(lagarto), 1);
			assertEquals(tijera.getDescripcionResultado(), "tijera decapita a lagarto");
		}
		
		@Test
		void testTijeraPierdeConSpock() {
			assertEquals(tijera.comparar(spock), -1);
			assertEquals(tijera.getDescripcionResultado(), "tijera es rota por spock");
		}
		
		//Lagarto - comparar
		@Test
		void testLagartoGanaPapel() {
			assertEquals(lagarto.comparar(papel), 1);
			assertEquals(lagarto.getDescripcionResultado(), "lagarto devora papel");
		}
		
		@Test
		void testLagartoPierdeConPiedra() {
			assertEquals(lagarto.comparar(piedra), -1);
			assertEquals(lagarto.getDescripcionResultado(), "lagarto es aplastado por piedra");
		}
		
		@Test
		void testLagartoPierdeConTijera() {
			assertEquals(lagarto.comparar(tijera), -1);
			assertEquals(lagarto.getDescripcionResultado(), "lagarto es decapitado por tijera");
		}

		@Test
		void testLagartoEmpataLagarto() {
			assertEquals(lagarto.comparar(new Lagarto()), 0);
			assertEquals(lagarto.getDescripcionResultado(), "lagarto empata con lagarto");
		}
		@Test
		void testLagartoGanaSpock() {
			assertEquals(lagarto.comparar(spock), 1);
			assertEquals(lagarto.getDescripcionResultado(), "lagarto envenena a spock");
		}
		
		//Spock - comparar
		@Test
		void testSpockPierdeConPapel() {
			assertEquals(spock.comparar(papel), -1);
			assertEquals(spock.getDescripcionResultado(), "spock es desautorizado por papel");
		}
		
		@Test
		void testSpockGanaPiedra() {
			assertEquals(spock.comparar(piedra), 1);
			assertEquals(spock.getDescripcionResultado(), "spock vaporiza a piedra");
		}
		
		@Test
		void testSpockGanaTijera() {
			assertEquals(spock.comparar(tijera), 1);
			assertEquals(spock.getDescripcionResultado(), "spock rompe tijera");
		}

		@Test
		void testSpockGanaLagarto() {
			assertEquals(spock.comparar(lagarto), 1);
			assertEquals(spock.getDescripcionResultado(), "spock es envenenado por lagarto");
		}
		@Test
		void testSpockEmpataSpock() {
			assertEquals(spock.comparar(new Spock()), 0);
			assertEquals(spock.getDescripcionResultado(), "spock empata con spock");
		}
}
