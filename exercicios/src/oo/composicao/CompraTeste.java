package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João pedro";
		compra1.adicionarItem(new Item("caneta", 20, 7.45));
		compra1.adicionarItem(new Item("borracha", 12, 3.67));
		compra1.adicionarItem(new Item("caderno", 3, 18.50));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal());
		
		// mostra a relação bidirecional
		double total = compra1.itens.get(0).compra
			.itens.get(1).compra.getValorTotal();
		System.out.println("O total é " + total);
		
	}

}
