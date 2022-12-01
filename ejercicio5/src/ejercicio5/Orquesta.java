package ejercicio5;

import java.util.ArrayList;

/**
 * 
 * @author Marta Rodriguez
 *
 */
public class Orquesta {

	private static ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();
			
	public static void main(String[] args) {
		//Creamos la orquesta
		instrumentos.add(new Guitarra());
		instrumentos.add(new Piano());
		instrumentos.add(new Violin());
		for(int i = 0; i<instrumentos.size();i++) {
			System.out.println(instrumentos.get(i).sonar());;
		}
	}

}
