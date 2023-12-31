package Model;

import java.sql.Date;

public class Cliente {
	private int id;
	private String nome;
	private Date dataNascimento;
	
	public Cliente(int id, String nome, Date dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
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

	@Override 
	public String toString() {
		return "ID: "  + id + " Nome: " + nome + " Data de Nascimento: " + dataNascimento;
	}
}
