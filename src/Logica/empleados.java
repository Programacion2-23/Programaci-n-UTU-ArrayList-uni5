package Logica;

import java.util.ArrayList;

public class empleados {
	
	ArrayList<empleado> listaEmpleados;
	
	public empleados () {
		listaEmpleados = new ArrayList<>();
	}
	
	public void agregar(empleado e) {
		listaEmpleados.add(e);
	}
	
	public void eliminar(empleado e) {
		listaEmpleados.remove(e);
	}
	
	public empleado devolver (int i) {
		return listaEmpleados.get(i);
	}
	
	public int cantidad () {
		return listaEmpleados.size();
	}
	
	public double obtenerSalarios() {
		double total = 0;
		
		for (empleado empleado : listaEmpleados) {
			total += empleado.getSalario(); 
		}
		
		return total;
	}
	
	public int cantidadVendedores() {
		
		int cantidad = 0;
		
		for (empleado vendedor : listaEmpleados) {
			cantidad = cantidad();
		}
		
		return cantidad;
	}
	
	public String toString () {
		return "Salario total de em: " + obtenerSalarios() 
		+ "\nCantidad de vendedores: " + cantidadVendedores();
	}
}
