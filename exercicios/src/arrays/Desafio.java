package arrays;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Quantidade de notas a inserir: ");
		int qtdNotas = entrada.nextInt();
				
		Double[] notas = new Double[qtdNotas];
		
		
		for (int i = 0; i < notas.length; i++) {

			System.out.println("Nota "+ (i+1) +": ");
			notas[i] = entrada.nextDouble();
		}
		
		Double media = 0.0;
		for (int i = 0; i < notas.length; i++) {			
			media = (notas[i]+media);				
		}
		
		System.out.println("Média: "+media/qtdNotas);
		
		
		entrada.close();
	}
}
