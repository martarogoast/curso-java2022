package ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;

public class MiPila {
	private ArrayList<String> list;
	 
	//Constructores
	public MiPila() {
		list = new ArrayList<String>();
	}
	
	public MiPila (ArrayList<String> lista) {
		list = lista;
	}

	//Metodos del ejercicio
	/**
	 * Invierte el orden de los elementos
	 */
	public void reverse() {
		ArrayList<String> reversedList = new ArrayList<String>();
		for (int i=list.size()-1; i>=0;i--) {
			reversedList.add(list.get(i));
		}
		list=reversedList;
	}
	
	/**
	 * 
	 * @return Ultimo elemento de la lista
	 */
	public String peek() {
		return list.get(list.size()-1);
	}
	
	/**
	 * Inserta un elemento a la lista
	 * @param string elemento a añadir
	 */
	public void push(String string) {
		list.add(string);
	}
	
	/**
	 * Elimina el último elemento de la lista
	 * @return elemento eliminado
	 */
	public String pop() {
		String exit = list.get(list.size()-1);
		list.remove(list.size()-1);
		return exit;
	}
	
	/**
	 * @return ArrayList<String> Elementos de la pila
	 */
	public ArrayList<String> getList(){
		return list;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) &&
				obj instanceof MiPila &&
				((MiPila)obj).getList().equals(list);
	}

	@Override
	public int hashCode() {
		return super.hashCode()+list.hashCode();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			sb.append(it.next());
			sb.append("\t");
		}
		return sb.toString();
	}
	
}
