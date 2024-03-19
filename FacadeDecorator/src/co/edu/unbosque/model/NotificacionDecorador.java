package co.edu.unbosque.model;

import java.util.Date;

public abstract class NotificacionDecorador implements Notificacion{

	protected Notificacion notificaciondecorada;
	
	public NotificacionDecorador(Notificacion notificaciondecorada) {
		this.notificaciondecorada = notificaciondecorada;
	}

	@Override
	public String setMensaje() {
		return this.setMensaje();
	}

	@Override
	public Date setRecibido() {
		return this.setRecibido();
	}

	@Override
	public boolean setLeido() {
		return this.setLeido();
	}

}
