package classe;



public class ProdutoTeste {

	public static void main(String[] args) {
	
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4500.00;

		var p2 = new Produto();
		p2.nome = "\nMouse";
		p2.preco = 50.00;
		
		//variável que controla o desconto
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome);		
		double precoFinal1 = p1.precoComDesconto();
		System.out.println("Preço sem desconto: "+p1.preco);
		System.out.println("Preço com desconto: "+precoFinal1);
		
		
		System.out.println(p2.nome);
		double precoFinal2 = p2.precoComDesconto();
		System.out.println("Preço 2 sem desconto: "+p2.preco);
		System.out.println("Preço 2 com desconto: "+precoFinal2);	
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
		

		
	
		
		
		System.out.println("\nMédia do carrinho: R$"+mediaCarrinho);
	}

}
