package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ejercicio13.Persona;

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
}
