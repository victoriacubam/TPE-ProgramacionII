package tpe.comparadores;

import java.util.Comparator;

import tpe.punto2.Alumno;

public class ComparadorDNI implements Comparator<Alumno> {

	@Override
	public int compare(Alumno a1, Alumno a2) {
		return a1.getDni()-a2.getDni();
	}


}
