package Questão_1;

public class CarroPasseio extends Veiculo {

	private String Cor;
	private String Modelo;
	
	public CarroPasseio() 
	{
		
	}
	
	public CarroPasseio( String Cor, String Modelo, int Peso, 
			int VelocMax, Motor Motor, float Preco ) 
	{
		super( Peso, VelocMax, Motor, Preco );
		this.Cor = Cor;
		this.Modelo = Modelo;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	@Override
	public String toString() {
		return "CarroPasseio [Cor=" + Cor + ", Modelo=" + Modelo + "]";
	}
}
