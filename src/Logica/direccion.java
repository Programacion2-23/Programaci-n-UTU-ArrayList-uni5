package Logica;

public class direccion {
	
	private String calle;
	private int numeros;
	private String ciudad;
	
	public direccion() {
		
	}
	
	public direccion(String calle, int numeros,String ciudad) {
		this.calle = calle;
		this.numeros = numeros;
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	@Override
	public String toString() {
		return "Calle: " + calle + "\nNumero: " + numeros + "\nCiudad: " + ciudad;
	}

}
