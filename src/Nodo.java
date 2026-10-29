package src;

public class Nodo<T> {

	private T dato;
	private Nodo next;

	public Nodo(T nuevoDato) {
		this.dato = nuevoDato;
	
	}

	public Nodo getNodo() {
		return this.next;
	
	}

	public void setNodo(Nodo nuevo) {
		this.next = nuevo;
	}

	public T getDato(){
		return this.dato;
	}
}