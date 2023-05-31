package Aeropuerto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Aeropuerto.Avion;

public class Aeropuerto {
	private ArrayList<Avion> aviones = new ArrayList<Avion>();

	public List<Pasajero> buscarPasajerosFecha(Date fecha) {
		List<Pasajero> pasajeros = new ArrayList<Pasajero>();
		for (Avion avion : this.aviones) {
			for (Vuelo vuelo : avion.getVuelos()) {
				if (vuelo.getHoraVuelo().equals(fecha)) {
					pasajeros.addAll(vuelo.getPasajeros());
				}
			}

		}
		return pasajeros;
	}

	public List<Pasajero> buscarPasajerosVuelo(Vuelo vuelo) {
		List<Pasajero> pasajeros = new ArrayList<Pasajero>();
		for (Avion avion : this.aviones) {
			for (Vuelo vuelos : avion.getVuelos()) {
				if (vuelo.equals(vuelos)) {
					pasajeros.addAll(vuelos.getPasajeros());
					break;
				}
			}

		}
		return pasajeros;
	}

	public List<Pasajero> buscarPasajerosCovid() {
		List<Pasajero> pasajeros = new ArrayList<Pasajero>();
		List<Vuelo> vuelos = new ArrayList<Vuelo>();
		for (Avion avion : this.aviones) {
			for (Vuelo vuelo : avion.getVuelos()) {
				boolean condicion = true;
				while (condicion) {
					for (Pasajero pasajero : vuelo.getPasajeros()) {
						{
							if (pasajero.getPasaporteSanitario() == null || pasajero.getPasaporteSanitario().getResultadoPCR() == true) {
								condicion = false;
								pasajeros.addAll(vuelo.getPasajeros());
								vuelos.add(vuelo);
							}
						}
					}
				}

			}
		}
		pasajeros = this.buscarTrazabilidadCovid(pasajeros, vuelos);
		return pasajeros;
	}
	private List<Pasajero> buscarTrazabilidadCovid(List<Pasajero> pasajeros, List<Vuelo> vuelos) {
		for (Avion avion : this.aviones) {
			for (Vuelo vuelo : avion.getVuelos()) {
				for (Vuelo vuelosCovid : vuelos) {
					boolean condicion = true;
					int diferenciaHoraria = vuelo.getHoraVuelo().getHours() - vuelosCovid.getHoraVuelo().getHours();
					if (!vuelos.contains(vuelo) && diferenciaHoraria <= 1) {
						pasajeros.addAll(vuelo.getPasajeros());

					}
				}

			}

		}
		return pasajeros;

	}
}