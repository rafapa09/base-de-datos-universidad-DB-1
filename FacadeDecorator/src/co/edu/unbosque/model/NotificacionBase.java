package co.edu.unbosque.model;

import java.time.LocalDate;
import java.util.Date;

public class NotificacionBase implements Notificacion {

	private String mensaje;
	private Date recibido;
	private boolean leido;
	
	public NotificacionBase() {
		setMensaje();
		setRecibido();
		setLeido();
	}
	
	@Override
	public String setMensaje() {
		this.mensaje="Mensaje";
		return mensaje;
	}

	@Override
	public Date setRecibido() {
		this.recibido=new Date();
		return recibido;
	}

	@Override
	public boolean setLeido() {
		this.leido=false;
		return leido;
	}

	public String getMensaje() {
		return mensaje;
	}

	public Date getRecibido() {
		return recibido;
	}

	public boolean isLeido() {
		return leido;
	}
	
}
