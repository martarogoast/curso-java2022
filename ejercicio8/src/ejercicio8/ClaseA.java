package ejercicio8;

import exceptions.ExceptionA;
import exceptions.ExceptionB;

/**
 * @author Marta Rodriguez
 *
 */
public class ClaseA {
	
	/**
	 * @throws ExceptionA Tira una excepcion checked
	 */
	public static void a() throws ExceptionA {
		throw new ExceptionA ("Excepcion A :)");
	}
	
	/**
	 * @throws ExceptionB Tira una excepcion unchecked
	 */
	public static void b() throws ExceptionB {
		throw new ExceptionB("Excepcion B :(");
	}

}
