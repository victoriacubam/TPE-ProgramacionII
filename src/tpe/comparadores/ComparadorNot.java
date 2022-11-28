package tpe.comparadores;

import java.util.Comparator;

public class ComparadorNot<T> implements Comparator<T> {
	Comparator<T> c1;
	
	public ComparadorNot(Comparator<T> c1) {
		this.c1 = c1;
	}
	
	@Override
	public int compare(T o1, T o2) {
		return (c1.compare(o1, o2))* -1;
	}
	
	
	
}
