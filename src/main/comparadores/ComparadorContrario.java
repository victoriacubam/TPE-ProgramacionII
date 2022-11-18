package main.comparadores;

import java.util.Comparator;

public class ComparadorContrario implements Comparator<String> {
	Comparator<String> comparador;
	public ComparadorContrario(Comparator<String> comparador) {
		this.comparador = comparador;
	}
	@Override
	public int compare(String o1, String o2) {
		return 0;
	}

}
