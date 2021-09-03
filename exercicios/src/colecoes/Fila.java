package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// offer e add -> adicionam elementos na fila
		//Diferen�a � o comportamento quando a fila est� cheia
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lan�a uma exce��o
		fila.add("Daniel");
		fila.offer("Luana");
		fila.add("Rafael");
		
		
		// Peek e Element -> obter o pr�ximo elemento da fila sem remover
		// a diferen�a ocorre quando a fila est� vazia
		System.out.println(fila.peek());// retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // retorna uma exce��o
		System.out.println(fila.element());
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());

		//Poll e Remove -> obeter o pr�ximo elemento da fila e remove
	}

}
