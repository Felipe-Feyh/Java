package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		//quantos alunos
		//quantas notas cada aluno tem
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por aluno? ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		double  total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {				
				
				System.out.printf("Informa a nota %d do aluno %d: "
						, n + 1, a +1); //arruma o �ndice -- ao inv�s de informe a nota do aluno 0...
				
				notasDaTurma[a][n] = entrada.nextDouble();			
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("\nM�dia da turma � "+media);
		
		for(double[] notasDoAluno: notasDaTurma) {
			
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		
		entrada.close();
		

	}

}
