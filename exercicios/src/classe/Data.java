package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;

	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		
		//byte, short, int, log -> valor padrão = 0
		//float, double -> valor padrão = 0.0
		//boolean -> false
		//char -> '\u0000'
	}
	
	String obterDataFormatada() {	
		return String.format("%d/%d/%d",dia,mes,ano);		
	}
	
	void imprimirDataFormatada() {
		System.out.printf(obterDataFormatada());	
	}
	
	static void teste() {
		
	}
}
