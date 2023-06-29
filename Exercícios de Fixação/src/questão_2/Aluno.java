package questão_2;

public class Aluno {

	private String matricula;
	private String nome;
	private float prova1;
	private float prova2;
	private float trabalho;
	
	public Aluno( String matricula, String nome, float prova1,
				float prova2, float trabalho )
	{
		this.matricula = matricula;
		this.nome = nome;
		this.prova1 = prova1;
		this.prova2 = prova2;
		this.trabalho = trabalho;
	}
	
	public float media()
	{
		return (( this.prova1 * 2.5f ) + ( this.prova2 * 2.5f ) +
				( this.trabalho * 2 )) / 7;
	}
	
	public float especial()
	{
		float media = media();
		
		if ( media < 60 )
		{
			return 60 - media;
		}
		else {
			return 0;
		}
	}
}
