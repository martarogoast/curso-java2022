package ejercicio12.util;

import java.util.HashSet;
import java.util.Set;

/**
 * Operaciones de conjuntos
 * @author Marta Rodriguez
 *
 */
public abstract class SetOperations {
	/**
	 * Union de dos conjuntos
	 * @param setA Conjunto A
	 * @param setB Conjunto B
	 * @return Union de A y B: Set de elmentos que estan en en A y B
	 */
	public static <T> Set<T> union(Set<T> setA, Set<T> setB) {
		Set <T> unionSet = new HashSet <T>(setA);
		unionSet.addAll(setB);
		return unionSet;
	}
	
	/**
	 * Interseccion de A y B
	 * @param setA Conjunto A
	 * @param setB Conjunto B
	 * @return Elementos que estan en A y B
	 */
	public static <T> Set<T> interseccion(Set<T> setA, Set<T> setB) {
		Set <T> intersectSet = new HashSet <T>(setA);
		intersectSet.retainAll(setB);
		return intersectSet;
	}
	
	/**
	 * Diferencia A-B
	 * @param setA Conjunto A
	 * @param setB Conjunto B
	 * @return Elementos de A que no estan en B
	 */
	public static <T> Set<T> diferencia(Set<T> setA, Set<T> setB) {
		Set <T> diftSet = new HashSet <T>(setA);
		diftSet.removeAll(setB);
		return diftSet;
	}
	
	/**
	 * Diferencia simetrica de A y B
	 * @param <T>
	 * @param setA Conjunto A
	 * @param setB Conjunto B
	 * @return Elementos de A y B que no estan en los dos
	 */
	public static <T> Set<T> difSimetrica(Set<T> setA, Set<T> setB) {
		Set <T> difsim = SetOperations.union(setA, setB);
		difsim.removeAll(SetOperations.interseccion(setA, setB));
		return difsim;
	}
}
