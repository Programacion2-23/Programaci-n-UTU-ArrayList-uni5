package Consola;

import Logica.empleado;
import Logica.empleados;
import Logica.vendedor;
import Logica.direccion;

public class empleado_main {

	public static void main(String[] args) {
		
		direccion dir = new direccion("el molino",20,"las piedras");
		empleados empleadosList = new empleados();
		empleado emp2 = new empleado("pepe",3000,dir);
		empleado emp1 = new empleado("Alejo",2000.0,dir);
		vendedor vend1 = new vendedor(30.0,5,"jorge",4500,dir);
		vendedor vend2 = new vendedor(20,10,"pablo",5000.0,dir);
		
		empleadosList.agregar(vend1);
		empleadosList.agregar(vend2);
		
		System.out.println(emp2.toString());
		System.out.println("");
		System.out.println(emp1.toString());
		System.out.println("");
		System.out.println(vend2.toString());
		System.out.println("");
		System.out.println(vend1.toString());
		System.out.println("");
		System.out.println(empleadosList.toString());
		System.out.println("");
	}

}
