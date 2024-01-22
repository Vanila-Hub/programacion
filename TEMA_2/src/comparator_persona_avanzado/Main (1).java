package comparator_persona_avanzado;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Scanner scan = new Scanner(System.in);
		
		final int CREAR_PERSONA = 0;
		final int ORDENADO_ASCENDENTE = 1;
		final int ORDENADO_DESCENDENTE = 2;
		final int ORDENADO_MASJOVEN= 3;
		final int ELIMINAR_ALUMNO= 4;
		final int SALIR = 5;
		
		int opcion;
		
		do {
			System.out.println("_Menu: ");
			System.out.println(CREAR_PERSONA + " :CREAR PERSONA");
			System.out.println(ORDENADO_ASCENDENTE + " :ORDENADO_ASCENDENTE");
			System.out.println(ORDENADO_DESCENDENTE + " :ORDENADO_DESCENDENTE");
			System.out.println(ORDENADO_MASJOVEN + " :ORDENADO_MASJOVEN");
			System.out.println(ELIMINAR_ALUMNO + " :ELIMINAR_ALUMNO");
			System.out.println(SALIR + " :SALIR");
			
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case CREAR_PERSONA:
				Persona persona = new Persona();
				
				System.out.println("Introduzca el nombre");
				persona.setNombre(scan.nextLine());
				System.out.println("Introduzca el apellido");
				persona.setApellido(scan.nextLine());
				System.out.println("Introduzca el dni");
				persona.setDni(scan.nextLine());
				System.out.println("Introduzca la fecha de nacimiento dd/mm/yyyy");
				persona.setFecha_nacimiento(scan.nextLine());
				
				personas.add(persona);
				
				break;
				
			case ORDENADO_ASCENDENTE:
				personas.sort(new CompararAscen());
				for (Persona personaa : personas) {
					System.out.println(personaa);
				}
				break;
			case ORDENADO_DESCENDENTE:
				personas.sort(new CompararDesc());
				for (Persona personaa : personas) {
					System.out.println(personaa);
				}
				break;
			case ORDENADO_MASJOVEN:
				personas.sort(new CompararMasjoven());
				for (Persona personaa : personas) {
					System.out.println(personaa);
				}
				break;
			case ELIMINAR_ALUMNO:
				System.out.println("Introduzca el dni del alumno");
				for (int i = 0; i < personas.size(); i++) {
					if (personas.get(i).getDni().equalsIgnoreCase(scan.nextLine())) {
						personas.remove(i);
						System.out.println("Persona eliminada correctamente:");
						break;
					}else {System.out.println("Buscando...");}
				}
				break;
			case SALIR:
				System.out.println("Saliendo");
				break;
			default:
				break;
			}
		} while (opcion!=SALIR);
		
	}

}
