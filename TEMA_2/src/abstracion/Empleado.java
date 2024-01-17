package abstracion;

public abstract class Empleado {

	public String nombre;
	public double salario;
	
	Empleado(String nombre){
		this.nombre = nombre;
	}
	
	public abstract double calcularSalario();
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
}
