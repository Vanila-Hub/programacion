package abstracion;

public class Main {

	public static void main(String[] args) {
		
	EmpleadoAsalariado ea1 = new EmpleadoAsalariado("Julen");
	
	//ea1.setNombre("Julen");
	ea1.setSalario(1000000);
	System.out.println("Empleado: " + ea1.getNombre());
	System.out.println("Salario: " + ea1.calcularSalario());
	
	EmpleadoPorHora eh1 = new EmpleadoPorHora("Iker", 8);
	
	eh1.setSalario(12);
	//eh1.setNombre("Iker");
	//eh1.setHorasTrabajadas(8);
	System.out.println("Empleado: " + eh1.getNombre());
	System.out.println("Salario: " + eh1.calcularSalario());

	}

}
