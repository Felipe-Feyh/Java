package classe;

public class PrimeiroTrauma {

	//para acessar � necess�rio instanciar >> PrimeiroTrauma 
	int a = 3;
	
	// ou tornar a vari�vel est�tica
	static int b = 4;
	
	public static void main(String[] args) {
		
		//instancia
		PrimeiroTrauma p = new PrimeiroTrauma();

		System.out.println(p.a);
		System.out.println(b);

	}

}
