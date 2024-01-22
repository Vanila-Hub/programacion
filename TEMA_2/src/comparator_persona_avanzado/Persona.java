package comparator_persona_avanzado;

import java.text.SimpleDateFormat;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String Dni;
	private String fecha_nacimiento;
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
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", Dni=" + Dni + ", fecha_nacimiento="
				+ fecha_nacimiento + "]";
	}
	
	
}
