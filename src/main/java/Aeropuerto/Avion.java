package Aeropuerto;

import java.util.ArrayList;
import Aeropuerto.Vuelo;

public class Avion {
	private String nombre;
	private int ano;
	private double kmRecorridos;
	private Aeropuerto aeropuerto;
	private ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getKmRecorridos() {
		return this.kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
}