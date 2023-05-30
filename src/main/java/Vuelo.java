import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
	private Date horaVuelo;
	private Ciudad ciudadDestino;
	public Avion unnamed_Avion_;
	private ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	private Ciudad ciudadOrigen;
	private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();

	public Date getHoraVuelo() {
		return this.horaVuelo;
	}

	public void setHoraVuelo(Date horaVuelo) {
		this.horaVuelo = horaVuelo;
	}
}