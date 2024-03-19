package co.edu.unbosque.model;

import java.util.Date;

public class CorreoDecorador extends NotificacionDecorador {

	private String correo;

	public CorreoDecorador(Notificacion notificaciondecorada, String correo) {
		super(notificaciondecorada);
		this.correo = correo;
	}

	@Override
	public String setMensaje() {
		return notificaciondecorada.setMensaje()+ "\n"+" Correo electronico"+ "\n" + "Correo de destino: "+ correo;
	}

	@Override
	public Date setRecibido() {
		return notificaciondecorada.setRecibido();
	}

	@Override
	public boolean setLeido() {
		return notificaciondecorada.setLeido();
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	
}
