package estruturasControle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0 && media < 11) {
			System.out.println("Aprovado");
			
		}else if (media < 7 && media >= 0) {
			System.out.println("Reprovado");
		}
		
		else {
			System.out.println("Nota inv�lida");
		}

		entrada.close();
	}

}
