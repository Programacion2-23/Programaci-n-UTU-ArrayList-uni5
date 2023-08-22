package Logica;

public class vendedor extends empleado{

	private double comision;
	private int ventasRealizadas;
	
	public vendedor () {
		
	}
	
	public vendedor(double comision, int ventasRealizadas, String nombre,double salario,direccion direccion) {
		super(nombre,salario,direccion);
		this.comision = comision;
		this.ventasRealizadas = ventasRealizadas;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public int getVentasRealizadas() {
		return ventasRealizadas;
	}

	public void setVentasRealizadas(int ventasRealizadas) {
		this.ventasRealizadas = ventasRealizadas;
	}
	
	public double calcularImpuesto() {
		
		double mas = super.calcularImpuesto() * 1.5;
		
		return mas;
	}
	
	public double calcularComision() {
		return ventasRealizadas * 1.20;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nComision: " + comision + 
				"\nVentas realizadas: " + ventasRealizadas
				+ "\nImpuesto Vendedor: " + calcularImpuesto()
				+ "\nComision Vendedor: " + calcularComision();
	}
}
