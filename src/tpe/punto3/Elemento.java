package tpe.punto3;

public abstract class Elemento {
	String nombre;
	public Elemento(String nombre) {
		this.nombre = nombre;
	}
	public abstract int getCantidadAlumnos();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
