package comparator;

import java.util.Comparator;

public class CompararAreas implements Comparator<Figura>{

	@Override
	public int compare(Figura f1, Figura f2) {
		 
		return Double.compare(f1.getArea(), f2.getArea());
	}

}
