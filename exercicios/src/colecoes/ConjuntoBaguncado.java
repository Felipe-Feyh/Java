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
		
		System.out.println("Tamanho é "+ conjunto.size());
		
		conjunto.add("teste");
		conjunto.add('x');
		System.out.println("Tamanho é " + conjunto.size());
		System.out.println("antes da remoção do 'teste': "+conjunto);
		
		System.out.println(conjunto.remove("teste"));
		System.out.println("após a remoção do 'teste': "+conjunto);
		

		System.out.println(conjunto.remove("Teste"));
		System.out.println("após a remoção do 'Teste': "+conjunto);
		
		System.out.println(conjunto.remove("x"));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		
		System.out.println("------- começa o nums --------");
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println("imprime o nums: "+nums);
		
		
		//conjunto.addAll(nums); // uniao entre 2 conjuntos
		
		conjunto.retainAll(nums); // interceção -- apenas o que possui em comum nos dois cojuntos
		System.out.println("Imprime a interceção do conjunto com o nums: "+conjunto);
	
		conjunto.clear();
		System.out.println(conjunto);
		
	}
	
}
