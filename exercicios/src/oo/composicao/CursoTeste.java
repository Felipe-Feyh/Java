package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		Aluno aluno4 = new Aluno("Joana");
		
		Curso curso1 = new Curso("Java completo");
		Curso curso2 = new Curso("Python completo");
		Curso curso3 = new Curso("Web completo");
		
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);

		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno1);
	
		curso3.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculando no curso " + curso3.nome + "...");
			System.out.println("...e o meu nome é " +aluno.nome);
			System.out.println();
		}
		
		//System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java completo");
		
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
