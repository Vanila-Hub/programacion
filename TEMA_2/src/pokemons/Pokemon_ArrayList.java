package pokemons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Pokemon_ArrayList {

	public static void main(String[] args) throws FileNotFoundException {
		File archivo = new File("txt/pokemons.csv");
		Scanner scan = new Scanner(archivo);
		ArrayList <Pokemon> pokemons = new ArrayList();

		
		//Pokemon[] pokemons = new Pokemon[20];
		//cargarDatos(archivo,scan,pokemons);
		//applicacion(pokemons,scan,archivo);
	}

	private static void cargarDatos(File archivo, Scanner scan, Pokemon[] pokemons) {
		int i = 0;
		while (scan.hasNext()) {
			String lineas = scan.nextLine();
			String[] separador = lineas.split(",");
			pokemons[i] = new Pokemon();
			pokemons[i].setNombre(separador[0]);
			pokemons[i].setTipo(separador[1]);
			pokemons[i].setNivel(Integer.parseInt(separador[2]));
			pokemons[i].setAtaque(Integer.parseInt(separador[3]));
			pokemons[i].setDefensa(Integer.parseInt(separador[4]));
			pokemons[i].setVelocidad(Integer.parseInt(separador[5]));
			i++;
		}
	}

	private static void applicacion(Pokemon[] pokemons, Scanner scan, File archivo) throws FileNotFoundException {
		scan = new Scanner(System.in);
		final int SALIR = 0;
		final int LISTAR = 1;
		final int GUARDAR = 2;
		final int CONSULTAR_POKEMON = 3;
		final int MODIFICAR = 4;
		final int BUSCAR_POR_NOMBRE = 5;
		final int LOS_VELOCES = 6;
		final int LISTAR_POR_TIPO = 7;
		int opcion;
		do {
			System.out.println(""
					+ SALIR + "- SALIR\r\n"
					+ LISTAR + "- LISTAR: listará todos los pokemos en pantalla.\r\n"
					+ GUARDAR + "- GUARDAR guardará los arrays en el fichero\r\n"
					+ CONSULTAR_POKEMON + "- CONSULTAR_POKEMON: el programa pedirá un nombre, y a continuación mostrará la información de ese pokemon.\r\n"
					+ MODIFICAR + "- MODIFICAR: pedirá un nombre de pokemon, mostrará la info de ese pokemon y pedirá que se escriban los nuevos valores de nivel, ataque, defensa, velocidad. OJO!: se modificará en el array, de momento no en el fichero.\r\n"
					+ BUSCAR_POR_NOMBRE + "- BUSCAR_POR_NOMBRE: el programa pide una cadena y lista la info de los pokémon que contengan esa cadena en el nombre.\r\n"
					+ LOS_VELOCES + "- LOS_VELOCES: mostrará la info de los pokémon más veloces que la media de velocidad de todos los pokemon.\r\n"
					+ LISTAR_POR_TIPO + "- LISTAR_POR_TIPO: el programa pedirá un tipo, y listará los pokemons de ese tipo, ignorando mayúscula minúscula. Si el tipo no existe mostrará un mensaje informativo.\r\n"
					+ "");
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case SALIR:
				System.out.println("Saliendo....");
				break;
			case LISTAR:
				listar(pokemons);
				break;
			case GUARDAR:
				guardarDatos(archivo,scan,pokemons); 
				break;
			case CONSULTAR_POKEMON:
				consultarPokemon(pokemons);
				break;
			case MODIFICAR:
				moificar(pokemons);
				break;
			case BUSCAR_POR_NOMBRE:
				buscarNombre(pokemons);
				break;
			case LOS_VELOCES:
				losVeloces(pokemons);
				break;
			case LISTAR_POR_TIPO:
				listarTipo(pokemons);
				break;
			default:
				break;
			}
		} while (opcion != SALIR);
	}

	private static void listarTipo(Pokemon[] pokemons) {
		String buscar_Tipo;
		boolean encontrado = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el tipo de pokemon a Buscar");
		buscar_Tipo = scan.nextLine();
		for (int i = 0; i < pokemons.length; i++) {
			if (pokemons[i].getTipo().toLowerCase().equals(buscar_Tipo)) {
				System.out.println("Nombre: " + pokemons[i].getNombre() + " Tipo: " + pokemons[i].getTipo() + " Nivel: " + pokemons[i].getNivel() + " Ataque: " + pokemons[i].getAtaque() + " Defensa: " + pokemons[i].getDefensa() + " Velocidad: " + pokemons[i].getVelocidad());
				System.out.println("-------------------------------------------------------------");
				encontrado = true;
			}
		}if (encontrado == false) {
			System.out.println("No hay pokemons tipo: " + buscar_Tipo);
		}
	}

	private static void losVeloces(Pokemon[] pokemons) {
		int media = 0;
		for (int i = 0; i < pokemons.length; i++) {
			media = pokemons[i].getVelocidad() + media;
		}
		System.out.println("Los pokemons mas veloces que la media son: ");
		for (int i = 0; i < pokemons.length; i++) {
			if (pokemons[i].getVelocidad() > media/pokemons.length) {
				System.out.println("Nombre: " + pokemons[i].getNombre() + " Tipo: " + pokemons[i].getTipo() + " Nivel: " + pokemons[i].getNivel() + " Ataque: " + pokemons[i].getAtaque() + " Defensa: " + pokemons[i].getDefensa() + " Velocidad: " + pokemons[i].getVelocidad());
			}
		}
	}

	private static void buscarNombre(Pokemon[] pokemons) {
		String buscar_Nombre;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el nombre del pokemon a Buscar");
		buscar_Nombre = scan.nextLine();
		for (int i = 0; i < pokemons.length; i++) {
			if (pokemons[i].getNombre().contains(buscar_Nombre)) {
				System.out.println("Nombre: " + pokemons[i].getNombre() + " Tipo: " + pokemons[i].getTipo() + " Nivel: " + pokemons[i].getNivel() + " Ataque: " + pokemons[i].getAtaque() + " Defensa: " + pokemons[i].getDefensa() + " Velocidad: " + pokemons[i].getVelocidad());
				System.out.println("----------------------");
			}
		}
	}

	private static void moificar(Pokemon[] pokemons) {
		String buscar_Nombre;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el nombre del pokemon a Modificar");
		buscar_Nombre = scan.nextLine();
		for (int i = 0; i < pokemons.length; i++) {
			if (pokemons[i].getNombre().equals(buscar_Nombre)) {
				System.out.println("Tipo: " + pokemons[i].getTipo() + " Nivel: " + pokemons[i].getNivel() + " Ataque: " + pokemons[i].getAtaque() + " Defensa: " + pokemons[i].getDefensa() + " Velocidad: " + pokemons[i].getVelocidad());
				System.out.println("----------------------");
				System.out.println("Introduzca los nuevos valores para: " + "Nivel");
				buscar_Nombre = scan.nextLine();
				pokemons[i].setNivel(Integer.parseInt(buscar_Nombre));
				System.out.println("Introduzca los nuevos valores para: " + "Ataque");
				buscar_Nombre = scan.nextLine();
				pokemons[i].setAtaque(Integer.parseInt(buscar_Nombre));
				System.out.println("Introduzca los nuevos valores para: " + "Defensa");
				buscar_Nombre = scan.nextLine();
				pokemons[i].setDefensa(Integer.parseInt(buscar_Nombre));
				System.out.println("Introduzca los nuevos valores para: " + "Velocidad");
				buscar_Nombre = scan.nextLine();
				pokemons[i].setVelocidad(Integer.parseInt(buscar_Nombre));
			}
		}
		
		
	}

	private static void consultarPokemon(Pokemon[] pokemons) {
		String buscar_Nombre;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el nombre del pokemon a Buscar");
		buscar_Nombre = scan.nextLine();
		for (int i = 0; i < pokemons.length; i++) {
			if (pokemons[i].getNombre().equals(buscar_Nombre)) {
				System.out.println("Tipo: " + pokemons[i].getTipo() + " Nivel: " + pokemons[i].getNivel() + " Ataque: " + pokemons[i].getAtaque() + " Defensa: " + pokemons[i].getDefensa() + " Velocidad: " + pokemons[i].getVelocidad());
				System.out.println("----------------------");
			}
		}	
	}

	private static void listar(Pokemon[] pokemons) {
		
		for (int i = 0; i < pokemons.length; i++) {
			System.out.println("Nombre: " + pokemons[i].getNombre());
			System.out.println("----------------------");
		}
	}

	private static void guardarDatos(File archivo, Scanner scan, Pokemon[] pokemons) throws FileNotFoundException {
		PrintWriter escritor = new PrintWriter(archivo);
		for (int i = 0; i < pokemons.length; i++) {
			escritor.println(pokemons[i].getNombre() + "," + pokemons[i].getTipo() + "," + pokemons[i].getNivel() + "," + pokemons[i].getAtaque() + "," + pokemons[i].getDefensa() + "," + pokemons[i].getVelocidad());
		}escritor.close();
	}

}
