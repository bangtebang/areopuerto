import java.util.ArrayList;

public class Piloto {
	private String nombre;
	private String apeliido;
	private int edad;
	private String run;
	private ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

	public String getRun() {
		return this.run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getApeliido() {
		return this.apeliido;
	}

	public void setApeliido(String apeliido) {
		this.apeliido = apeliido;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}