package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho � "+ conjunto.size());
		
		conjunto.add("teste");
		conjunto.add('x');
		System.out.println("Tamanho � " + conjunto.size());
		System.out.println("antes da remo��o do 'teste': "+conjunto);
		
		System.out.println(conjunto.remove("teste"));
		System.out.println("ap�s a remo��o do 'teste': "+conjunto);
		

		System.out.println(conjunto.remove("Teste"));
		System.out.println("ap�s a remo��o do 'Teste': "+conjunto);
		
		System.out.println(conjunto.remove("x"));
		
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		
		System.out.println("------- come�a o nums --------");
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println("imprime o nums: "+nums);
		
		
		//conjunto.addAll(nums); // uniao entre 2 conjuntos
		
		conjunto.retainAll(nums); // interce��o -- apenas o que possui em comum nos dois cojuntos
		System.out.println("Imprime a interce��o do conjunto com o nums: "+conjunto);
	
		conjunto.clear();
		System.out.println(conjunto);
		
	}
	
}
