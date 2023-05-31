package Aeropuerto;

import java.util.ArrayList;
import Aeropuerto.Vuelo;

public class Piloto {
	private String rut;
	private String nombre;
	private int edad;
	private ArrayList<Vuelo> vuelosInscritos = new ArrayList<Vuelo>();

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
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