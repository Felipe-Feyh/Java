package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Sal�rio 1: ");
		String salario1 = entrada.nextLine();
		
		System.out.print("salario 2: ");
		String salario2 = entrada.nextLine();

		System.out.print("salario 3: ");
		String salario3 = entrada.nextLine();
		
		
		//usei o replace para tratar as entradas com v�rgulas
		double media = (Double.parseDouble(salario1.replace(",", "."))
						+Double.parseDouble(salario2.replace(",", "."))
						+Double.parseDouble(salario3.replace(",", ".")))
						/3;
		System.out.println("M�dia: R$" + media);

		entrada.close();
	}

}
