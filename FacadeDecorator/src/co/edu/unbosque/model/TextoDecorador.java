package co.edu.unbosque.model;

import java.util.Date;

public class TextoDecorador extends NotificacionDecorador {

	private String numero;
	
	public TextoDecorador(Notificacion notificaciondecorada, String numero) {
		super(notificaciondecorada);
		this.numero = numero;
	}

	@Override
	public String setMensaje() {
		return notificaciondecorada.setMensaje()+ "\n"+" Mensaje de texto"+ "\n" + "Numero de destino: "+ numero;
	}

	@Override
	public Date setRecibido() {
		return notificaciondecorada.setRecibido();
	}

	@Override
	public boolean setLeido() {
		return notificaciondecorada.setLeido();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
}
