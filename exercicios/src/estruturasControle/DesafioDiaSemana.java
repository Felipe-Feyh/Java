package estruturasControle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		

		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o dia da semana: ");
		
		String dia = entrada.next();
		
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(dia + " é o 1º dia da semana");
		}
		
		else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println(dia + " é o 2º dia da semana");
		}
		
		else if (dia.equalsIgnoreCase("terça")) {
			System.out.println(dia + " é o 3º dia da semana");
		}
		else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println(dia + " é o 4º dia da semana");
		}
		else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println(dia + " é o 5º dia da semana");
		}
		else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println(dia + " é o 6º dia da semana");
		}
		else if (dia.equalsIgnoreCase("sábado")) {
			System.out.println(dia + " é o 7º dia da semana");
		}
		
		entrada.close();

	}

}
