package co.edu.unbosque.model;

import java.util.ArrayList;

public class Usuario {

	private String nombre;
	private String id;
	private ArrayList<Libro> libros;
	
	public Usuario(String nombre, String id, ArrayList<Libro> libros) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.libros = libros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	
	
	
}
