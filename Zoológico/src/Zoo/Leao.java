package Zoo;

public class Leao extends Animal {

	private float tamanhoDaJuba;

	public Leao(int numDePatas, String nome, float tamanhoDaJuba) 
	{
		super(numDePatas, nome);
		this.tamanhoDaJuba = tamanhoDaJuba;
	}

	public float getTamanhoDaJuba() {
		return tamanhoDaJuba;
	}

	public void setTamanhoDaJuba(float tamanhoDaJuba) {
		this.tamanhoDaJuba = tamanhoDaJuba;
	}
	
}
