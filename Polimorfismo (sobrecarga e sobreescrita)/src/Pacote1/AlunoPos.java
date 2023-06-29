package Pacote1;

public class AlunoPos extends Aluno {

	private String primeiraGraduacao;

	public AlunoPos(String nome, String CPF, int rA, String primeiraGraduacao) 
	{
		super(nome, CPF, rA);
		this.primeiraGraduacao = primeiraGraduacao;
	}
	
}
