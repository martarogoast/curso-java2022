package ejercicio4.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio4.MiPila;

class MiPilaTest {

	MiPila pilaVacia;
	MiPila pilaLlena;
	ArrayList<String> list;
	
	@BeforeEach
	void setUp() throws Exception {
		pilaVacia = new MiPila();
		
		list = new ArrayList<>();
		list.add("hola");
		list.add("que");
		list.add("tal");
		pilaLlena = new MiPila(list);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		pilaVacia = null;
		pilaLlena = null;
		list = null;
	}


	@Test
	void testConstructorWithParam() {
		ArrayList<String> contenido = new ArrayList<>();
		contenido.add("hola");
		contenido.add("que");
		contenido.add("tal");
		assertEquals(new MiPila(contenido).getList(), pilaLlena.getList());
	}
	
	@Test
	void testPop() {
		pilaLlena.pop();
		ArrayList<String> nuevaLista = new ArrayList<String>();
		nuevaLista.add("hola");
		nuevaLista.add("que");
		assertEquals(pilaLlena.getList(), new MiPila(list).getList());
	}
	
	@Test
	void testPushPeek() {
		pilaLlena.push("muy bien");
		assertEquals(pilaLlena.peek(), "muy bien");
	}
	
	@Test
	void testReverse() {
		pilaLlena.reverse();
		ArrayList<String> nuevaLista = new ArrayList<String>();
		nuevaLista.add("tal");
		nuevaLista.add("que");
		nuevaLista.add("hola");
		assertEquals(pilaLlena.getList(), new MiPila(nuevaLista).getList());
	}
	
	@Test
	void testEquals_true() {
		assertEquals(pilaLlena, pilaLlena);
	}
	
	@Test
	void testEquals_false() {
		assertNotEquals(pilaLlena, new MiPila());
	}
}
