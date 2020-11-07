package a1_soluçõescomputacionais;

import java.util.ArrayList;

public class Turma {
	private String nome;
	private Aluno[] alunos;
	private ArrayList<Aluno> aprovados = new ArrayList<Aluno>();
	private ArrayList<Aluno> reprovados = new ArrayList<Aluno>();

	public void setnome(String nome){
		this.nome = nome;
	}

	public void setAlunos(int qtdAlunos){
		this.alunos = new Aluno[qtdAlunos];
	}

	public String getnome(){
		return this.nome;
	}

	public int getAlunos(){
		return this.alunos.length;
	}

	public void cadastrarAluno(String nome, int matricula, double primeiraNota, double segundaNota, int i){
		this.alunos[i] = new Aluno (nome, matricula, primeiraNota, segundaNota);
	}

	public void verificarQtdAprovadoReprovado(int i){
		if(this.alunos[i].getmedia()>=7){
			aprovados.add(alunos[i]);
		}
		else{
			reprovados.add(alunos[i]);
		}
	}

	public String listarAluno(int i){
		return this.alunos[i].toString();
	}

	public String toString(){
		String msg="\nTurma: "+this.nome+"\nNumero de Alunos: "+getAlunos()+"\nLista de alunos Aprovados:\n";
		for(int i=0; i<aprovados.size(); i++){
			msg+="\n";
			msg+=aprovados.get(i).toString();
		}
		msg+="\n\nLista de alunos Reprovados:\n";
		for(int i=0; i<reprovados.size(); i++){
			msg+="\n";
			msg+=reprovados.get(i).toString();
		}
		return msg;
	}
}
