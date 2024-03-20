package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;

import co.edu.unbosque.model.Biblioteca;
import co.edu.unbosque.model.Libro;
import co.edu.unbosque.model.LibroBuilder;
import co.edu.unbosque.model.Usuario;
import co.edu.unbosque.model.UsuarioBuilder;
import co.edu.unbosque.view.View;

public class Controller {

	private Biblioteca biblioteca;
	private LibroBuilder libro_builder;
	private UsuarioBuilder usuario_builder;
	private View view;
	
	 public Controller() {
		 biblioteca=biblioteca.obtenerInstancia("Lee y Aprende");
		 libro_builder= new LibroBuilder();
		 usuario_builder=new UsuarioBuilder();
		 
		 libro_builder.withTitulo("1984");
		 libro_builder.withAutor("George Orwell");
		 libro_builder.withISBN("28193");
		 libro_builder.withDisponibilidad(true);
		 biblioteca.getLibros().add(libro_builder.build());
		 
		 libro_builder.withTitulo("La rebelion de la granja");
		 libro_builder.withAutor("George Orwell");
		 libro_builder.withISBN("30492");
		 libro_builder.withDisponibilidad(true);
		 biblioteca.getLibros().add(libro_builder.build());
		 
		 usuario_builder.withNombre("Andres");
		 usuario_builder.withID("1");
		 usuario_builder.withLibros(new ArrayList<Libro>());
		 biblioteca.getUsuarios().add(usuario_builder.build());
		 
		 usuario_builder.withNombre("Rafael");
		 usuario_builder.withID("2");
		 usuario_builder.withLibros(new ArrayList<Libro>());
		 biblioteca.getUsuarios().add(usuario_builder.build());
		 
		 
		 view=new View();
		 ejecutar();
	}
	
	 public void ejecutar() {
		
		 try {
				view.salidaInformacion("");
				view.salidaInformacion("Opciones:");
				view.salidaInformacion("1)Ver libros ");
				view.salidaInformacion("2)Ver clientes");
				view.salidaInformacion("3)Insertar un nuevo libro");
				view.salidaInformacion("4)Insertar un nuevo ciente");
				view.salidaInformacion("5)Prestar un libro");
				view.salidaInformacion("6)Devolver un libro");
				view.salidaInformacion("7)Salir del programa");
				int eleccion = view.leerDatoint("Ingrese un valor");
				switch (eleccion) {
				case 1:

					for (int i = 0; i < biblioteca.getLibros().size(); i++) {
							view.salidaInformacion("Titulo: "+ biblioteca.getLibros().get(i).getTitulo());
							view.salidaInformacion("Autor: "+ biblioteca.getLibros().get(i).getAutor());
							view.salidaInformacion("ISBN: "+ biblioteca.getLibros().get(i).getISBN());
							if (biblioteca.getLibros().get(i).isDisponibilidad()) {
								view.salidaInformacion("Esta disponible");
							} else {
								view.salidaInformacion("No esta disponible");
							}
							view.salidaInformacion(" ");
					}
					
					break;
				case 2:
					for (int i = 0; i < biblioteca.getUsuarios().size(); i++) {
						view.salidaInformacion("Nombre: "+ biblioteca.getUsuarios().get(i).getNombre());
						view.salidaInformacion("ID: "+ biblioteca.getUsuarios().get(i).getId());
						view.salidaInformacion("Lista de libros:");
						for (int j = 0; j < biblioteca.getUsuarios().get(i).getLibros().size(); j++) {
							view.salidaInformacion("Titulo: "+ biblioteca.getUsuarios().get(i).getLibros().get(j).getTitulo());
						}
						view.salidaInformacion(" ");
					}
					break;
				case 3:
					String p1=view.leerString("Titulo del libro");
					String p2=view.leerString("Autor del libro");
					String p3=view.leerString("ISBN del libro");
					
					 libro_builder.withTitulo(p1);
					 libro_builder.withAutor(p2);
					 libro_builder.withISBN(p3);
					 libro_builder.withDisponibilidad(true);
					 biblioteca.getLibros().add(libro_builder.build());
					break;
				case 4:
					String p4=view.leerString("Nombre del cliente:");
					String p5=view.leerString("ID del cliente:");
					
					 usuario_builder.withNombre(p4);
					 usuario_builder.withID(p5);
					 usuario_builder.withLibros(new ArrayList<Libro>());
					 biblioteca.getUsuarios().add(usuario_builder.build());
					break;
				case 5:
					String id = view.leerString("Inserte el id del cliente: ");
					String isbn = view.leerString("Inserte el ISBN del libro: ");
					Libro lib=null;
					for (int i = 0; i < biblioteca.getLibros().size(); i++) {
						if (biblioteca.getLibros().get(i).getISBN().equals(isbn)) {
							biblioteca.getLibros().get(i).setDisponibilidad(false);
							lib = biblioteca.getLibros().get(i);
						}
					}
					for (int i = 0; i < biblioteca.getUsuarios().size(); i++) {
						if (biblioteca.getUsuarios().get(i).getId().equals(id)) {
							biblioteca.getUsuarios().get(i).getLibros().add(lib);
						}
					}
					break;
				case 6:
					String id2 = view.leerString("Inserte el id del cliente: ");
					String isbn2 = view.leerString("Inserte el ISBN del libro: ");
					Libro lib2=null;
					for (int i = 0; i < biblioteca.getLibros().size(); i++) {
						if (biblioteca.getLibros().get(i).getISBN().equals(isbn2)) {
							biblioteca.getLibros().get(i).setDisponibilidad(true);
							lib2 = biblioteca.getLibros().get(i);
						}
					}
					for (int i = 0; i < biblioteca.getUsuarios().size(); i++) {
						if (biblioteca.getUsuarios().get(i).getId().equals(id2)){
							for (int j = 0; j < biblioteca.getUsuarios().get(i).getLibros().size(); j++) {
								if (biblioteca.getUsuarios().get(i).getLibros().get(j).getISBN().equals(isbn2)) {
									biblioteca.getUsuarios().get(i).getLibros().remove(j);									
								}
							}
						}
					}
					break;
				case 7:
					System.exit(0);
				break;
				}
				ejecutar();
			} catch (InputMismatchException e) {
				view.salidaInformacion("Ingrese un caracter valido");
				view.getLeer().nextLine();
				ejecutar();
			}
		 
	}
	 
}
