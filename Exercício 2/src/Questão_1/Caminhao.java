package Questão_1;

public class Caminhao extends Veiculo {

	private int Toneladas;
	private int AlturaMax;
	private int Comprimento;
	
	public Caminhao()
	{
		super();
	}
	
	public Caminhao( int Toneladas, int AlturaMax, int Comprimento, 
			int Peso, int VelocMax, Motor Motor, float Preco )
	{
		super( Peso, VelocMax, Motor, Preco );
		this.Toneladas = Toneladas;
		this.AlturaMax = AlturaMax;
		this.Comprimento = Comprimento;
	}

	public int getToneladas() {
		return Toneladas;
	}

	public void setToneladas(int toneladas) {
		Toneladas = toneladas;
	}

	public int getAlturaMax() {
		return AlturaMax;
	}

	public void setAlturaMax(int alturaMax) {
		AlturaMax = alturaMax;
	}

	public int getComprimento() {
		return Comprimento;
	}

	public void setComprimento(int comprimento) {
		Comprimento = comprimento;
	}

	@Override
	public String toString() {
		return "Caminhao [Toneladas=" + Toneladas + ", AlturaMax=" + AlturaMax + ", Comprimento=" + Comprimento + "]";
	}
}
