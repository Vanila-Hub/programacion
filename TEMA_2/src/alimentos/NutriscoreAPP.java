package alimentos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NutriscoreAPP {

	public static void main(String[] args) throws FileNotFoundException {
		Alimento[] alimentos = new Alimento[404];
		cargarDatos(alimentos);
		menuApp(alimentos);
		//System.out.println(alimentos[9].getNombre());
	}

	private static void menuApp(Alimento[] alimentos) {
		/*Buscador de alimentos: comprobará si existe un alimento concreto y si existe aparecerá su información nutricional, si no mostrará existe el mensaje oportuno.
		Mostrar alimentos: el programa pedirá dos números. El primero será la posición del primer alimento que queremos mostrar y el segundo será cuantos registros queremos que se muestren. Pues eso tendrá que hacer, ja ja ja.
		Calcular calorías: Se pedirá por teclado introducir un alimento, su estado y gramos. Aparecerán las calorías que tiene esa cantidad de alimento. Si no, el mensaje oportuno de que no se ha encontrado.
		 */
		final int BUSCAR_ALIMENTOS = 1;
		final int MOSTRAR_ALIMENTO = 2;
		final int CALCULAR_CALORIAS = 3;
		final int SALIR = 0;
		int opcion = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("--*MENU*--");
		System.out.println(BUSCAR_ALIMENTOS + ". comprobará si existe un alimento concreto y si existe aparecerá su información nutricional");
		System.out.println(MOSTRAR_ALIMENTO + ". el programa pedirá dos números. El primero será la posición del primer alimento que queremos mostrar y el segundo será cuantos registros queremos que se muestren.");
		System.out.println(CALCULAR_CALORIAS + ". Se pedirá por teclado introducir un alimento, su estado y gramos. Aparecerán las calorías que tiene esa cantidad de alimento.");
		opcion = Integer.parseInt(scan.nextLine());
		
		do {
			switch (opcion) {
			case BUSCAR_ALIMENTOS:
				buscarAlimento(alimentos);
				break;
			case MOSTRAR_ALIMENTO:
				mostrarAlimento(alimentos);
				break;
			case CALCULAR_CALORIAS:
				calcularAlimento(alimentos);
				break;
			case SALIR:
				System.out.println("Saliendo");
				break;
			default:
				break;
			}
		} while (opcion != SALIR);
	}

	private static void calcularAlimento(Alimento[] alimentos) {
		String nombre;
		String estado;
		double gramos;
		boolean encontrado = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el nombre del alimento");
		nombre = scan.nextLine();
		System.out.println("Introduzca su situacion");
		estado = scan.nextLine();
		System.out.println("Introduzca sus grasas");
		gramos = Double.parseDouble(scan.nextLine());
		
		for (int i = 0; i < alimentos.length; i++) {
			if (alimentos[i].getNombre().equals(nombre) & alimentos[i].getSituaciones().equals(estado) & alimentos[i].getGrasas() == gramos) {
				System.out.println("Calorias: " + alimentos[i].getCalorias());
				encontrado = true;
				menuApp(alimentos);
			}
		}
		if (encontrado==false) {
			System.out.println("No hay campos que coincidan con esa busqueda, fijate si has introducido el nombre,estado y el gramo correctamente");
		}
	}

	private static void mostrarAlimento(Alimento[] alimentos) {
		int numeroAlimentos;
		int numeroArepetir;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el primer numero para saber en que posicion empezar a ver los alimentos.");
		numeroAlimentos = Integer.parseInt(scan.nextLine());
		System.out.println("Introduzca el segundo numero para saber el numero de alimentos que quiere ver");
		numeroArepetir = Integer.parseInt(scan.nextLine());
		
		if (numeroAlimentos >= alimentos.length) {
			System.out.println("No se puede visualizar mas lineas que alimentos introducidos");
		}else
		{
			for(int i = 0; i < numeroArepetir; i++)
			{
				System.out.println("Nombre: " + alimentos[numeroAlimentos].getNombre() + " Situacion: " + alimentos[numeroAlimentos].getSituaciones() + " Calorias: " + alimentos[numeroAlimentos].getCalorias() + " Grasas: " + alimentos[numeroAlimentos].getGrasas() + " Proteinas: " + alimentos[numeroAlimentos].getProteinas() + " Carbohidratos: " + alimentos[numeroAlimentos].getCarbohidratos() + " Tipo: " + alimentos[numeroAlimentos].getTipos());
				System.out.println("---------------------------------------------------------------------");
				numeroAlimentos++;
				menuApp(alimentos);
			}
		}
	}

	private static void buscarAlimento(Alimento[] alimentos) {
		Scanner scan = new Scanner(System.in);
		String busqueda = "";
		boolean encontrado = false;
		int i = alimentos.length;
		
		System.out.println("Introduzca el alimento que desea ver su informacion");
		busqueda = scan.nextLine();
		while (encontrado == false) {
			for (i = 0; i < alimentos.length; i++) {				
				if (alimentos[i].getNombre().toLowerCase().equals(busqueda)) {
					System.out.println("Situacion: " + alimentos[i].getSituaciones() + " Calorias: " + alimentos[i].getCalorias() + " Grasas: " + alimentos[i].getGrasas() + " Proteinas: " + alimentos[i].getProteinas() + " Carbohidratos: " + alimentos[i].getCarbohidratos() + " Tipo: " + alimentos[i].getTipos());
					System.out.println("--------------------------------------------------------------");
					encontrado =  true;
				} 
			}
			if (encontrado == false) {System.out.println("No se ha encontrado <" + busqueda + "> En la base de datos");menuApp(alimentos);}
			menuApp(alimentos);
		}
	}

	private static void cargarDatos(Alimento[] alimentos) throws FileNotFoundException {
		File archivo = new File("txt/alimentos.txt");
		Scanner scan = new Scanner(archivo);
		String lineas;
		String[] contenido;
		double num_double = 0;
		int i = 0;
		while (scan.hasNext()) {
			lineas = scan.nextLine();
			contenido = lineas.split(";");
			alimentos[i] = new Alimento();
			alimentos[i].setNombre(contenido[0]);
			alimentos[i].setSituaciones(contenido[1]);
			if(contenido[2].contains(",")) {num_double = Double.parseDouble(contenido[2].replaceAll(",", "."));}
			else {num_double = Double.parseDouble(contenido[2]);}
			alimentos[i].setCalorias(num_double);
			alimentos[i].setGrasas(Double.parseDouble(contenido[3].replaceAll(",", ".")));
			alimentos[i].setProteinas(Double.parseDouble(contenido[4].replaceAll(",", ".")));
			alimentos[i].setCarbohidratos(Double.parseDouble(contenido[5].replaceAll(",", ".")));
			alimentos[i].setTipos(contenido[6]);
			i++;
		}
	}
}
