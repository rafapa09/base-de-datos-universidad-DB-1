package co.edu.unbosque.model;

public abstract class Manejador {

	public abstract Solicitud procesar(Solicitud solicitud);
	public abstract void siguienteManejador(Manejador manejador);
	
}
