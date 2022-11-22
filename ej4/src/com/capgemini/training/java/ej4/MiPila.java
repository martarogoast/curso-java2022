package com.capgemini.training.java.ej4;

import java.util.ArrayList;

public class MiPila {
	private ArrayList<String> list;
	 
	public MiPila() {
		list = new ArrayList<String>();
		list.add("hola");
		list.add("que");
		list.add("tal");
		list.add("y");
		list.add("tu");
	}

	protected void reverse() {
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
	protected String peek() {
		return list.get(list.size()-1);
	}
	
	/**
	 * Devuelve el ultimo elemento de la lista
	 * @param string
	 */
	protected void push(String string) {
		list.add(string);
	}
	
	/**
	 * Elimina el último elemento de la lista
	 * @return elemento eliminado
	 */
	protected String pop() {
		String exit = list.get(list.size()-1);
		list.remove(list.size()-1);
		return exit;
	}
}
