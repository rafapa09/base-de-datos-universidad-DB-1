package co.edu.unbosque.model;

import java.util.Random;

public class Facade {

	private ConcreteMediator concreteMediator;
	private Random random;
	
	public Facade() {
		concreteMediator = new ConcreteMediator();
		random = new Random();
	}
	
	public String msgPlayer() {
		
		if (random.nextInt(2)==1) {
			concreteMediator.sendMessage(concreteMediator.getPlayer1(), "Mensaje de jugador 1 a jugador 2");
			return concreteMediator.getPlayer1().getMessage();
		} else {
			concreteMediator.sendMessage(concreteMediator.getPlayer2(), "Mensaje de jugador 2 a jugador 1");
			return concreteMediator.getPlayer2().getMessage();
		}
		
	}
	
	public String msgEnemy() {
		
		if (random.nextInt(2)==1) {
			concreteMediator.sendMessage(concreteMediator.getEnemy1(), "Mensaje de enemigo 1 a enemigo 2");
			return concreteMediator.getEnemy1().getMessage();
		} else {
			concreteMediator.sendMessage(concreteMediator.getEnemy2(), "Mensaje de enemigo 2 a enemigo 1");
			return concreteMediator.getEnemy2().getMessage();
		}
		
	}
	
	public void defPlayer() {
		
		Random def = new Random();
		boolean dec;
		if (def.nextInt(2)==1) {
			dec=true;
		} else {
			dec=false;
		}
		
		if (random.nextInt(2)==1) {
			concreteMediator.defend(concreteMediator.getPlayer1(), dec);
		} else {
			concreteMediator.defend(concreteMediator.getPlayer2(), dec);
		}
		
	}
	
	public void defEnemy() {
		
		Random def = new Random();
		boolean dec;
		if (def.nextInt(2)==1) {
			dec=true;
		} else {
			dec=false;
		}
		
		if (random.nextInt(2)==1) {
			concreteMediator.defend(concreteMediator.getEnemy1(), dec);
		} else {
			concreteMediator.defend(concreteMediator.getEnemy2(), dec);
		}
		
	}
	
	public String attPlayer() {
		
		int dec = random.nextInt(3);
		
		if (dec==0) {
			return concreteMediator.verify(concreteMediator.getPlayer1(), concreteMediator.getEnemy1());
		} else if(dec==1) {
			return concreteMediator.verify(concreteMediator.getPlayer1(), concreteMediator.getEnemy2());
		} else if(dec==2) {
			return concreteMediator.verify(concreteMediator.getPlayer2(), concreteMediator.getEnemy1());
		} else if(dec==3) {
			return concreteMediator.verify(concreteMediator.getPlayer2(), concreteMediator.getEnemy1());
		}
		return null;
		
	}
	
	public String attEnemy() {
		
		int dec = random.nextInt(3);
		
		if (dec==0) {
			return concreteMediator.verify(concreteMediator.getEnemy1(), concreteMediator.getPlayer1());
		} else if(dec==1) {
			return concreteMediator.verify(concreteMediator.getEnemy1(), concreteMediator.getPlayer2());
		} else if(dec==2) {
			return concreteMediator.verify(concreteMediator.getEnemy2(), concreteMediator.getPlayer1());
		} else if(dec==3) {
			return concreteMediator.verify(concreteMediator.getEnemy2(), concreteMediator.getPlayer2());
		}
		return null;
		
	}
	
}









