package ejercicio12.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio12.util.SetOperations;

class SetOperationsTest {
	Set <String> setA ;
	Set <String> setB;
	Set<Integer> setC;
	Set <Integer> setD;
	
	@BeforeEach
	void setUp() throws Exception {
		setA = new HashSet <String>();
		setB = new HashSet <String>();
		setC = new HashSet<Integer>();
		setD = new HashSet<Integer>();
		
		setA.add("a1");
		setA.add("a2");
		setA.add("ab1");
		setA.add("ab2");
		
		setB.add("b1");
		setB.add("b2");
		setB.add("ab1");
		setB.add("ab2");
		
		setC.add(1);
		setC.add(15);
		
		setD.add(5);
		setD.add(15);
	}

	@AfterEach
	void tearDown() throws Exception {
		setA = null;
		setB = null;
		setC = null;
		setD = null;
	}

	@Test
	void testUnionString() {
		Set <String> union = new HashSet <String>();
		union.add("a1");
		union.add("a2");
		union.add("ab1");
		union.add("ab2");
		union.add("b1");
		union.add("b2");
		assertTrue(SetOperations.union(setA, setB).equals(union));
	}
	
	@Test
	void testUnionInteger() {
		Set <Integer> union = new HashSet<Integer>();
		union.add(1);
		union.add(15);
		union.add(15);
		union.add(5);
		assertTrue(SetOperations.union(setC, setD).equals(union));
	}
	
	@Test
	void testInterseccionString() {
		Set <String> interseccion = new HashSet <String>();
		interseccion.add("ab1");
		interseccion.add("ab2");
		assertTrue(SetOperations.interseccion(setA, setB).equals(interseccion));
	}
	
	@Test
	void testInterseccionInteger() {
		Set <Integer> interseccion = new HashSet<Integer>();
		interseccion.add(15);
		assertTrue(SetOperations.interseccion(setC, setD).equals(interseccion));
	}

	@Test
	void testDiferenciaString() {
		Set <String> diferencia = new HashSet <String>();
		diferencia.add("a1");
		diferencia.add("a2");
		assertTrue(SetOperations.diferencia(setA, setB).equals(diferencia));
	}
	
	@Test
	void testDiferenciaInteger() {
		Set <Integer> diferencia = new HashSet<Integer>();
		diferencia.add(1);
		assertTrue(SetOperations.diferencia(setC, setD).equals(diferencia));
	}
	
	@Test
	void testDifSimetricaString() {
		Set <String> difSim = new HashSet <String>();
		difSim.add("a1");
		difSim.add("a2");
		difSim.add("b1");
		difSim.add("b2");
		assertTrue(SetOperations.difSimetrica(setA, setB).equals(difSim));
	}
	
	@Test
	void testDifSimetricaInteger() {
		Set <Integer> difSim = new HashSet<Integer>();
		difSim.add(1);
		difSim.add(5);
		assertTrue(SetOperations.difSimetrica(setC, setD).equals(difSim));
	}
}
