package Zoo;

public class Arara extends Animal {

	private String corPredominante;

	public Arara(int numDePatas, String nome, String corPredominante) 
	{
		super(numDePatas, nome);
		this.corPredominante = corPredominante;
	}

	public String getCorPredominante() {
		return corPredominante;
	}

	public void setCorPredominante(String corPredominante) {
		this.corPredominante = corPredominante;
	}
	
}
