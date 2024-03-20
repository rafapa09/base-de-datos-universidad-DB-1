package co.edu.unbosque.model;

import java.util.ArrayList;

public class Biblioteca {

	private static  Biblioteca biblioteca;
	private String nombre;
	private ArrayList<Libro> libros;
	private ArrayList<Usuario> usuarios;
	
	private Biblioteca(String nom) {
		this.nombre=nom;
		libros=new ArrayList<Libro>();
		usuarios=new ArrayList<Usuario>();
	} 
		
	public static Biblioteca obtenerInstancia(String nom) {
		if (biblioteca==null) {
			biblioteca=new Biblioteca(nom);
		}
			return biblioteca;
	}
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}


	public String getNombre() {
		return nombre;
	}


	public ArrayList<Libro> getLibros() {
		return libros;
	}
		
}
