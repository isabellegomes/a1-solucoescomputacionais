package a1_soluçõescomputacionais;

public class Aluno {
	private String nome;
	private double primeiraNota, segundaNota, media;
	int matricula;

	public Aluno(String nome, int matricula, double primeiraNota, double segundaNota) {
		this.nome = nome;
		this.matricula = matricula;
		this.primeiraNota = primeiraNota;
		this.segundaNota = segundaNota;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getprimeiraNota() {
		return primeiraNota;
	}

	public void setprimeiraNota(double primeiraNota) {
		this.primeiraNota = primeiraNota;
	}

	public double getsegundaNota() {
		return segundaNota;
	}

	public void setsegundaNota(double segundaNota) {
		this.segundaNota = segundaNota;
	}

	public double getmedia() {
		this.media = ((this.primeiraNota+this.segundaNota)/2); 
		return this.media;
	}


	public String toString() {
		return "Aluno: " + this.nome + " \nMatricula: " + this.matricula + " \n1º Nota: " + this.primeiraNota + " \n2º Nota: " + this.segundaNota + " \nMédia do aluno: " + this.media+"\n";

	}
}
