package ejercicio4;

public class Pila {
	
	public static void main(String[] args) {
		MiPila pila = new MiPila();
		pila.push("hola");
		pila.push("que");
		pila.push("tal");
		System.out.println("Lista original");
		System.out.println(pila.toString());
		
		pila.pop();
		pila.push("tal");
		pila.reverse();
		System.out.println("Lista invertida");
		System.out.println(pila.toString());

		System.out.println("Ultimo elemento; " + pila.peek());
	}
}
