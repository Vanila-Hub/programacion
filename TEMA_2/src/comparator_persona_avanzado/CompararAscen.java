package comparator_persona_avanzado;

import java.util.Comparator;

public class CompararAscen implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
