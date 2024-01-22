package comparator_persona;

import java.util.Comparator;

import comparator.Persona;

public class ComparadorPersonas implements Comparator<PersonaAvanzadas>{

	@Override
	public int compare(PersonaAvanzadas p1, PersonaAvanzadas p2) {
		return p1.getNombre().compareTo(p2.getNombre());
	}
}
