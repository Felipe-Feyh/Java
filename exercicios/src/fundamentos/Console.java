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
		
		System.out.printf("\nO nome completo � %s %s, e a idade � %d anos.", nome, sobrenome, idade);

		// � necess�rio sempre fechar o "entrada" pois fica ocupando mem�ria
		entrada.close();
	}

}
