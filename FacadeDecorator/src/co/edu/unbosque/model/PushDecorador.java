package co.edu.unbosque.model;

import java.util.Date;

public class PushDecorador extends NotificacionDecorador {

	private String telefono;
	
	public PushDecorador(Notificacion notificaciondecorada, String telefono) {
		super(notificaciondecorada);
		this.telefono = telefono;
	}

	@Override
	public String setMensaje() {
		return notificaciondecorada.setMensaje() + "\n"+" Notificacion push"+ "\n" + "Telefono de destino: "+ telefono;
	}

	@Override
	public Date setRecibido() {
		return notificaciondecorada.setRecibido();
	}

	@Override
	public boolean setLeido() {
		return notificaciondecorada.setLeido();
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
