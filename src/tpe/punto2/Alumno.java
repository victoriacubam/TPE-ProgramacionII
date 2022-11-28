package tpe.punto2;

import java.util.ArrayList;

import tpe.punto3.Elemento;

public class Alumno extends Elemento {
	private String apellido;
	private int dni, edad;
	private ArrayList<String> intereses;

	public Alumno(String nombre, String apellido, int edad, int dni) {
		super(nombre);
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.intereses = new ArrayList<>();
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
		if(!this.intereses.contains(palabra))
			this.intereses.add(palabra);
	}
	
	public ArrayList<String> getIntereses() {
		return new ArrayList<>(this.intereses);
	}
	
	public int getCantidadAlumnos() {
		return 1;
	}
	
	public boolean equals(Object a) {
		try {
			Alumno otro = (Alumno)a;
			return this.getNombre().equals(otro.getNombre())&&this.getApellido().equals(otro.getApellido())&&
					this.getDni()==otro.getDni()&&this.getEdad()==otro.getEdad();
		} catch (Exception e) {
			return false;
		}
	}
	
	public String toString() {
		return (this.getNombre() + " " + this.getApellido());
	}
}
