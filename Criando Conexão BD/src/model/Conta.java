package model;

public class Conta {

	private String id;
	private String numConta;
	private double valorSaldo;
	
	public Conta(String id, String numConta, double valorSaldo) 
	{
		super();
		this.id = id;
		this.numConta = numConta;
		this.valorSaldo = valorSaldo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getValorSaldo() {
		return valorSaldo;
	}

	public void setValorSaldo(double valorSaldo) {
		this.valorSaldo = valorSaldo;
	}
}
