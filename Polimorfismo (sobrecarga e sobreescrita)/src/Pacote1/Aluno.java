package Pacote1;

public class Aluno extends Pessoa {

	private int RA;

	public Aluno(String nome, String CPF, int RA) 
	{
		super(nome, CPF);
		this.RA = RA;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "  " + RA;
	}

}
