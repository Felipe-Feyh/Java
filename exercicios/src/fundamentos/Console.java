package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("\nO nome completo é %s %s, e a idade é %d anos.", nome, sobrenome, idade);

		// é necessário sempre fechar o "entrada" pois fica ocupando memória
		entrada.close();
	}

}
