package classe;

public class DataTeste {

	public static void main(String [] args) {
		
		Data d1 = new Data();
		d1.ano = 2021;
		
		Data d2 = new Data(29,07,2021);

		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		 
	}

}
