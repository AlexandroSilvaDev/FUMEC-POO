package classes;

import interfaces.InterfacePessoa;
/*
	Classe abstrata (nao pode ser instanciada) que implementa 
	a interface chamada InterfacePessoa. Por ser abstrata, ela
	pode ou nao implementar os metodos da interface, mas caso nao
	implemente, essa responsabilidade eh passada para a classe filha
	(classe que herda desta classe).
*/
public abstract class Pessoa implements InterfacePessoa {
	/*
		Atributos abstraidos para que a classe Pessoa represente uma 
		pessoa real, no meio computacional.
	*/
	private String nome;
	private float altura;
	private int dia;
	private int mes;
	private int ano;
	
	// Metodo construtor para inicializar os atributos da classe
	
	public Pessoa( String nome, float altura, int dia, int mes, int ano )
	{
		this.nome = nome;
		this.altura = altura;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	/*
		Sobrecarga do metodo construtor com o intuito de inicializar 
		somente atributos realmente necessarios, caso haja essa necessidade.
	*/
	public Pessoa( String nome, int dia, int mes, int ano )
	{
		this.nome = nome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	/* 
		Sobreescrita do metodo toString da classe Object para uma exibicao
		correta das informacoes do objeto instanciado desta classe.
	*/
	@Override
	public String toString()
	{
		return "Nome: " + nome + "\nAltura: " + altura + 
				"\nData de nascimento: " + dia + "/" + mes + "/"
				+ ano + "\n";
	}
	/*
		Metodos getters e setters resposaveis por dar acesso ao valor dos
		atributos privados (private) desta classe com o intuito de utilizar 
		os valores, ou responsaveis por dar a opcao de setar um valor dentro
		desses mesmos atributos.
	*/
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
