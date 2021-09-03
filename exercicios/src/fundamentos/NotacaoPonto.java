package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bom dia X";
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("X", "Senhora");
		System.out.println("replace: " + s);
		
		s = s.concat(" concatenado");
		System.out.println(s);
		
		System.out.println("Tamanho: " + s.length());
		
		//Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
	}

}
