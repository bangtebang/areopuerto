package Aeropuerto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Aeropuerto.Avion;

public class Aeropuerto {
	private ArrayList<Avion> aviones = new ArrayList<Avion>();

	public List<Avion> getAviones() {
		throw new UnsupportedOperationException();
	}

	public List<Pasajero> buscarPasajerosFecha(Date fecha) {
		throw new UnsupportedOperationException();
	}

	public List<Pasajero> buscarPasajerosVuelo(Vuelo vuelo) {
		throw new UnsupportedOperationException();
	}

	public List<Pasajero> buscarPasajerosCovid() {
		throw new UnsupportedOperationException();
	}
}