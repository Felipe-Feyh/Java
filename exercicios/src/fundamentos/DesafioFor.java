package fundamentos;

public class DesafioFor {

	public static void main(String[] args) {

		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//DESAFIO � FAZER O LA�O FOR SEM UTILIZAR N�MROS
		
		for (String j = "#"; !j.equals("######"); j += "#" ) {
			System.out.println(j);
		}
		
		
	}

}
