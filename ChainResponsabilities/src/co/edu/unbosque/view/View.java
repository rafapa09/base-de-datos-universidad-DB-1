package co.edu.unbosque.view;
import java.util.Scanner;

public class View {

	private Scanner leer;
	
	public View(){

		leer=new Scanner(System.in);

	}

	public void salidaInformacion(String texto) {

		System.out.println(texto);
		texto.lines();

	}

	public int leerDatoint(String texto) {
		
		int dato=0;
		System.out.println(texto);
		dato=leer.nextInt();
		leer.nextLine();
		return dato;
		
		
	}

	public String leerString(String texto) {
		
		String dato="";
		System.out.println(texto);
		dato=leer.nextLine();
		return dato;
		
	}

	public char leerChar(String texto) {
		
		char dato;
		dato=' ';
		System.out.println(texto);
		dato=leer.next().charAt(0);
		leer.nextLine();
		texto.lines();
		return dato;
		
	}

	public long leerDatoLong(String texto) {
		long dato=0;
		System.out.println(texto);
		dato=leer.nextLong();
		leer.nextLine();
		return dato;
	}
	
	public double leerDouble(String texto) {
		double dato=0;
		System.out.println(texto);
		dato=leer.nextDouble();
		leer.nextLine();
		return dato;
	}

	public Scanner getLeer() {
		return leer;
	}

}

