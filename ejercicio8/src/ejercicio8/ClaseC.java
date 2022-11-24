package ejercicio8;

import exceptions.ExceptionA;

/**
 * Clase que lanza dos excepciones:
 * <li> Exception A: Checked exception, que nos obliga a rodearla con un try/catch o a que ClaseC tire esa excepcion.</li>
 * <li> Exception B: Unchecked exception, a la que el compilador no obliga hacer lo de la Exception A</li>
 * 
 * @author Marta Rodriguez
 */
public class ClaseC {

	public static void main(String[] args) {
		//Lanzamos la excepcion checked ExceptionA
		try {
			ClaseA.a();
		} catch (ExceptionA e) {
			e.printStackTrace();
		}
		//Lanzamos la excepcion unchecked Exception B
		ClaseA.b();
	}

}
