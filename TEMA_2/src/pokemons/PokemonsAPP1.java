package pokemons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PokemonsAPP1 {

	public static void main(String[] args) throws FileNotFoundException {
		File archivo = new File("txt/pokemons.csv");
		Scanner scan = new Scanner(archivo);
		Pokemon[] pokemons = new Pokemon[20];
		
		cargarDatos(archivo,scan,pokemons);
		mostrarMenu(pokemons);
		guardarDatos(archivo,scan,pokemons); 
		
		
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

	private static void mostrarMenu(Pokemon[] pokemons) {
		final int SALIR = 0;
		final int LISTAR = 1;
		final int GUARDAR = 2;
		final int CONSULTAR_POKEMON = 3;
		final int MODIFICAR = 4;
		final int BUSCAR_POR_NOMBRE = 5;
		final int LOS_VELOCES = 6;
		final int LISTAR_POR_TIPO = 7;
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
	}

	private static void guardarDatos(File archivo, Scanner scan, Pokemon[] pokemons) throws FileNotFoundException {
		PrintWriter escritor = new PrintWriter(archivo);
		for (int i = 0; i < pokemons.length; i++) {
			escritor.println(pokemons[i].getNombre() + "," + pokemons[i].getTipo() + "," + pokemons[i].getNivel() + "," + pokemons[i].getAtaque() + "," + pokemons[i].getAtaque() + "," + pokemons[i].getVelocidad());
		}escritor.close();
		
	}

}
