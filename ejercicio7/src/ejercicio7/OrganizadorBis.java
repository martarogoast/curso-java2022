package ejercicio7;

public class OrganizadorBis {

	public static void main(String[] args) {
		int [] array = new int[] {91,4,2,81,7,3};
		ordenar(array);
		System.out.println("");

	}
	
	/**
	 * Ordena un array de enteros en orden ascendente
	 * @param input Array de enteros
	 * @return Array input ordenado 
	 */
	public static int[] ordenar (int[]input) {
		ordenar(input, input.length);
		return input;
	}
	
	/**
	 * Ordena un array de int de longitud i
	 * @param input array de int
	 * @param i longitud del array 
	 * @return array ordenado
	 */
	private static int[] ordenar (int[]input, int i) {
		if (i > 1)
		    ordenar(input,i-1);

		  int j = i-1;
		  int auxiliar = input[j];

		  while ((j>0) && (input[j-1] > auxiliar)) {
			  input[j] = input[j-1];
		    j--;
		  }
		  input[j] = auxiliar;
		return input;
	}


}
