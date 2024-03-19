package co.edu.unbosque.model;

public class Solicitud {

	private String tiposolicitud;
	private String descripcion;
	private boolean consultada;
	
	public Solicitud(String tiposolicitud, String descripcion) {
		super();
		this.tiposolicitud = tiposolicitud;
		this.descripcion =descripcion;
		this.consultada = false;
	}

	public String getTiposolicitud() {
		return tiposolicitud;
	}

	public void setTiposolicitud(String tiposolicitud) {
		this.tiposolicitud = tiposolicitud;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isConsultada() {
		return consultada;
	}

	public void setConsultada(boolean consultada) {
		this.consultada = consultada;
	}
	

	
	
}
