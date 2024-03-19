package co.edu.unbosque.model;

import java.util.ArrayList;

public class ConcreteMediator implements Mediator {

	private Player player1;
	private Player player2;
	
	private Enemy enemy1;
	private Enemy enemy2;

	
	public ConcreteMediator() {
		player1= new Player(this);
		player2= new Player(this);
		
		enemy1= new Enemy(this);
		enemy2= new Enemy(this);
		
	}
	
	@Override
	public void sendMessage(Rol rol, String msg) {
		if (rol==player1) {
			player2.recieveMessage(msg);
		}else if (rol==player2) {
			player1.recieveMessage(msg);
		}else if (rol==enemy1) {
			enemy2.recieveMessage(msg);
		}else if (rol==enemy2) {
			enemy1.recieveMessage(msg);
		}
	}

	
	@Override
	public void defend(Rol rol, boolean dec) {
		if (rol==player1) {
			player1.setDefend(dec);
		}else if (rol==player2) {
			player2.setDefend(dec);
		}else if (rol==enemy1) {
			enemy1.setDefend(dec);
		}else if (rol==enemy2) {
			enemy2.setDefend(dec);
		}
	}
	
	@Override
	public String verify(Rol rol1, Rol rol2) {
		if (rol1==player1 && rol2==enemy1 ) {
			
			if (enemy1.isDefend()) {
				return "El enemigo 1 no recibe daño por parte del jugador 1";
			} else {
				return "El enemigo 1 recibe daño por parte del jugador 1";
			} 
				
		} else if (rol1==player1 && rol2==enemy2) {
				
			if (enemy2.isDefend()) {
				return "El enemigo 2 no recibe daño por parte del jugador 1";
			} else {
				return "El enemigo 2 recibe daño por parte del jugador 1";
			} 
			
		} else if (rol1==player2 && rol2==enemy1) {
			
			if (enemy1.isDefend()) {
				return "El enemigo 1 no recibe daño por parte del jugador 2";
			} else {
				return "El enemigo 1 recibe daño por parte del jugador 2";
			} 
			
		} else if (rol1==player2 && rol2==enemy2) {
			
			if (enemy2.isDefend()) {
				return "El enemigo 2 no recibe daño por parte del jugador 2";
			} else {
				return "El enemigo 2 recibe daño por parte del jugador 2";
			} 
			
		} else if (rol1==enemy1 && rol2==player1) {
			
			if (player1.isDefend()) {
				return "El jugador 1 no recibe daño por parte del enemigo 1";
			} else {
				return "El jugador 1 recibe daño por parte del enemigo 1";
			} 
			
		} else if (rol1==enemy1 && rol2==player2) {
			
			if (player2.isDefend()) {
				return "El jugador 2 no recibe daño por parte del enemigo 1";
			} else {
				return "El jugador 2 recibe daño por parte del enemigo 1";
			} 
			
		} else if (rol1==enemy2 && rol2==player1) {
			
			if (player1.isDefend()) {
				return "El jugador 1 no recibe daño por parte del enemigo 2";
			} else {
				return "El jugador 1 recibe daño por parte del enemigo 2";
			} 
			
		} else if (rol1==enemy2 && rol2==player2) {
			
			if (player2.isDefend()) {
				return "El jugador 2 no recibe daño por parte del enemigo 2";
			} else {
				return "El jugador 2 recibe daño por parte del enemigo 2";
			} 
			
		}	
		
		return null;
	}
	
	public Player getPlayer1() {
		return player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public Enemy getEnemy1() {
		return enemy1;
	}

	public Enemy getEnemy2() {
		return enemy2;
	}

}