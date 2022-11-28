package ejercicio12;

import java.util.HashSet;
import java.util.Set;

import ejercicio12.util.SetOperations;

/**
 * Clase para probar SetOperations
 * @author Marta Rodriguez
 *
 */
public class PruebaSet {

	public static void main(String[] args) {
		Set <String> setA = new HashSet <String>();
		Set <String> setB = new HashSet <String>();
		
		setA.add("a1");
		setA.add("a2");
		setA.add("ab1");
		setA.add("ab2");
		
		setB.add("b1");
		setB.add("b2");
		setB.add("ab1");
		setB.add("ab2");
		
		Set<String> set = new HashSet<String>();
		System.out.println("Union");
		set = SetOperations.union(setA,setB);
		System.out.println(set.toString());
		
		System.out.println("Interseccion");
		set = SetOperations.interseccion(setA,setB);
		System.out.println(set.toString());
		
		System.out.println("Diferencia A-B");
		set = SetOperations.diferencia(setA,setB);
		System.out.println(set.toString());
		
		System.out.println("Diferencia simetrica");
		set = SetOperations.difSimetrica(setA,setB);
		System.out.println(set.toString());
	}

}
