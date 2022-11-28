package tpe.comparadores;
import java.util.Comparator;

import tpe.punto2.Alumno;

public class ComparadorApellido implements Comparator<Alumno> {
	@Override
	public int compare(Alumno a1, Alumno a2) {
		return a1.getApellido().compareToIgnoreCase(a2.getApellido());
	}

}
