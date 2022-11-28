package tpe.punto1;

public class Nodo<T>{
	T valor;
	Nodo<T> siguiente;
	
	public Nodo (T valor) {
		this.valor = valor;
		this.siguiente = null;
	}
	
	public T getValor() {
		return this.valor;
	}

	public Nodo<T> getSiguiente() {
		return this.siguiente;
	}
	
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	public String toString() {
		return this.getValor().toString();
	}
}
