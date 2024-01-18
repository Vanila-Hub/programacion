package comparator;

public class Figura {
	private double radio;
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double d) {
		this.radio = d;
	}

	public double getArea() {
		Double area = this.radio*Math.PI;
		return area;
	}

	@Override
	public String toString() {
		return "Figura [radio=" + radio + ", Area =" + getArea() + "]";
	}
	
}
