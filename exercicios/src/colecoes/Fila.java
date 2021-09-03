package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// offer e add -> adicionam elementos na fila
		//Diferença é o comportamento quando a fila está cheia
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lança uma exceção
		fila.add("Daniel");
		fila.offer("Luana");
		fila.add("Rafael");
		
		
		// Peek e Element -> obter o próximo elemento da fila sem remover
		// a diferença ocorre quando a fila está vazia
		System.out.println(fila.peek());// retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // retorna uma exceção
		System.out.println(fila.element());
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());

		//Poll e Remove -> obeter o próximo elemento da fila e remove
	}

}
