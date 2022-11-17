package punto1;

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
	
	public void vincularNodo(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo<T> getSiguiente() {
		return this.siguiente;
	}
	
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

	
	/*public boolean equals (Object obj) {
        if (obj instanceof Nodo) {
            Nodo tmp = (Nodo) obj;
            if (this.equals(tmp) && this.valor.equals(tmpProfesor.IdProfesor) ) {
                return true; 
            } else { 
            	return false; 
            }
        }  else
        	return false;
    } */
	
	public String toString() {
		return this.getValor().toString();
	}
}
