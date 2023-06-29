package Questão_1;

public class Veiculo {

	private int Peso;
	private int VelocMax;
	private Motor Motor;
	private float Preco;
	
	public Veiculo() 
	{
		setPeso(Peso);
		setVelocMax(VelocMax);
		setMotor(Motor);
		setPreco(Preco);
	}
	
	public Veiculo( int Peso, int VelocMax, Motor Motor, float Preco )
	{
		this.Peso = Peso;
		this.VelocMax = VelocMax;
		this.Motor = Motor;
		this.Preco = Preco;
	}

	public int getPeso() {
		return Peso;
	}

	public void setPeso(int peso) {
		Peso = peso;
	}

	public int getVelocMax() {
		return VelocMax;
	}

	public void setVelocMax(int velocMax) {
		VelocMax = velocMax;
	}

	public Motor getMotor() {
		return Motor;
	}

	public void setMotor(Motor motor) {
		Motor = motor;
	}

	public float getPreco() {
		return Preco;
	}

	public void setPreco(float preco) {
		Preco = preco;
	}

	@Override
	public String toString() {
		return "Veiculo [Peso=" + Peso + ", VelocMax=" + VelocMax + ", Motor=" + Motor + ", Preco=" + Preco + "]";
	}
}
