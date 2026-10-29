package src;

/*
* Interface Pila Genérica
* @author Ángel Nahúm Camarillo Solano
* @author 29 Octubre 2026
*/

public interface IPila<T> { //forma de dividir los metodos

	public void pop();
	public void push(T dato);
	public T peek();
	public boolean isEmpty();

}