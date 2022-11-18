package punto3;

import java.util.Comparator;

public class ComparadorCantidadMayor implements Comparator<Grupo>{

	public int compare(Grupo o1, Grupo o2) {
		return (o2.getCantidadAlumnos() - o1.getCantidadAlumnos());
	}

}
