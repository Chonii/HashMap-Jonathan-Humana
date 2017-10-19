package ar.edu.unlam.pb2;

public class SeleccionArgentina {
	private Integer numeroCamiseta;
	private String nombre;
	private String posicion;
	
	public SeleccionArgentina(Integer numero, String nombre, String posicion) {
		this.numeroCamiseta = numero;
		this.nombre = nombre;
		this.posicion = posicion;
	}
	public SeleccionArgentina(){
		
	}
	public Integer getNumeroCamiseta() {
		return numeroCamiseta;
	}
	public void setNumeroCamiseta(Integer numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public void mostrarObjeto(){
		System.out.println("NumCamiseta: "+numeroCamiseta+"\tNombre: "+nombre+"\tFuncion: "+posicion);
	}
}
