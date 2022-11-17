package punto2.comparadores;
import java.util.Comparator;
import punto2.Alumno;

public class ComparadorEdad implements Comparator<Alumno> {

	@Override
	public int compare(Alumno a1, Alumno a2) {
		return a1.getEdad()-a2.getEdad();
	}

}
