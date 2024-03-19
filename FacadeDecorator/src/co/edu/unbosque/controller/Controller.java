package co.edu.unbosque.controller;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private Fachada fachada;
	
	public Controller() {
		view = new View();
		fachada = new Fachada();
		
		view.salidaInformacion(fachada.getNotificacioncorreo().setMensaje());
		view.salidaInformacion("fecha en que se recibio: "+ fachada.getNotificacioncorreo().setRecibido());
		view.salidaInformacion("¿Se ha leido el mensaje? " +fachada.getNotificacioncorreo().setLeido());
		view.salidaInformacion("");
		view.salidaInformacion(fachada.getNotificaciontexto().setMensaje());
		view.salidaInformacion("fecha en que se recibio: "+ fachada.getNotificaciontexto().setRecibido());
		view.salidaInformacion("¿Se ha leido el mensaje? " +fachada.getNotificaciontexto().setLeido());
		view.salidaInformacion("");
		view.salidaInformacion(fachada.getNotificacionpush().setMensaje());
		view.salidaInformacion("fecha en que se recibio: "+ fachada.getNotificacionpush().setRecibido());
		view.salidaInformacion("¿Se ha leido el mensaje? " +fachada.getNotificacionpush().setLeido());
		
	}
	

}
