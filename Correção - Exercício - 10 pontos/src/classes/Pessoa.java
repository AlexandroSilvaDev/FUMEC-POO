package classes;

public class Pessoa {
	private String nome;
	private Data dataNascimento;
	private double altura;
	
	
	
	public Pessoa(String nome, Data dataNascimento, double altura) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Data getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getIdade() {
		return 2022 - dataNascimento.getAno();
	}
	
	@Override
	public String toString() {
		return nome + " - " + dataNascimento;
	}
	
	
}
