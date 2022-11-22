package ej2;

import java.util.Scanner;

public class HelloWorld {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
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
		System.out.println("Introduzca su calificación");
		int calificación = sc.nextInt();
		//TODO completar
		if (calificación>=0&&calificación<50) {
			System.out.println("Suspenso");
		} else if (calificación>=50&&calificación<75) {
			System.out.println();
		}
	}

}
