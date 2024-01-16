




package partida_pokemon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static int jugador_elegido = 0;
	public static int dinero_jugador= 0;
	public static int W = 0;
	public static int S = 0;
	public static int D = 0;
	public static int A = 0;
	public static int[] mochila = new int [23];
	public static Random random = new Random();
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		Pokemon[] pokemons_normales = new Pokemon[19];
		Pokemon[] pokemons_legendarios = new Pokemon[19];
		Jugador[] jugadores_pokemons = new Jugador[10];
		constructor_pokemons(pokemons_normales,scan);
		constructor_legendarios(pokemons_legendarios,scan);
		constructor_jugadores(jugadores_pokemons,scan);
		crearPersonaje(jugadores_pokemons,pokemons_normales,scan);
		cargarPartida(jugadores_pokemons,pokemons_normales,scan);
	}
	
	private static void cargarPartida(Jugador[] jugadores_pokemons, Pokemon[] pokemons_normales, Scanner scan) {
		System.out.print("\n -> Bienvenido, " + jugadores_pokemons[jugador_elegido].getNombre() + ", Estamos Cargando el Terreno...");
		final int Nugget_Bridge = 1;
		final int Cerulean_City = 2;
		final int Vermillion_City = 3;
		final int Lavender_Town = 4;
		final int Cinnabar_Island = 5;
		
		switch (/*random.nextInt(0,5)*/1) {
		case Nugget_Bridge:
			nuggetBridge(jugadores_pokemons,pokemons_normales,scan);
			break;
		case Cerulean_City:
			ceruleanCity(jugadores_pokemons,pokemons_normales,scan);
			break;
		case Vermillion_City:
			vermillionCity(jugadores_pokemons,pokemons_normales,scan);
			break;
		case Lavender_Town:
			lavanderTown(jugadores_pokemons,pokemons_normales,scan);
			break;
		case Cinnabar_Island:
			cinnaberIslan(jugadores_pokemons,pokemons_normales,scan);
			break;

		default:
			System.err.println("ERROR");
			break;
		}
	}

	private static void cinnaberIslan(Jugador[] jugadores_pokemons, Pokemon[] pokemons_normales, Scanner scan) {
		System.out.println("Has aterizado en Cinnabar Island");
		
	}

	private static void lavanderTown(Jugador[] jugadores_pokemons, Pokemon[] pokemons_normales, Scanner scan) {
		System.out.println("Has aterizado en Lavender Town");
		
	}

	private static void vermillionCity(Jugador[] jugadores_pokemons, Pokemon[] pokemons_normales, Scanner scan) {
		System.out.println("Has aterizado en Vermillion City");		
	}

	private static void ceruleanCity(Jugador[] jugadores_pokemons, Pokemon[] pokemons_normales, Scanner scan) {
		System.out.println("Has aterizado en  Cerulean City");			
	}

	private static void nuggetBridge(Jugador[] jugadores_pokemons, Pokemon[] pokemons_normales, Scanner scan) {
		/*W=5 S=5 D=10 A=0 ==>SALIDA,FRANKY 

		W=0 S=10 D=0 A=0 ==>KILEY,EÑAUT
		
		W=5 S=5 D=0 A=10 ==>GORAKA ,ION 
		
		W=5 S=5 D=10 A=0 ==>LEGENDARIO,TEAMROCKET 
		
		W=10 S=0 D=10 A=0 ==>ZONA_PESCA ,IKER 
		
		W=0 S=0 D=10 A=0 ==>POKS 
		
		W=0 S=0 D=0 A=10 ==>POKS 
		 */
		final int KILEY = 1;
		final int EÑAUT = 2;
		final int GORAKA = 3;
		final int ION = 4;
		final int FRANKY = 5;
		final int IKER = 6;
		final int PUENTE = 20;
		final int TIENDA = 3;
		final int ZONA_PESCA = 3;
		final int TEAMROCKET = 0;
		scan = new Scanner(System.in);
		String movimiento = "";
		System.out.println("\n -> Has aterizado en Nugget Bridge");
		jugadores_pokemons[jugador_elegido].setPueblo("Nugget Bridge");
		moverPersonaje(movimiento, scan);
	}

	private static void moverPersonaje(String movimiento, Scanner scan) {
		System.out.println("\n -> Utiliza las teclas W,S,D,A para moverte por el pueblo: ");
		movimiento = scan.nextLine();
		
		if(W == 0 && S == 0 && D == 0 && A == 0) {W = 5;S = 5;}
		
		switch (movimiento.toLowerCase()) {
		case "w":
			W = W+5;
			S = S-5;
			if (W > 10) {
				W = 10;
				S = 0;
			}
			break;
		case "s":
			S = S+5;
			W = W-5;
			if (S > 10) {
				S = 10;
				W = 0;
			}
			break;
		case "d":
			D = D+5;
			A = 0;
			if (D > 10) {
				D = 10;
				A = 0;
			}if (W == 5 && S == 5 && A == 5 && D == 0) {A = 0; D = 0;}
			else if (W == 10 && S == 10 && A == 10 && D == 0) {A = 0; D = 0;}
			break;
		case "a":
			A = A+5;
			D = 0;
			if (A > 10) {
				A = 10;
				D = 0;
			}
			if (W == 5 && S == 5 && A == 0 && D == 5) {A = 0; D = 0;}
			else if (W == 10 && S == 10 && A == 0 && D == 10) {A = 0; D = 0;}
			break;
		case "f":
			
			System.out.println("Cruzando puente: ");
			System.out.println("");
			break;
		default:
			break;
		}
		System.out.println("W: " + W + ", S: " + S + ", D: " + D + " ,A: " + A);
		leerPueblo();
		moverPersonaje(movimiento, scan);
	}

	private static void leerPueblo() {
		// TODO Auto-generated method stub
		
	}

	private static void crearPersonaje(Jugador[] jugadores_pokemons, Pokemon[] pokemons_normales, Scanner scan) {
		scan = new Scanner(System.in);
		
		//reseteamos ya que se va a crear un nuevo personaje la partida es inicial
		for (int i = 0; i < jugadores_pokemons.length; i++) {
			jugadores_pokemons[i].setXpe(0);
		}
		System.out.println("Elije a tu personaje para empezar la partida: ");
		for (int i = 0; i < jugadores_pokemons.length; i++) {
			System.out.print(i + "." + jugadores_pokemons[i].getNombre() + ". " + "\n");
		}
		jugador_elegido = Integer.parseInt(scan.nextLine());
		System.out.println("-> Has elejido a " + jugadores_pokemons[jugador_elegido].getNombre());
		System.out.println(" Experiencia:" + jugadores_pokemons[jugador_elegido].getXpe() + ", Nivel:" + jugadores_pokemons[jugador_elegido].getNivel());
		
		/*Pokemon Acompañante
		mochila[0] = random.nextInt(0,19);
		System.out.println("-> Tu Pokemon Acompañante es: " + pokemons_normales[mochila[0]].getNombre());
		System.out.print("--Estas son las Stats de " + pokemons_normales[mochila[0]].getNombre() + "-->");
		System.out.println(" Defensa: " + pokemons_normales[mochila[0]].getDefensa() + ", Salud:"  + pokemons_normales[mochila[0]].getSalud() + ", Ataque:" + pokemons_normales[mochila[0]].getAtaque() + ", Tipo:" + pokemons_normales[mochila[0]].getTipo() + ", Nivel: " + pokemons_normales[mochila[0]].getNivel());*/
	}

	private static void constructor_jugadores(Jugador[] jugadores_pokemons, Scanner scan) throws FileNotFoundException {
		File archivo =  new File("txt/usuarios.txt");
		scan = new Scanner(archivo);
		int i = 0;
		while (scan.hasNext()) {
			String linea = scan.nextLine();
			String[] contenido = linea.split(",");
			//System.out.println(linea);
			jugadores_pokemons[i] = new Jugador();
			jugadores_pokemons[i].setNombre(contenido[0]);
			jugadores_pokemons[i].setPueblo(contenido[1]);
			jugadores_pokemons[i].setXpe(Integer.parseInt(contenido[2].replaceAll(" ","")));
			jugadores_pokemons[i].setNivel(contenido[3]);
			i++;
		}
	
	
	
	}

	private static void constructor_legendarios(Pokemon[] pokemons_legendarios, Scanner scan) throws FileNotFoundException {
		/*Nombre,Defensa,Salud,Ataque,Tipo,Nivel*/
	File archivo = new File("txt/legends_pok.txt");
	scan = new Scanner(archivo);
	int i = 0;
	
	while (scan.hasNext()) {
		String linea = scan.nextLine();
		String[] contenido = linea.split(",");
		pokemons_legendarios[i] = new Pokemon();
		pokemons_legendarios[i].setNombre(contenido[0]);
		pokemons_legendarios[i].setDefensa(Integer.parseInt(contenido[1]));
		pokemons_legendarios[i].setSalud(Integer.parseInt(contenido[2]));
		pokemons_legendarios[i].setAtaque(Integer.parseInt(contenido[3]));
		pokemons_legendarios[i].setTipo(contenido[4]);
		pokemons_legendarios[i].setNivel(Integer.parseInt(contenido[5]));
		i++;
	}
	}

	private static void constructor_pokemons(Pokemon[] pokemons, Scanner scan) throws FileNotFoundException {
		File archivo = new File("txt/normal_poks.txt");
		scan = new Scanner(archivo);
		int i = 0;
		
		while (scan.hasNext()) {
			String linea = scan.nextLine();
			String[] contenido = linea.split(",");
			pokemons[i] = new Pokemon();
			pokemons[i].setNombre(contenido[0]);
			pokemons[i].setDefensa(Integer.parseInt(contenido[1]));
			pokemons[i].setSalud(Integer.parseInt(contenido[2]));
			pokemons[i].setAtaque(Integer.parseInt(contenido[3]));
			pokemons[i].setTipo(contenido[4]);
			pokemons[i].setNivel(Integer.parseInt(contenido[5]));
			i++;
		}
	}
}
