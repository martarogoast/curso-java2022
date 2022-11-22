package ej2;

import java.util.Scanner;

public class HelloWorld {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)  throws Exception {
		System.out.println("Hello world");
		//Imprimir la tablas de multiplicar
		for (int i =1;i<=10;i++) {
			System.out.println("Tabla del: "+i);
			for (int j=0;j<=10;j++) {
				System.out.println(Integer.toString(i)+"x"+Integer.toString(j)+" = "+Integer.toString(i*j));
			}
		}
		//Calificar
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su calificacion");
		int calificación = sc.nextInt();
		//TODO completar
		if (calificación>=0&&calificación<51) {
			System.out.println("Suspenso");
		} else if (calificación>=51&&calificación<=75) {
			System.out.println("Recuperar");
		} else if (calificación>75&&calificación<=90) {
			System.out.println("Aprobado");
		} else if (calificación>90&&calificación<=100) {
			System.out.println("Aprobado con merito");
		} else {
			System.out.println("Puntuacion invalida");
		}
		sc.close();
	}

}
