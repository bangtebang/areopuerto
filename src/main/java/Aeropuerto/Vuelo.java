package Aeropuerto;

import java.util.ArrayList;
import java.util.Date;

import Aeropuerto.Pasajero;
import Aeropuerto.Piloto;

public class Vuelo {
	private Date horaVuelo;
	private Avion avion;
	private ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();

	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;
	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}
	public Date getHoraVuelo() {
		return this.horaVuelo;
	}

	public void setHoraVuelo(Date horaVuelo) {
		this.horaVuelo = horaVuelo;
	}
}