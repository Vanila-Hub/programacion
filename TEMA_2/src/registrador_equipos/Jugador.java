package registrador_equipos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Jugador {
	private String nombreCompleto;
	private String numero;
	private String fechaNacimiento;/* new SimpleDateFormat("dd/MM/yyyy").format(this.fecha)) */
	private double sueldo;

	public Jugador(){
		
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String formatoFichero(Equipo equipo) {
		String formato = null;
		
		for (int i = 0; i < equipo.getJugadores().size(); i++) {
			formato =  "Jugador [nombreCompleto=" + equipo.getJugadores().get(i).getNombreCompleto() + ":numero=" + equipo.getJugadores().get(i).getNumero() + ":fechaNacimiento="
					+ equipo.getJugadores().get(i).getFechaNacimiento() + ":sueldo=" + equipo.getJugadores().get(i).getSueldo() + "]";	
		}
		return formato;
	}

	@Override
	public String toString() {
		return "Jugador [nombreCompleto=" + nombreCompleto + ", numero=" + numero + ", fechaNacimiento="
				+ fechaNacimiento + ", sueldo=" + sueldo + "]";
	}

}
