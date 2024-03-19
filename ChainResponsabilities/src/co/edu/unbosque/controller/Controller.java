package co.edu.unbosque.controller;

import co.edu.unbosque.model.Facade;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private Facade facade;
	
	public Controller() {

		view = new View();
		facade = new Facade();
		ejecutar();
		
	}
	
	public void ejecutar() {
		
		facade.getConsulta().siguienteManejador(facade.getDenuncia());
		facade.getDenuncia().siguienteManejador(facade.getPeticion());
		facade.getPeticion().siguienteManejador(facade.getQueja());
		
		view.salidaInformacion("Lista de peticiones: ");
		view.salidaInformacion("Tipo de solicitud: "+facade.getSolicitud1().getTiposolicitud());
		view.salidaInformacion("Descripcion: "+facade.getSolicitud1().getDescripcion());
		view.salidaInformacion("¿Se ha consultado? "+facade.getSolicitud1().isConsultada());
		view.salidaInformacion(" ");
		view.salidaInformacion("Tipo de solicitud: "+facade.getSolicitud2().getTiposolicitud());
		view.salidaInformacion("Descripcion: "+facade.getSolicitud2().getDescripcion());
		view.salidaInformacion("¿Se ha consultado? "+facade.getSolicitud2().isConsultada());
		view.salidaInformacion(" ");
		view.salidaInformacion("Tipo de solicitud: "+facade.getSolicitud3().getTiposolicitud());
		view.salidaInformacion("Descripcion: "+facade.getSolicitud3().getDescripcion());
		view.salidaInformacion("¿Se ha consultado? "+facade.getSolicitud3().isConsultada());
		view.salidaInformacion(" ");
		view.salidaInformacion("Tipo de solicitud: "+facade.getSolicitud4().getTiposolicitud());
		view.salidaInformacion("Descripcion: "+facade.getSolicitud4().getDescripcion());
		view.salidaInformacion("¿Se ha consultado? "+facade.getSolicitud4().isConsultada());
		view.salidaInformacion(" ");
		view.salidaInformacion(" ");
		view.salidaInformacion(" ");
		
		view.salidaInformacion("Peticiones consultadas:");
		facade.getConsulta().procesar(facade.getSolicitud1());
		facade.getConsulta().procesar(facade.getSolicitud2());
		facade.getConsulta().procesar(facade.getSolicitud3());
		facade.getConsulta().procesar(facade.getSolicitud4());
		
		view.salidaInformacion("Tipo de solicitud: "+facade.getSolicitud1().getTiposolicitud());
		view.salidaInformacion("Descripcion: "+facade.getSolicitud1().getDescripcion());
		view.salidaInformacion("¿Se ha consultado? "+facade.getSolicitud1().isConsultada());
		view.salidaInformacion(" ");
		view.salidaInformacion("Tipo de solicitud: "+facade.getSolicitud2().getTiposolicitud());
		view.salidaInformacion("Descripcion: "+facade.getSolicitud2().getDescripcion());
		view.salidaInformacion("¿Se ha consultado? "+facade.getSolicitud2().isConsultada());
		view.salidaInformacion(" ");
		view.salidaInformacion("Tipo de solicitud: "+facade.getSolicitud3().getTiposolicitud());
		view.salidaInformacion("Descripcion: "+facade.getSolicitud3().getDescripcion());
		view.salidaInformacion("¿Se ha consultado? "+facade.getSolicitud3().isConsultada());
		view.salidaInformacion(" ");
		view.salidaInformacion("Tipo de solicitud: "+facade.getSolicitud4().getTiposolicitud());
		view.salidaInformacion("Descripcion: "+facade.getSolicitud4().getDescripcion());
		view.salidaInformacion("¿Se ha consultado? "+facade.getSolicitud4().isConsultada());
		view.salidaInformacion(" ");
			
	}

}
