package generico;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class MiPilaGenerica<T> {
	private  ArrayList<T> list;
	 
	//Constructores
	public MiPilaGenerica() {
		list = new ArrayList<>();
	}
	
	public MiPilaGenerica (List<T> lista) {
		list = (ArrayList<T>) lista;
	}

	//Metodos del ejercicio
	/**
	 * Invierte el orden de los elementos
	 */
	public void reverse() {
		ArrayList<T> reversedList = new ArrayList<>();
		for (int i=list.size()-1; i>=0;i--) {
			reversedList.add((T) list.get(i));
		}
		list=reversedList;
	}
	
	/**
	 * @return Ultimo elemento de la lista
	 */
	public T peek() {
		return list.get(list.size()-1);
	}
	
	/**
	 * Incrusta un elemento al final de la pila
	 * @param elemento Elemento a añadir
	 */
	public void push(T elemento) {
		list.add(elemento);
	}
	
	/**
	 * Elimina el último elemento de la lista y lo devuelve a quien le llama
	 * @return elemento eliminado
	 */
	public T pop() {
		T exit = (T) list.get(list.size()-1);
		list.remove(list.size()-1);
		return exit;
	}
	
	public List<?> getList(){
		return list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return ((MiPilaGenerica<?>)obj).getList().equals(list);
	}

	@Override
	public String toString() {
		return "MiPilaGenerica [list=" + list + "]";
	}

	
	
}
