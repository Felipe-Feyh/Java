package fundamentos;

public class ConversaoTipoPrimitivo {

	public static void main(String[] args) {
		
		double a = 1.12345444444444444444444444444444444; //impl�cita
		System.out.println(a);
		
		float b = (float) 1.12345444444444444444444444444444444; //expl�cita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte)c; //expl�cita (CAST)
		System.out.println(d);

		double e = 1.999999;
		int f = (int) e; //expl�cita (CAST)
		System.out.println(f);
	}

}
