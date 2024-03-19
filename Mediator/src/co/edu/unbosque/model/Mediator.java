package co.edu.unbosque.model;

import java.util.ArrayList;

public interface Mediator {

	public void sendMessage(Rol rol, String msg);
	public void defend(Rol rol, boolean dec);
	public String verify(Rol rol1, Rol rol2);
	
}
