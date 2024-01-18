package comparator;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		run();
	}

	private static void run() {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		
		//crear arraylist de personas
		ArrayList<Persona> personas = new ArrayList<Persona>();
		//metes las personas en el arraylist add
		p1.setNombre("Juan");
		p1.setApellido("Asntero");
		p1.setDni("12357Y");
		p1.setFecha_nacimiento(new SimpleDateFormat("01/01/2000"));
		
		p2.setNombre("Antore");
		p2.setApellido("zara");
		p2.setDni("590568Y");
		p2.setFecha_nacimiento(new SimpleDateFormat("01/01/2000"));
		
		p3.setNombre("iker");
		p3.setApellido("Louri");
		p3.setDni("12357Y");
		p3.setFecha_nacimiento(new SimpleDateFormat("01/01/2000"));
		
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		//personas desordenadas
		for (Persona persona : personas) {
			System.out.println(persona.getNombre());
		}
		//personas.sort(new Persona());
		personas.sort(new ComparadorPersonas());
		//personas ordenadas
		for (Persona persona : personas) {
			System.out.println(persona.getNombre());
		}
		
	}

}
