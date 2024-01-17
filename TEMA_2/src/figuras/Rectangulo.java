package figuras;

public class Rectangulo extends FiguraGeometrica{
	private double base;
	private double altura;
	@Override
	public double calcularArea() {
		double area = this.altura*this.altura;
		return area;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
