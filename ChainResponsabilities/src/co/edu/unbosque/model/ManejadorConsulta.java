package co.edu.unbosque.model;

public class ManejadorConsulta extends Manejador {

	private Manejador manejador;

	@Override
	public Solicitud procesar(Solicitud solicitud) {
		if (solicitud.getTiposolicitud().equals("Consulta")) {
			solicitud.setConsultada(true);
			solicitud.setDescripcion("solicitud consultada"+"\n"+solicitud.getDescripcion());
			return solicitud;
		} else {
			manejador.procesar(solicitud);
			return null;
		}
	}

	@Override
	public void siguienteManejador(Manejador manejador) {
		this.manejador=manejador;
	}
	
}
