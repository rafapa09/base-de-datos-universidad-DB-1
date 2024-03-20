package co.edu.unbosque.model;

public class Libro {

	private String titulo;
	private String autor;
	private String ISBN;
	private boolean disponibilidad;
	
	public Libro(String titulo, String autor, String iSBN, boolean disponibilidad) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
		this.disponibilidad = disponibilidad;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	
	
}
