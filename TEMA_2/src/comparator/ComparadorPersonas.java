package comparator;

import java.util.Comparator;

public class ComparadorPersonas implements Comparator<Persona>{


	public int compare(Persona p1, Persona p2) {
		
		return p1.getNombre().compareTo(p2.getNombre());
	}

}
