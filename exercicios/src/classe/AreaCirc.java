package classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.14;
	
	AreaCirc(double raioInicial) {
		//pi = 3.14;
		raio = raioInicial;
	}
	
	double area() {
		return PI * raio * raio;
	}
}
