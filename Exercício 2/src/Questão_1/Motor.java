package Questão_1;

public class Motor {
	
	private int NumCilindro;
	private int Potencia;
	
	public Motor() 
	{
		setNumCilindro(NumCilindro);
		setPotencia(Potencia);
	}
	
	public Motor( int NumCilindro, int Potencia )
	{
		this.NumCilindro = NumCilindro;
		this.Potencia = Potencia;
	}

	public int getNumCilindro() {
		return NumCilindro;
	}

	public void setNumCilindro(int numCilindro) {
		NumCilindro = numCilindro;
	}

	public int getPotencia() {
		return Potencia;
	}

	public void setPotencia(int potencia) {
		Potencia = potencia;
	}
	
	@Override
	public String toString() {
		return "Motor [NumCilindro=" + NumCilindro + ", Potencia=" + Potencia + "]";
	}
	
	
}
