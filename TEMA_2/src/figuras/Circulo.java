package figuras;

public class Circulo extends FiguraGeometrica{
	private double radio;
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double d) {
		this.radio = d;
	}

	@Override
	public double calcularArea() {
		Double area = this.radio*Math.PI;
		return area;
	}

}
