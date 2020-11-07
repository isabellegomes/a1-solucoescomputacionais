package a1_soluçõescomputacionais;

import java.util.Scanner;

public class TurmaTeste {
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			Turma turma = new Turma();

			System.out.println("Digite o nome da turma: ");
			turma.setnome(sc.next());
			System.out.println("Digite a quantidade de alunos matriculados: ");
			turma.setAlunos(sc.nextInt());

			for(int i=0; i<turma.getAlunos(); i++){
				System.out.println("Digite o Nome do aluno: ");
				String nome=sc.next();

				System.out.println("Digite a Matricula do aluno: ");
				int matricula=sc.nextInt();

				System.out.println("Digite a Primeira Nota do aluno: ");
				double primeiraNota=sc.nextDouble();

				System.out.println("Digite a Segunda Nota do aluno: ");
				double segundaNota=sc.nextDouble();

				turma.cadastrarAluno(nome, matricula, primeiraNota, segundaNota, i);
			}

			for(int i=0; i<turma.getAlunos(); i++){
				turma.verificarQtdAprovadoReprovado(i);
			}

			System.out.println(turma.toString());
		}
	}
}