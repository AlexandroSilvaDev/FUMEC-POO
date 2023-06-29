package classes;

public class Pessoa {

	private String nome;
	private float altura;
	private int dia;
	private int mes;
	private int ano;
	
	public Pessoa( String nome, float altura, int dia,
				  int mes, int ano )
	{
		this.nome = nome;
		this.altura = altura;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int calcularIdade()
	{
		return 2022 - ano;
	}
	
	@Override
	public String toString()
	{
		return "Nome: " + nome + "\nAltura: " + altura + 
				"\nData de nascimento: " + dia + "/" + mes + "/"
				+ ano + "\n";
	}

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
