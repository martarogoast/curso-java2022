package figuras.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Figura;
import figuras.exceptions.FiguraException;

class FiguraTest {

	//1- lote de pruebas
	Cuadrado cuadrVacio;
	Cuadrado cuadLleno;
	Circulo circVacio;
	Circulo cirLleno;
	
	List<Figura> figurasList;
	Set<Figura> figurasSet;
	
	@BeforeEach
	void setUp() throws Exception {
		//lote de pruebas
		cuadrVacio = new Cuadrado();
		cuadLleno = new Cuadrado("cuadrado", 10);
		
		circVacio = new Circulo();
		cirLleno = new Circulo("circulo", 10);
		
		figurasList = new ArrayList<>();
		figurasList.add(cuadrVacio);
		figurasList.add(cuadLleno);
		figurasList.add(circVacio);
		figurasList.add(cirLleno);
		figurasList.add(new Cuadrado("cuadrado 2", 15));
		figurasList.add(new Circulo("circulo 2", 15));
		
		figurasSet = new HashSet<>();
		figurasSet.add(cuadrVacio);
		figurasSet.add(cuadLleno);
		figurasSet.add(circVacio);
		figurasSet.add(cirLleno);
		figurasSet.add(new Cuadrado("cuadrado 2", 15));
		figurasSet.add(new Circulo("circulo 2", 15));
	}

	@AfterEach
	void tearDown() throws Exception {
		cuadrVacio = null;
		cuadLleno = null;
		circVacio = null;
		cirLleno = null;
		figurasSet = null;
		figurasList = null;
		Figura.clear();
	}

	//Cuadrado lleno
	@Test
	void testCuadradoLlenoGetNombre() {
		assertEquals("cuadrado",cuadLleno.getNombre());
	}
	
	@Test
	void testCuadradoLlenoGetLado() {
		assertEquals(10, cuadLleno.getLado(),0.001); //precisión a nivel milesima
	}
	
	@Test
	void testCuadradoPerimetro() {
		assertEquals(40, cuadLleno.calcularPerimetro(),0.001);
	}
	
	@Test
	void testCuadradoSuperficie() {
		assertEquals(100, cuadLleno.calcularSuperficie(),0.001);
	}
	
	@Test
	void testCuadradoVacioGetNombre() {
		assertEquals(null, cuadrVacio.getNombre());
	}
	
	//Test de equals y hashcode de cuadrado
	@Test
	void testCuadradoEqualHashcodeList_True() throws FiguraException {
		assertTrue(figurasList.contains(new Cuadrado("cuadrado", 10)));
	}
	
	@Test
	void testCuadradoEqualHashcodeList_False() throws FiguraException {
		assertFalse(figurasList.contains(new Cuadrado("cuadradito", 10)));
	}
	
	@Test
	void testCuadradoEqualsList_cantidad() {
		figurasList.add(new Cuadrado());
		assertEquals(7, figurasList.size());
	}
	
	@Test
	void testCuadradoEqualsSet_cantidad() throws FiguraException {
		figurasSet.add(new Cuadrado("cuadrado", 10));
		assertEquals(6, figurasSet.size()); //No la deberia agregar porque ya hay uno
	}
	
	@Test
	void testCuadradoEquals_true() {
		Cuadrado miCuadrado;
		try {
			miCuadrado = new Cuadrado("cuadrado", 10);
			assertTrue(cuadLleno.equals(miCuadrado));
		} catch (FiguraException e) {
			assertTrue(false); // lo pinto de rojo porque no deberia llegar
			e.printStackTrace();
		}
	}
	
	@Test
	void testCuadradoEquals_false() throws FiguraException {
		Cuadrado miCuadrado = new Cuadrado("cuadradito",15);
		assertFalse(cuadLleno.equals(miCuadrado));
	}
	
	@Test
	void testCuadradoFiguraException() {
		Cuadrado miCuadrado = new Cuadrado();
		System.out.println("--lista de figuras--");
		System.out.println(figurasList);
		System.out.println("--Cuadrado lleno--" + cuadLleno);
		try {
			miCuadrado.setLado(-5);
		} catch (FiguraException e) {
			assertEquals("El valor de lado no puede ser negativo", e.getMessage());
//			e.printStackTrace();
		}
	}
	
	@Test
	void testCantidadDeObjetos() {
		@SuppressWarnings("unused")
		Cuadrado cuadrado = new Cuadrado();
		assertEquals(9, Figura.getCantidadFiguras());
	}
	
	
//	void testCuadradoVacioGetLado() {
//		assertEquals(null, cuadrVacio.getLado(),0.001);
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
