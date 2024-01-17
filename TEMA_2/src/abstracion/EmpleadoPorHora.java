package abstracion;

public class EmpleadoPorHora extends Empleado{

	public double horasTrabajadas;
	
	public EmpleadoPorHora(String nombre, double horasTrabajadas) {
		super(nombre);
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double calcularSalario() {
		return horasTrabajadas*getSalario();
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
}
