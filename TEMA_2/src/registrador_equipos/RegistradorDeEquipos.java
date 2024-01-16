package registrador_equipos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistradorDeEquipos {
	final String AÑADIR_JUGADOR = "J";
	final String ARCHIVAR_JUGADOR = "A";
	String opcion;
	
	public static void run() throws IOException {
		Equipo equipo = new Equipo();
		//Jugador jugador = new Jugador();
		String opcion;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del equipo: ");
		equipo.setNombre(scan.nextLine());
		
		System.out.println("Ingrese el nombre del estadio del equipo: ");
		equipo.setEstadio(scan.nextLine());
		
		do {
			System.out.println("Introducir un jugador (J) o Archivar Equipo(A)");
			opcion = scan.nextLine();
			
			switch (opcion.toLowerCase()) {
			case "j":
				Jugador jugador = new Jugador();
				System.out.println("Introduzca el nombre del Jugador: ");
				jugador.setNombreCompleto(scan.nextLine());
				
				System.out.println("Introduzca el numero del Jugador: ");
				jugador.setNumero(scan.nextLine());
				
				System.out.println("Introduzca el fecha de nacimiento del Jugador (dd/mm/aa): ");
				jugador.setFechaNacimiento(scan.nextLine());
				
				System.out.println("Introduzca el sueldo del Jugador: ");
				jugador.setSueldo(Double.parseDouble(scan.nextLine()));
				
				equipo.addJugador(jugador);
				break;
			case "a":
				System.out.println("Equipo: " + equipo.getNombre());
				System.out.print(" Estadio: " + equipo.getEstadio());
				System.out.print(" Gastos en Sueldos: " + equipo.gastoEnSueldos());
				System.out.println("\n");
				System.out.println("----------------Jugadores--------");
				
				for (int i = 0; i < equipo.getJugadores().size(); i++) {
					//System.out.println(" Nombre del Jugador: " + equipo.getJugadores().get(i).getNombreCompleto() + " Dorsal: " + equipo.getJugadores().get(i).getNumero() + " Sueldo: " + equipo.getJugadores().get(i).getSueldo() + "$");;
					System.out.println(equipo.getJugadores().get(i).getNombreCompleto());
				}
				
				System.out.println("Salir (S) o Guardar(G): ");
				
				switch (scan.nextLine()) {
				case "s":
					System.out.println("Saliendo...");
					break;
				case "g"://aqui
					equipo.guardarEnFichero(equipo);
					break;
				default:
					break;
				}
				break;
			default:
				System.out.println("ERROR");
				break;
			}
		} while(!opcion.equals("A"));
	}
}
