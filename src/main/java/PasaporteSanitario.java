import java.util.Date;

public class PasaporteSanitario {
	private String idPasaporte;
	private Date fechaPasaporte;
	private boolean resultadoPcr;
	private Date fechaREsultado;

	public String getIdPasaporte() {
		return this.idPasaporte;
	}

	public void setIdPasaporte(String idPasaporte) {
		this.idPasaporte = idPasaporte;
	}

	public Date getFechaPasaporte() {
		return this.fechaPasaporte;
	}

	public void setFechaPasaporte(Date fechaPasaporte) {
		this.fechaPasaporte = fechaPasaporte;
	}

	public boolean getResultadoPcr() {
		return this.resultadoPcr;
	}

	public void setResultadoPcr(boolean resultadoPcr) {
		this.resultadoPcr = resultadoPcr;
	}

	public Date getFechaREsultado() {
		return this.fechaREsultado;
	}

	public void setFechaREsultado(Date fechaREsultado) {
		this.fechaREsultado = fechaREsultado;
	}
}