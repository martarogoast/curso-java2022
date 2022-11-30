package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import ejercicio14.Persona;

public abstract class PersonasUtil {
	
	/**
	 * Dada una lista de personas, retorna un Map de esas personas
	 * @param personasList Lista de personas
	 * @return Map con las personas como valor y su expediente como clave
	 */
	public static Map<Integer, Persona> getPersonas(List<Persona> personasList) {
		Map<Integer, Persona> personasMap = new HashMap<Integer, Persona>();
		Iterator<Persona> it = personasList.iterator();
		
		while(it.hasNext()) {
			Persona persona = (Persona) it.next();
			personasMap.put(persona.getExpediente(), persona);
		}
		return personasMap;
	}
	
	/**
	 * Ordenamos las personas
	 * @param personasList Lista desordenada de personas
	 * @return TreeSet de personas ordenadas
	 */
	public static TreeSet<Persona> ordenarPersonas(List<Persona> personasList){
		TreeSet<Persona> personasSet = new TreeSet<Persona>();
		for (Persona persona : personasList) {
			personasSet.add(persona);
		}
		return personasSet;
	}
}
