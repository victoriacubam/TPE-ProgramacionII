package punto3;
import java.util.ArrayList;
import java.util.Collections;

import punto2.Alumno;

public class Grupo extends Elemento{
	String name;
	ArrayList<Elemento> elementos;
	
	public Grupo (String name) {
		this.name = name;
		this.elementos = new ArrayList<>();
	}
	
	public Grupo() {
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(Elemento e) {
		this.elementos.add(e);
	}
	
	public int getCantidadAlumnos() {
		int cantidad = 0;
		for (Elemento e: elementos)
			cantidad += e.getCantidadAlumnos();
		return cantidad;
	}
	
	public String toString() {
		return this.name + " | Alumnos: " + this.getCantidadAlumnos();
	}
}
