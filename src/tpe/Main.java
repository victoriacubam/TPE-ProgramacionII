package tpe;
import java.util.Comparator;
import java.util.Iterator;
import tpe.comparadores.*;
import tpe.punto1.*;
import tpe.punto2.*;
import tpe.punto3.*;

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
		System.out.println("c) Se elimina el elemento en la primer posicion (1), se eliminan dado el elemento los elementos 5 y 11");
		
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
		int posicion1 = l2.obtenerPosicion((T)s3);
		System.out.println("<"+s3+"> esta en la posicion: " + posicion1);
		
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
		System.out.println("i) Estructuras incorporadas a la lista ordenadas por cantidad de alumnos descendente");
		
		ComparadorCantidadMayor comparadorCant = new ComparadorCantidadMayor();

		ListaVinculada<T> l3 = new ListaVinculada<T>((Comparator<T>) comparadorCant);
		
		//Universidad
		Grupo unicen = new Grupo("Unicen");
		//Facultades
		Grupo exactas = new Grupo("Exactas");
		Grupo humanas = new Grupo("Humanas");
		//Materia
		Grupo Historia = new Grupo("Historia");
		//Alumno
		Alumno a1 = new Alumno("Jhon", "Doe", 1200000, 0);
		Alumno a2 = new Alumno("Federico", "Lopez", 35999888, 0);
		Alumno a3 = new Alumno("Juana", "Garcia", 27123455, 0);
		Alumno a4 = new Alumno("Mora", "Diaz", 37124425, 0);
		Alumno a5 = new Alumno("Flora", "Rivas", 34555111, 0);
		Alumno a6 = new Alumno("Martin", "Gomez", 34111222, 0);
		Alumno a7 = new Alumno("Roman", "Bazan", 32555111, 0);
		
		a1.addIntereses("intercambio");
		a2.addIntereses("redes");
		a2.addIntereses("php");
		a2.addIntereses("java");
		a2.addIntereses("Python");
		a3.addIntereses("programacion");
		a3.addIntereses("php");
		a3.addIntereses("java");
		a4.addIntereses("psicologia");
		a4.addIntereses("Freud");
		a5.addIntereses("historia");
		a5.addIntereses("antigua");
		a6.addIntereses("romanos");
		a6.addIntereses("egipcios");
		a6.addIntereses("griegos");
		a7.addIntereses("argentina");
		
		Historia.addElemento(a5);
		Historia.addElemento(a6);
		Historia.addElemento(a7);
		
		humanas.addElemento(Historia);
		humanas.addElemento(a4);
		
		exactas.addElemento(a2);
		exactas.addElemento(a3);
		
		unicen.addElemento(exactas);
		unicen.addElemento(humanas);
		unicen.addElemento(a1);
		
		l3.insertarOrdenado((T) unicen);

		Grupo olimpiadas = new Grupo("Olimpiadas Matematica");
		Grupo matea2 = new Grupo("Matea2");
		Grupo losFibo = new Grupo("LosFibo");
		
		Alumno a8 = new Alumno("Juan","Juarez",33222444,0);
		Alumno a9 = new Alumno("Julio","Cesar",33222111,0);
		Alumno a10 = new Alumno("Bernardino","Rivas",30987654,0);
		Alumno a11 = new Alumno("Jose","Paso",33322112,0);
		Alumno a12 = new Alumno("Isaac","Newton",12343565,0);
		
		matea2.addElemento(a8);
		matea2.addElemento(a9);
		
		losFibo.addElemento(a10);
		losFibo.addElemento(a11);
		losFibo.addElemento(a12);
		
		olimpiadas.addElemento(matea2);
		olimpiadas.addElemento(losFibo);
		
		l3.insertarOrdenado((T)olimpiadas);
		imprimirLista(l3);
	}
	
	public static <T> void imprimirLista(ListaVinculada<T> l) {
		Iterator<ListaVinculada<T>> iter = l.iterator();	
		while (iter.hasNext()) {
			T next = (T) iter.next();
			System.out.println(next); 
		}
	}

}
