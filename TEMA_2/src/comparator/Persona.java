package comparator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Persona{
	private String nombre;
	private String apellido;
	private String Dni;
	private SimpleDateFormat fecha_nacimiento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public SimpleDateFormat getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(SimpleDateFormat simpleDateFormat) {
		this.fecha_nacimiento = simpleDateFormat;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", Dni=" + Dni + ", fecha_nacimiento="
				+ fecha_nacimiento + "]";
	}
	
}
