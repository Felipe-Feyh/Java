package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList <Usuario> lista = new ArrayList<>();
		//ou
		//List <Usuario> lista = new ArrayList<>(); ---------->>>>>>> s� precisa do import

		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Felipe"));
		
		System.out.println(lista.get(3)); // acessar pelo �ndice
		
		System.out.println("Removido: "+lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Tem Lia? " + lista.contains(new Usuario("Lia")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}

}
