package Logica;

public class empleado {
	
	private String nombre;
	private double salario;
	private direccion direccion;
	
	public empleado () {
		
	}
	
	public empleado (String nombre, double salario, direccion direccion) {
		this.nombre = nombre;
		this.salario = salario;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(direccion direccion) {
		this.direccion = direccion;
	}
	
	public double calcularImpuesto() {
		
		salario = salario * 1.25;
		
		return salario;
	}
	
	@Override
	public String toString() {
		return "El nombre es: " + nombre + 
				"\nEl salario es: " + 
				salario + "\n" + direccion +
				"\nImpuesto salario: " + calcularImpuesto();
	}

}
