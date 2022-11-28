package tpe.comparadores;

import java.util.Comparator;

public class ComparadorNot implements Comparator<String> {
	Comparator<String> c1;
	
	public ComparadorNot(Comparator<String> c1) {
		this.c1 = c1;
	}
	
	@Override
	public int compare(String o1, String o2) {
		return (c1.compare(o1, o2))* -1;
	}
	
	
	
}
