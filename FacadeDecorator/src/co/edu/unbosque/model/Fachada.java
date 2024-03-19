package co.edu.unbosque.model;

public class Fachada {

	private Notificacion notificacioncorreo;
	private Notificacion notificaciontexto;
	private Notificacion notificacionpush;
	
	public Fachada() {
		
		notificacioncorreo = new NotificacionBase();
		notificaciontexto = new NotificacionBase();
		notificacionpush = new NotificacionBase();
		
		notificacioncorreo = new CorreoDecorador(notificacioncorreo, "rafapa09@gmail.com");
		notificaciontexto = new TextoDecorador(notificaciontexto, "3102940394");
		notificacionpush = new PushDecorador(notificacionpush, "Redmi 7");
		
	}

	public Notificacion getNotificacioncorreo() {
		return notificacioncorreo;
	}

	public Notificacion getNotificaciontexto() {
		return notificaciontexto;
	}

	public Notificacion getNotificacionpush() {
		return notificacionpush;
	}

}
