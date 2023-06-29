package questao_5;

public class ContaCorrente {

	private float limite;
	private float saldo;
	private float valorLimite;
	
	public ContaCorrente( float limite, float saldo, float valorLimite )
	{
		this.limite = limite;
		this.saldo = saldo;
		this.valorLimite = valorLimite;
	}
	
	public void sacar( float valor )
	{
		if ( getSaldo() >= valor )
		{
			saldo -= valor;
		}
		else {
			throw new IllegalArgumentException("Não é possível sacar valor maior que o saldo existente");
		}
	}

	public void depositar( float valor )
	{
		if ( valor > 0 )
		{
			saldo += valor;
		}
		else {
			throw new IllegalArgumentException("Não é possível depositar valor não positivo");
		}
	}
	
	public void setValorLimite( float valor )
	{
		if ( valor > 0 )
		{
			this.valorLimite = valor;
		}
		else {
			throw new IllegalArgumentException("Não é possível setar valorLimite não positivo");
		}
	}
	
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getValorLimite() {
		return valorLimite;
	}
}
