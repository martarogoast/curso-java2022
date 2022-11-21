package modulo1;

import java.util.Scanner;

public class AdivinaUnNumero {

	public static void main(String[] args) {
		/* 1 El ordenador elige  un numero entre 0 y 100
		 * 2 El participante introduce un numero
		 * 3 El sistema debe indicar si es mayor o menor
		 * 4 Se deben contar los intentos
		 * 5 Cuando acierte, felicitar y decir el numero de intentos
		 * Se debe de utilizar algun tipo de ciclo
		 */
		
		try (Scanner sc = new Scanner(System.in)) {
			int numeroAleatorio = (int) (Math.random()*100);

			int numeroIngresado;
			int i=0;
			
			do {
				System.out.println("Ingrese un numero: ");
				numeroIngresado = sc.nextInt();
				 
				if (numeroAleatorio > numeroIngresado) {
					System.out.println("El numero de la loteria es mayor");
				} else if (numeroAleatorio < numeroIngresado){
					System.out.println("El numero de la loteria es menor");
				}
				i++;
			}while (numeroAleatorio!=numeroIngresado);

			System.out.println("Felicidades! Has necesitado: "+ i +" intentos!");
		}catch (Exception E) {
			System.out.println("Eso no era un numero");
		}
	}
}
