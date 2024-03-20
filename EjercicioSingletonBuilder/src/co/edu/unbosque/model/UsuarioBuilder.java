package co.edu.unbosque.model;

import java.util.ArrayList;

public class UsuarioBuilder {

	private String nombre;
	private String id;
	private ArrayList<Libro> libros;
	
	public UsuarioBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public UsuarioBuilder withNombre(String nom) {
		this.nombre=nom;
		return this;
	}
	
	public UsuarioBuilder withID(String id) {
		this.id=id;
		return this;
	}
	
	public UsuarioBuilder withLibros(ArrayList<Libro> lib) {
		this.libros=lib;
		return this;
	}

	public Usuario build() {
		return new Usuario(nombre, id, libros);
	}
	
}
