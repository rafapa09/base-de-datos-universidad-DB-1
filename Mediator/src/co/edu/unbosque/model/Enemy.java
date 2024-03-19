package co.edu.unbosque.model;

public class Enemy extends Rol {

	private String message;
	private boolean defend;
	
	public Enemy(Mediator mediator) {
		super(mediator);
		this.message="Mensajes recibidos: ";
		this.defend=false;
	}
	
	@Override
	public void sendMessage(String msg) {
		mediator.sendMessage(this, msg);
	}
	@Override
	public void recieveMessage(String msg) {
		this.message=this.message + "\n" + msg;
	}
	@Override
	public void defend(boolean msg) {
		mediator.defend(this, msg);
	}

	
	public String getMessage() {
		return message;
	}

	
	public boolean isDefend() {
		return defend;
	}
	public void setDefend(boolean defend) {
		this.defend = defend;
	}
	
}
