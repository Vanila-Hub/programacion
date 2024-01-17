package abstracion;

public class EmpleadoAsalariado extends Empleado{

	EmpleadoAsalariado(String nombre) {
		super(nombre);
	}

	@Override
	public double calcularSalario() {
			return getSalario();
	}
}
