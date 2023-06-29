package Zoo;

public class Onca extends Animal {

	private String regiao;

	public Onca(int numDePatas, String nome, String regiao) {
		super(numDePatas, nome);
		this.regiao = regiao;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
}
