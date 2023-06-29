package Zoo;

public abstract class Animal {
	
	/*
		Uma interface é uma classe abstrata (não pode ser instanciada) 
		criada com o intuito de armazenar atributos e comportamentos 
		que serão necessários para serem utilizados em um conjunto de 
		classes onde, essas classes irão representar abstrações que 
		herdam características e comportamentos desta classe abstrata.
	 */
	
	private int numDePatas;
	private String nome;
	
	public Animal(int numDePatas, String nome) 
	{
		super();
		this.numDePatas = numDePatas;
		this.nome = nome;
	}

	public int getNumDePatas() {
		return numDePatas;
	}

	public void setNumDePatas(int numDePatas) {
		this.numDePatas = numDePatas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
