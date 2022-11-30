package ejercicio6.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio6.ItemInventario;
import ejercicio6.Pc;
import ejercicio6.Silla;

class ItemInventarioTest {

	private ArrayList<ItemInventario> items;
	private Pc pc;
	private Silla silla;
	
	@BeforeEach
	void setUp() throws Exception {
		items = new ArrayList<ItemInventario>();
		pc = new Pc(11111111, false, 654321);
		
		silla = new Silla(20, 12590, true);
		items.add(new Pc(11111111, false, 654321));
		items.add(new Pc(11111112, true, 123456));
		items.add(new Silla(19, 12576, false));
		items.add(new Silla(20, 12590, true));
	}

	@AfterEach
	void tearDown() throws Exception {
		items = null;
	}

	//Silla
	@Test
	void testConstructorSilla() {
		assertEquals(silla.getID(),silla.getLote()*1000 + silla.getNumeroDentroDeLote());
		assertEquals(silla.getLote(), 20);
		assertEquals(silla.getNumeroDentroDeLote(), 12590);
		assertEquals(silla.isConRueditas(), true);
	}
	
	//PC
	@Test
	void testConstructorPc() {
		assertEquals(pc.getID(),pc.getNroSerie());
		assertEquals(pc.isNotebook(), false);
		assertEquals(pc.getBarcode(), 654321);
	}
	
	//PC
	@Test
	void test() {
		assertTrue(items.contains(pc));
	}

}
