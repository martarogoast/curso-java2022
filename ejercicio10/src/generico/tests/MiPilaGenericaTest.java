package generico.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import generico.MiPilaGenerica;
import planetas.Planeta;

class MiPilaGenericaTest {
	
	private List<Planeta> planetasLista;
	private MiPilaGenerica<Planeta> planetasPila;
	
	@BeforeEach
	void setUp() throws Exception {
		planetasLista = new ArrayList<Planeta>();
		planetasLista.add(Planeta.MERCURIO);
		planetasLista.add(Planeta.VENUS);
		planetasLista.add(Planeta.TIERRA);
		
		planetasPila = new MiPilaGenerica<>(planetasLista);
	}

	@AfterEach
	void tearDown() throws Exception {
		planetasLista = null;
		planetasPila = null;
	}
	
	//Constructor
	@Test
	void testConstructorParametros(){
		ArrayList<Planeta> nuevaLista = new ArrayList<Planeta>();
		nuevaLista.add(Planeta.MERCURIO);
		nuevaLista.add(Planeta.VENUS);
		nuevaLista.add(Planeta.TIERRA);
		assertEquals(planetasPila.getList(), nuevaLista);
	}
	
	//Metodos
	@Test
	void testPeek(){
		assertEquals(planetasPila.peek(), Planeta.TIERRA);
	}
	
	@Test
	void testPop(){
		assertEquals(planetasPila.pop(), Planeta.TIERRA);
	}
	
	@Test
	void testPush(){
		planetasPila.push(Planeta.URANO);
		assertEquals(planetasPila.peek(), Planeta.URANO);
	}
	
	@Test
	void testReverse(){
		ArrayList<Planeta> nuevaLista = new ArrayList<Planeta>();
		nuevaLista.add(Planeta.TIERRA);
		nuevaLista.add(Planeta.VENUS);
		nuevaLista.add(Planeta.MERCURIO);
		MiPilaGenerica<Planeta> pilaInvertida = new MiPilaGenerica<>(nuevaLista);
		
		planetasPila.reverse();
		
		assertEquals(planetasPila, pilaInvertida);
	}
	
	@Test
	void testPilaGenerica() {
		assertTrue(planetasLista.contains(Planeta.VENUS));
	}

}
