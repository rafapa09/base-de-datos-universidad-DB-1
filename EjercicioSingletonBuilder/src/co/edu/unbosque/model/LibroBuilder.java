package co.edu.unbosque.model;

public class LibroBuilder {

	private String titulo;
	private String autor;
	private String ISBN;
	private boolean disponibilidad;
	
	public LibroBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public LibroBuilder withTitulo(String tit) {
		this.titulo=tit;
		return this;
	}
	
	public LibroBuilder withAutor(String aut) {
		this.autor=aut;
		return this;
	}
	
	public LibroBuilder withISBN(String isbn) {
		this.ISBN=isbn;
		return this;
	}
	
	public LibroBuilder withDisponibilidad(boolean dis) {
		this.disponibilidad=dis;
		return this;
	}
	
	public Libro build() {
		return new Libro(titulo, autor, ISBN, disponibilidad);
	}
	
}
