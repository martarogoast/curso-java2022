package modulo1;

import java.util.Scanner;

/**
 * 
 * @author Marta Rodríguez
 * Ejemplo de ingreso de datos y como se utiliza para diferentes operaciones
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String("Hola Marta");
		
		System.out.println("Ingrese un numero: ");
		int i = sc.nextInt();
		
		
		int nro = (int) (Math.random()*100);
		System.out.println("Loteria Marta: "+nro);
		
		if (nro == i) {
			System.out.println("Ganaste!");
		} else {
			System.out.println("Ooooooooh! Sigue jugando");
		}
	}

}
