package tpe.comparadores;

import java.util.Comparator;

import tpe.punto3.Grupo;

public class ComparadorCantidadMayor implements Comparator<Grupo>{

	public int compare(Grupo o1, Grupo o2) {
		return (o2.getCantidadAlumnos() - o1.getCantidadAlumnos());
	}

}
