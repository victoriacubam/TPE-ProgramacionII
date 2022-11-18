package main;
import java.util.Comparator;
import java.util.Iterator;
import main.comparadores.*;
import punto1.ComparadorValor;
import punto1.ListaVinculada;
import punto1.Nodo;
import punto2.Alumno;
import punto2.comparadores.*;


public class Main {

	public static <T> void main(String[] args) {
		
		// a)
		
		ComparadorValor comparadorEnteros = new ComparadorValor();
		
		ListaVinculada<T> l1 = new ListaVinculada<T>((Comparator<T>) comparadorEnteros);
		
		Integer n1 = 10;
		Integer n2 = 21;
		Integer n3 = 1;
		Integer n4 = 5;
		Integer n5 = 11;

		l1.insertarOrdenado((T)n1);
		l1.insertarOrdenado((T)n2);
		l1.insertarOrdenado((T)n3);
		l1.insertarOrdenado((T)n4);
		l1.insertarOrdenado((T)n5);
		
		// b)
		System.out.println("b) Recorrer la lista creada e imprimirla");
		imprimirLista(l1);
		
		// c)
		System.out.println("c) Se elimina el elemento en la primer posicion, se eliminan dado el elemento los elementos 5 y 11");
		
		l1.eliminarElementoByPos(1); // 1		
		l1.eliminarElemento((T)n4);  // 5
		l1.eliminarElemento((T)n5);  // 11
		
		imprimirLista(l1);
		
		// d)
		ComparadorString comparadorString = new ComparadorString();
		
		ListaVinculada<T> l2 = new ListaVinculada<T>((Comparator<T>) comparadorString);
		
		String s1 = "Facil";
		String s2 = "Es";
		String s3 = "Parcial";
		String s4 = "Prog 2";
		
		l2.insertarOrdenado((T)s1);
		l2.insertarOrdenado((T)s2);
		l2.insertarOrdenado((T)s3);
		l2.insertarOrdenado((T)s4);
		
		// e)
		
		System.out.println("e) Recorrer la lista creada e imprimirla");
		imprimirLista(l2);
		
		// f)
		System.out.println("f)");
		int posicion1 = l2.obtenerPosicion((T)s1);
		System.out.println("<"+s1+"> esta en la posicion: " + posicion1);
		
		// g)
		System.out.println("g)");
		
		String s5 = "Recuperatorio";
		int posicion2 = l2.obtenerPosicion((T)s5);
		System.out.println("<"+ s5 + "> esta en la posicion: " + posicion2);
		
		// h)
		
		System.out.println("h) Lista ordenada descendentemente");
		ComparadorStringDesc comparadorStringDesc = new ComparadorStringDesc();
		
		l2.setOrden((Comparator<T>) comparadorStringDesc);
		imprimirLista(l2);

		// i)
		//System.out.println("i)");



		
	}
	
	public static <T> void imprimirLista(ListaVinculada<T> l) {
		Iterator<ListaVinculada<T>> iter = l.iterator();	
		while (iter.hasNext()) {
			T next = (T) iter.next();
			System.out.println(next); 
		}
	}

}
