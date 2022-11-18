import java.util.Comparator;
import java.util.Iterator;

import punto1.ComparadorValor;
import punto1.ListaVinculada;
import punto1.Nodo;
import punto2.Alumno;
import punto2.comparadores.*;


public class Main {

	public static <T> void main(String[] args) {
		//ComparadorApellido comparadorApellido = new ComparadorApellido();
		//ComparadorNombre comparadorNombre = new ComparadorNombre();
		//ComparadorMultiple comparadorMultiple = new ComparadorMultiple(comparadorApellido, comparadorNombre);
		
		ComparadorValor com = new ComparadorValor();
		
		ListaVinculada<T> l1 = new ListaVinculada<T>((Comparator<T>) com);
		
		// a)
		Integer n1 = 10;
		Integer n2 = 21;
		Integer n3 = 1;
		Integer n4 = 5;
		Integer n5 = 11;
		Integer n6 = 6;
		//No me toma el 11 ni el 6
		l1.insertarOrdenado((T)n1);
		l1.insertarOrdenado((T)n2);
		l1.insertarOrdenado((T)n3);
		l1.insertarOrdenado((T)n4);
		l1.insertarOrdenado((T)n5);
		l1.insertarOrdenado((T)n6);
		
		// b)
		System.out.println("Primera impresion");
		imprimirLista(l1);
		
		// c)
		System.out.println("Segunda impresion");
		l1.eliminarElementoByPos(1);		
		l1.eliminarElemento((T)n4); 
		l1.eliminarElemento((T)n5); 
		
		imprimirLista(l1);
		
		
		
	}
	
	public static <T> void imprimirLista(ListaVinculada<T> l1) {
		/*Nodo<T> actual = l1.getPrimerNodo();
		for(int pos = 0; pos<l1.cantidadElementos(); pos++) {
			System.out.println(actual.getValor());
			actual = actual.getSiguiente();
		}*/
		Iterator<ListaVinculada<T>> iter = l1.iterator();
		
		while(iter.hasNext()) {
			T next = (T) iter.next();
			System.out.println(next); 
		}
	}

}
