package src;

import java.util.EmptyStackException;

public class PilaArreglo<T> implements IPila<T> {
	private T[] datos;
	private int tope;

	public PilaArreglo() {
		datos = (T[]) new Object[5];   // capacidad inicial: 5
		tope = 0;  // la pila empieza vacía	
	}

	public void pop(){
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		tope--;
		datos[tope] = null;
	
	}

	public void push(T dato){
		datos[tope] = dato;
		++tope;
	}
	
	public T peek(){
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		return datos[tope-1];
	
	}
	
	public boolean isEmpty() {
		return tope == 0;
	}

	public static void main(String[] args)  {
		IPila<Integer> pila = new PilaArreglo<>();
		pila.push(10);
		pila.push(20);
		pila.push(30);		
		System.out.println(pila.peek());
		pila.pop();
		System.out.println(pila.peek());
		pila.pop();	
		pila.pop();
		System.out.println(pila.isEmpty());
	}	

}

