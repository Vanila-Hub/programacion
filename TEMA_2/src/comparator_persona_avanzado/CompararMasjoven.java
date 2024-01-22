package comparator_persona_avanzado;

import java.util.Comparator;

public class CompararMasjoven implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		return o2.getFecha_nacimiento().compareTo(o1.getFecha_nacimiento());
	}

}
