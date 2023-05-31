package Aeropuerto;

public class Pasajero {
	private String run;
	private String nombre;
	private int edad;
	private PasaporteSanitario pasaporteSanitario;
	public PasaporteSanitario getPasaporteSanitario() {
		return pasaporteSanitario;
	}

	public String getRun() {
		return this.run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}