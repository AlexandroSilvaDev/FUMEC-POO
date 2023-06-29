package ValueObject;

import java.sql.Date;

public class ClienteVO {
	private int id;
	private String nome;
	private Date dataNascimento;
	private int idade;
	
	public ClienteVO(int id, String nome, Date dataNascimento, int idade) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override 
	public String toString() {
		return "ID: "  + id + " Nome: " + nome + " Data de Nascimento: " + dataNascimento;
	}
}
