package registrador_equipos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Equipo extends Jugador{
	private String nombre;
	private String estadio;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
			
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public void addJugador(Jugador jugador) {
		jugadores = new ArrayList<Jugador>(jugadores);
		jugadores.add(jugador);
	}
	
	public double gastoEnSueldos(){
		double gastoTotal = 0;
		for (int i = 0; i<jugadores.size(); i++) {
			gastoTotal = jugadores.get(i).getSueldo() + gastoTotal;
			}
		return gastoTotal;
	}
	
	public void guardarEnFichero(Equipo equipo) throws FileNotFoundException{
		String nombreArchivo;
		nombreArchivo = nombreFichero(this.nombre);
		System.out.println(nombreArchivo);
		File archivo = new File("C:\\Users\\user\\tt.txt");
		//PrintWriter escritor = new PrintWriter(archivo);
		
		try {
			if (archivo.createNewFile()) {
				System.out.println("arcivo creado" + nombreArchivo);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//escritor.println(toString());
		//escritor.println("\n");
		//escritor.println(formatoFichero(equipo));
		//escritor.close();
		
        /*String nombreArchivo = equipo.getNombre().replace(" ", "_").toLowerCase() + ".txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            writer.println("Datos del equipo " + equipo.getNombre());
            writer.println("Jugadores:");
            for (Jugador jugador : equipo.getJugadores()) {
                writer.println(jugador.toString());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar en el archivo: " + e.getMessage());
        }*/
    }
	
	public String nombreFichero(String nombre) {
		String nombreFichero;
		nombreFichero = nombre.toLowerCase().replaceAll(" ","_");
		return nombreFichero + ".txt";
	}
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + ", jugadores=" + jugadores.size() + "]";
	}
	
	
}
