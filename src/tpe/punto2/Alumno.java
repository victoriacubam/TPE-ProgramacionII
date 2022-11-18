package tpe.punto2;

import java.util.ArrayList;

import tpe.punto3.Elemento;

public class Alumno extends Elemento implements Comparable<Alumno> {
	String nombre, apellido;
	int dni, edad;
	ArrayList<String> intereses;

	public Alumno(String nombre, String apellido, int edad, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.intereses = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getDni() {
		return dni;
	}

	public void addIntereses(String palabra) {
		this.intereses.add(palabra);
	}
	
	public ArrayList<String> getIntereses() {
		return new ArrayList<>(this.intereses);
	}
	
	public int getCantidadAlumnos() {
		return 1;
	}

	@Override
	public int compareTo(Alumno o) {
		return this.getApellido().compareTo(o.getApellido());
	}
	
	public String toString() {
		return (this.getNombre() + " " + this.getApellido());
	}
}
