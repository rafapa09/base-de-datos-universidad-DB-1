package co.edu.unbosque.model;

public class Facade {

	private Solicitud solicitud1;
	private Solicitud solicitud2;
	private Solicitud solicitud3;
	private Solicitud solicitud4;
	
	private ManejadorConsulta consulta;
	private ManejadorDenuncia denuncia;
	private ManejadorPeticion peticion;
	private ManejadorQueja queja;
	
	public Facade() {
		solicitud1= new Solicitud("Denuncia", "Denuncia a la policia por robo");
		solicitud2= new Solicitud("Consulta", "Cotizacion de dispositivos moviles");
		solicitud3= new Solicitud("Peticion", "Reduccion de precios en una cafeteria");
		solicitud4= new Solicitud("Queja", "Actitud grosera por parte de los dependinetes de la tienda");
		
		consulta= new ManejadorConsulta();
		denuncia= new ManejadorDenuncia();
		peticion= new ManejadorPeticion();
		queja = new ManejadorQueja();
	}

	public Solicitud getSolicitud1() {
		return solicitud1;
	}

	public void setSolicitud1(Solicitud solicitud1) {
		this.solicitud1 = solicitud1;
	}

	public Solicitud getSolicitud2() {
		return solicitud2;
	}

	public void setSolicitud2(Solicitud solicitud2) {
		this.solicitud2 = solicitud2;
	}

	public Solicitud getSolicitud3() {
		return solicitud3;
	}

	public void setSolicitud3(Solicitud solicitud3) {
		this.solicitud3 = solicitud3;
	}

	public Solicitud getSolicitud4() {
		return solicitud4;
	}

	public void setSolicitud4(Solicitud solicitud4) {
		this.solicitud4 = solicitud4;
	}

	public ManejadorConsulta getConsulta() {
		return consulta;
	}

	public void setConsulta(ManejadorConsulta consulta) {
		this.consulta = consulta;
	}

	public ManejadorDenuncia getDenuncia() {
		return denuncia;
	}

	public void setDenuncia(ManejadorDenuncia denuncia) {
		this.denuncia = denuncia;
	}

	public ManejadorPeticion getPeticion() {
		return peticion;
	}

	public void setPeticion(ManejadorPeticion peticion) {
		this.peticion = peticion;
	}

	public ManejadorQueja getQueja() {
		return queja;
	}

	public void setQueja(ManejadorQueja queja) {
		this.queja = queja;
	}
	
	
	
}
