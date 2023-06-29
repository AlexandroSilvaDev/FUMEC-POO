package classes;

// Classe que herda caracteristicas e comportamentos da classe Pessoa.

public class Funcionario extends Pessoa {
	/*
		Metodo construtor para inicializar os atributos da classe mae (superclasse)
		com os valores recebidos ao instanciar um objeto desta classe.
	*/
	public Funcionario( String nome, float altura, int dia, int mes, int ano ) 
	{
		super(nome, altura, dia, mes, ano);
	}
	/*
		Metodo construtor para inicializar os atributos da classe mae (superclasse)
		com os valores recebidos ao instanciar um objeto desta classe. Somente os 
		necessarios.
	*/
	public Funcionario( String nome, int dia, int mes, int ano ) 
	{
		super(nome, dia, mes, ano);
	}
	
	// Metodo para calcular e retornar a idade da pessoa.
	
	public int calcularIdade()
	{
		return 2022 - getAno();
	}
	/* 
		Sobreescrita do metodo toString da classe Pessoa (que sobreescreve o metodo toString da classe Object) 
		para uma exibicao correta das informacoes do objeto instanciado desta classe. 
	*/
	@Override
	public String toString()
	{
		return  "----- Dados do funcionario -----" + "\n" +
				"Nome: " + getNome() + "\nAltura: " + getAltura() + 
				"\nData de nascimento: " + getDia() + "/" + getMes() + "/"
				+ getAno() + "\n";
	}
}
