package Pacote1;

public class AlunoGraduacao extends Aluno {

	private String curso;

	public AlunoGraduacao(String nome, String CPF, int RA, String curso) 
	{
		super(nome, CPF, RA);
		this.curso = curso;
	}
	
	
}
