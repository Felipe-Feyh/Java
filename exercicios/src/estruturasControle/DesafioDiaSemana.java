package estruturasControle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		

		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o dia da semana: ");
		
		String dia = entrada.next();
		
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(dia + " � o 1� dia da semana");
		}
		
		else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println(dia + " � o 2� dia da semana");
		}
		
		else if (dia.equalsIgnoreCase("ter�a")) {
			System.out.println(dia + " � o 3� dia da semana");
		}
		else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println(dia + " � o 4� dia da semana");
		}
		else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println(dia + " � o 5� dia da semana");
		}
		else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println(dia + " � o 6� dia da semana");
		}
		else if (dia.equalsIgnoreCase("s�bado")) {
			System.out.println(dia + " � o 7� dia da semana");
		}
		
		entrada.close();

	}

}
