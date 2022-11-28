package tpe.punto1;

import java.util.Comparator;
import java.util.Iterator;

public class ListaVinculada<T>  implements Iterable<T>{
	private Nodo<T> primerNodo;
	private Comparator<T> orden;

	public ListaVinculada(Comparator<T> orden) {
		this.primerNodo = null;
		this.orden = orden;
	}

	public Comparator<T> getOrden() {
		return orden;
	}
	
	public Nodo<T> getPrimerNodo(){
		return this.primerNodo;
	}
	
	public void setPrimerNodo(Nodo<T> nodo){
		this.primerNodo= nodo;
	}
	
	@Override
	public Iterator<T> iterator() {
		Iterador<T> iterador = new Iterador<T>(this.getPrimerNodo());
		return iterador;
	}

	public void setOrden(Comparator<T> orden) {
		this.orden = orden;
		this.ordenarElementos();
	}
	
	public void ordenarElementos() {
	        for (int i = 1; i<this.cantidadElementos(); i++) {
	        	Nodo<T> anterior = null;
	        	Nodo<T> actual = this.primerNodo;
	            Nodo<T> siguiente = this.primerNodo.getSiguiente();
	            while ( siguiente != null ) {
	                if (this.orden.compare(actual.getValor(), siguiente.getValor())>0) {
	                    if (anterior != null ) {
	                    	Nodo<T> sig = siguiente.getSiguiente();
	                        anterior.setSiguiente(siguiente);;
	                        siguiente.setSiguiente(actual);;
	                        actual.setSiguiente(sig);;
	                    } else {
	                    	Nodo<T> sig = siguiente.getSiguiente();
	                        this.primerNodo = siguiente;
	                        siguiente.setSiguiente(actual);
	                        actual.setSiguiente(sig);
	                    }
	                    anterior = siguiente;
	                    siguiente = actual.getSiguiente();
	                } else { 
	                    anterior = actual;
	                    actual = siguiente;
	                    siguiente = siguiente.getSiguiente();
	                }
	            } 
	        }
	}
	
	public int cantidadElementos() {
		int cantidad = 0;
		Nodo<T> aux = this.primerNodo;
		while(aux!=null) {
			aux = aux.getSiguiente();
			cantidad++;
		}
		return cantidad;
	}
	
	public void insertarOrdenado(T elemento) {
		Nodo<T> nuevo = new Nodo<T>(elemento);
		if (this.primerNodo == null)
			this.primerNodo = nuevo;
		else {
			Nodo<T> anterior = this.primerNodo;
			while (anterior!=null) {
				int resultado = this.orden.compare(anterior.getValor(), nuevo.getValor());
				int resultado2 = 0;
				if(anterior.getSiguiente()!=null)
					resultado2 = this.orden.compare(nuevo.getValor(), anterior.getSiguiente().getValor());

				//Si nuevo es menor que anterior y anterior es el primer nodo, 
				//el siguiente de nuevo se vuelve el primernodo y primernodo se vuelve nuevo
				if(resultado>0 && anterior==this.primerNodo) {
					nuevo.setSiguiente(this.primerNodo);       
					this.primerNodo = nuevo;
					break;	
				} 
				// Si nuevo es mayor que anterior y el siguiente de anterior en null entonces se agrega al final	
				else if(resultado<0 && anterior.getSiguiente()==null) {
					anterior.setSiguiente(nuevo);
					break;	
				} 
				//Si nuevo es mayor que anterior y nuevo es menor que siguiente
				else if(resultado<0 && resultado2<0) {
					nuevo.setSiguiente(anterior.getSiguiente());
					anterior.setSiguiente(nuevo);
				}

				anterior = anterior.getSiguiente();
			}
		}
	}
	
	public void eliminarElementoByPos(int posicion) {
		int contador = 1;
		if(this.primerNodo!=null) {
			if(posicion == 1) {
				this.primerNodo = this.primerNodo.getSiguiente();
			} else {
				Nodo<T> aux = this.primerNodo;
				while (contador < posicion-1) { //Me da el anterior al que quiero
					aux = aux.getSiguiente();
					contador++;
				}
				//Si el que busco existe
				if (aux.getSiguiente()!=null) { 
					//Le seteo como siguiente al siguiente q quiero eliminar
					aux.setSiguiente(aux.getSiguiente().getSiguiente()); 	
				} else {
					aux.setSiguiente(null);
				}
			}
		}
		return;
	}
	
	public void eliminarElemento(T elemento) {
		Nodo<T> actual = this.getPrimerNodo();
		Nodo<T> anterior = null;
		for(actual = this.primerNodo; actual!=null; actual = actual.getSiguiente()) {
			//Si actual no es igual al elemento q busco, anterior se vuele actual y actual se vuele actual.getSiguiente
			if(!actual.getValor().equals(elemento)) {
				anterior = actual;
			}
			//Si actual es el elemento que busco
			if(actual.getValor().equals(elemento)) { 
				//El que quiero eliminar es el primero
				if(actual==this.getPrimerNodo()) {
					this.setPrimerNodo(actual.getSiguiente());
				}
				//El que quiero eliminar no es el primero
				else {
					anterior.setSiguiente(actual.getSiguiente());
				}
			}
		}
	}
	
	public int obtenerPosicion(T elemento) {
		int posicion = 0;
		Nodo<T> aux = this.primerNodo;
		while(!aux.getValor().equals(elemento)) {
			if(aux.getSiguiente()!=null) {
				aux = aux.getSiguiente();
				posicion++;
			} else {
				break;
			}
		} 
		
		if(aux.getValor().equals(elemento)) {
			return posicion;
		} else {
			return -1;
		}
	}	
	
}
