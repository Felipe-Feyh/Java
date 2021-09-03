package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>(); // vai gerar a lista sem ordenação
		Set<String> listaAprovados = new TreeSet<>(); // garante a ordenação de inserção
		
		
		listaAprovados.add("Ana");
		listaAprovados.add("Jose");
		listaAprovados.add("Carlos");
		listaAprovados.add("Pedro");

		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(5);
		nums.add(8);
		nums.add(52);
		
		for (int n: nums) {
			System.out.println(n);
		}
	}

}
