package tpe.punto3;
import java.util.ArrayList;

public class Grupo extends Elemento{
	ArrayList<Elemento> elementos;
	
	public Grupo (String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(Elemento e) {
		if(!this.elementos.contains(e)) {
			this.elementos.add(e);	
		}
	}
	
	public ArrayList<Elemento> getElementos(){
		return new ArrayList<>(this.elementos);
	}
	
	public int getCantidadAlumnos() {
		int cantidad = 0;
		for (Elemento e: elementos)
			cantidad += e.getCantidadAlumnos();
		return cantidad;
	}
	
	public String toString() {
		return this.nombre + " | Alumnos: " + this.getCantidadAlumnos();
	}
	
	public boolean equals(Object grupo) {
		try {
			Grupo g = (Grupo)grupo;
			return this.nombre.equals(g.getNombre())&&this.getElementos().equals(g.getElementos()); //El arraylist es asi?
			
		} catch (Exception e) {
			return false;
		}
	}
	

}
