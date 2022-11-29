package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ejercicio13.Persona;

public abstract class PersonasUtil {
	
	/**
	 * Dada una lista de personas, retorna un Map de esas personas
	 * @param personaList Lista de personas
	 * @return Map con las personas como valor y su expediente como clave
	 */
	public static Map<Integer, Persona> getPersonas(List<Persona> personaList) {
		Map<Integer, Persona> personas = new HashMap<Integer, Persona>();
		Iterator<Persona> it = personaList.iterator();
		Persona persona=null;
		
		while(it.hasNext()) {
			persona = it.next();
			personas.put(persona.getExpediente(), persona);
		}
		return personas;
	}
}
