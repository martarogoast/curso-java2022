package ejercicio6;

import java.util.ArrayList;

public class Inventario {

	public static void main(String[] args) {
		ArrayList<ItemInventario> items = new ArrayList<ItemInventario>();
		items.add(new Pc(11111111, false, 654321));
		items.add(new Pc(11111112, true, 123456));
		items.add(new Silla(19, 12576, false));
		items.add(new Silla(20, 12590, true));

	}

}
