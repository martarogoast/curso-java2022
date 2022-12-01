package piedraPapelTijeraLagartoSpock;

import java.util.Scanner;

/**
 * Juego de Piedra papel tijera - Usuario vs Ordenador
 * @author Marta Rodriguez
 *
 */
public class Jugar {

	public static void main(String[] args) {
		//Mano del usuario
		System.out.println("Vamos a jugar a Piedra - Papel - Tijera!!!");
		System.out.println("Juegue su mano introduciendo un numero");
		System.out.println("1 - Piedra	2 - Papel	3 - Tijera	4 - Lagarto	5 - Spock");
		Scanner sc = new Scanner(System.in);
		int numUser = sc.nextInt();
		
		//Mano del ordenador
		int numPc = (int)(Math.random()*5) + 1;
		
		PiedraPapelTijeraFactory manoUsuario = PiedraPapelTijeraFactory.getInstance(numUser);
		PiedraPapelTijeraFactory manoPC = PiedraPapelTijeraFactory.getInstance(numPc);
		
		manoUsuario.comparar(manoPC);
		System.out.println("---------------------------------");
		System.out.println("El resultado del juego es...\n");
		System.out.println("El usuario eligio:   " + manoUsuario.getNombre());
		System.out.println("El ordenador eligio: " + manoPC.getNombre());
		System.out.println("Resultado: " + manoUsuario.getDescripcionResultado());
		
		sc.close();
	}

}
