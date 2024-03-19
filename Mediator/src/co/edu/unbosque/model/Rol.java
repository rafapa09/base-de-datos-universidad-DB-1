package co.edu.unbosque.model;

public abstract class Rol {

	protected Mediator mediator;

	public Rol(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
	public abstract void sendMessage(String msg);
	public abstract void recieveMessage(String msg);
	public abstract void defend(boolean msg);
}
