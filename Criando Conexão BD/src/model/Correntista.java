package model;

public class Correntista {

	private String id;
	private String numCPF;
	private String nome;
	
	public Correntista(String id, String numCPF, String nome) 
	{
		super();
		this.id = id;
		this.numCPF = numCPF;
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumCPF() {
		return numCPF;
	}

	public void setNumCPF(String numCPF) {
		this.numCPF = numCPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
