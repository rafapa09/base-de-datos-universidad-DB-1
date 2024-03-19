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
		
		
		try {
			view.salidaInformacion("Menu de batalla");
			view.salidaInformacion("1) enviar mensajes entre jugadores");
			view.salidaInformacion("2) enviar mensajes entre enemigos");
			view.salidaInformacion("3) defensa de jugadores");
			view.salidaInformacion("4) defensa de enemigos");
			view.salidaInformacion("5) ataque de jugadores");
			view.salidaInformacion("6) ataque de enemigos");
			view.salidaInformacion("7) salir");			
			int key=view.leerDatoint("");
			switch (key) {
			case 1:
				view.salidaInformacion(facade.msgPlayer());
				break;
			case 2:
				view.salidaInformacion(facade.msgEnemy());
				break;
			case 3:
				facade.defPlayer();
				view.salidaInformacion("Defensa establecida en un jugador");
				break;
			case 4:
				facade.defEnemy();
				view.salidaInformacion("Defensa establecida en un enemigo");
				break;
			case 5:
				view.salidaInformacion(facade.attPlayer());
				break;
			case 6:
				view.salidaInformacion(facade.attEnemy());
				break;
			case 7:
				System.exit(0);
				break;
			default:
				break;
			}
			ejecutar();
			view.getLeer().nextLine();
		} catch (Exception e) {
			view.salidaInformacion("ingrse un valor valido");
			view.getLeer().nextLine();
			ejecutar();
		}
		

		
		
	}
	
	
}
