package classe;



public class ProdutoTeste {

	public static void main(String[] args) {
	
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4500.00;

		var p2 = new Produto();
		p2.nome = "\nMouse";
		p2.preco = 50.00;
		
		//vari�vel que controla o desconto
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome);		
		double precoFinal1 = p1.precoComDesconto();
		System.out.println("Pre�o sem desconto: "+p1.preco);
		System.out.println("Pre�o com desconto: "+precoFinal1);
		
		
		System.out.println(p2.nome);
		double precoFinal2 = p2.precoComDesconto();
		System.out.println("Pre�o 2 sem desconto: "+p2.preco);
		System.out.println("Pre�o 2 com desconto: "+precoFinal2);	
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
		

		
	
		
		
		System.out.println("\nM�dia do carrinho: R$"+mediaCarrinho);
	}

}
