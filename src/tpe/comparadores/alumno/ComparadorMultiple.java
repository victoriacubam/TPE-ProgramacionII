package tpe.comparadores.alumno;
import java.util.Comparator;

import tpe.punto2.Alumno;

public class ComparadorMultiple implements Comparator<Alumno>  {
	Comparator<Alumno> c1, c2;
	
	public ComparadorMultiple(Comparator<Alumno> c1, Comparator<Alumno> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public int compare(Alumno a1, Alumno a2) {
		int resultado = c1.compare(a1, a2);
		if (resultado == 0)
			return c2.compare(a1, a2);
		return resultado;
	}
}
