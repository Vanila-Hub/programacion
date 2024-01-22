package comparator_persona;

import java.text.SimpleDateFormat;
import java.util.ArrayList;import comparator.Persona;

public class Main {

	public static void main(String[] args) {
		run();
	}

	private static void run() {
		PersonaAvanzadas persona = new PersonaAvanzadas();
		ArrayList<PersonaAvanzadas> personas = new ArrayList<PersonaAvanzadas>();
		
		persona = new PersonaAvanzadas();
		persona.setApellido("Asumu");
		persona.setDni("12345d");
		persona.setFecha_nacimiento(new SimpleDateFormat("01/01/2000"));
		persona.setNombre("Juan ANtero");
		
		personas.add(persona);
		
		persona = new PersonaAvanzadas();
		persona.setApellido("Enel");
		persona.setDni("12345d");
		persona.setFecha_nacimiento(new SimpleDateFormat("01/01/2000"));
		persona.setNombre("Antonio Jose");
		
		personas.add(persona);
		
		persona = new PersonaAvanzadas();
		persona.setApellido("Gaviria");
		persona.setDni("12345d");
		persona.setFecha_nacimiento(new SimpleDateFormat("01/01/2000"));
		persona.setNombre("Luis cañeda");
		
		personas.add(persona);
		
		persona = new PersonaAvanzadas();
		persona.setApellido("Lolifio");
		persona.setDni("12345d");
		persona.setFecha_nacimiento(new SimpleDateFormat("01/01/2000"));
		persona.setNombre("Aldendradado");
		
		personas.add(persona);

		System.out.println("Lista sin ordenar");
		for (PersonaAvanzadas personaa : personas) {
			System.out.println(personaa);
		}
		
		personas.sort(new ComparadorPersonas());
		
		System.out.println("Lista ordenada por nombre");
		for (PersonaAvanzadas personaa : personas) {
			System.out.println(personaa);
		}
	}
}
