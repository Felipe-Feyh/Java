package estruturasControle;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Voc� diz: ");
			valor = entrada.nextLine();
			
		}
		
		System.out.print("saiu");
		entrada.close();
	}

}
