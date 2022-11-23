package ejercicio7;

public class Organizador {

	public static void main(String[] args) {
		int [] array = new int[] {91,4,2,81,7,3};
		ordenar(array);
		System.out.println("");

	}
	
	private static int[] ordenar (int[]input) {
		int auxiliar;
		for (int i = 0; i < input.length-1; i++) {
			for (int j = 1; j < input.length; j++) {
				if (input[j-1]>input[j]) {
					auxiliar = input[j-1];
					input[j-1]=input[j];
					input[j] = auxiliar;
				}
			}
		}
		return input;
	}

}
