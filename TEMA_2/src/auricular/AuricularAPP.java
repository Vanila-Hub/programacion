package auricular;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AuricularAPP {

	public static void main(String[] args) throws FileNotFoundException {
		File archivo = new File("txt/auriculares.txt");
		Scanner scan = new Scanner(archivo);
		Auricular[] auriculares = new Auricular[10];
		cargarDatos(auriculares,scan);
		guardarDatos(auriculares,archivo,scan);
		for (int i = 0; i < auriculares.length; i++) {
			System.out.println("Marca: " + auriculares[i].getMarca() + ", Modelo: " + auriculares[i].getModelo() + ", Precio: " + auriculares[i].getPrecio() + ", Stock: " + auriculares[i].getStock());
			System.out.println("---------------------------------------------------");
		}
	}

	private static void guardarDatos(Auricular[] auriculares, File archivo, Scanner scan) throws FileNotFoundException {
		PrintWriter escritor = new PrintWriter(archivo);
		for (int i = 0; i < auriculares.length; i++) {
			escritor.println(auriculares[i].getModelo() + ";" + auriculares[i].getMarca() + ";" + auriculares[i].getPrecio() + ";" + auriculares[i].getStock());
		}escritor.close();
	}

	private static void cargarDatos(Auricular[] auriculares,Scanner scan) {
		String lineas = "";
		String[] Contenidos;
		int i = 0;
		while (scan.hasNext()) {
			lineas = scan.nextLine();
			Contenidos = lineas.split(";");
			auriculares[i] = new Auricular(Contenidos[0],Contenidos[1],Double.parseDouble(Contenidos[2]),Integer.parseInt(Contenidos[3]));
			/*
			auriculares[i] = new Auricular();
			auriculares[i].setMarca(Contenidos[0]);
			auriculares[i].setModelo(Contenidos[1]);
			auriculares[i].setPrecio(Double.parseDouble(Contenidos[2]));
			auriculares[i].setStock(Integer.parseInt(Contenidos[3]));*/
			i++;
		}
		
	}

}
