package classes;

import java.util.ArrayList;
import interfaces.Pedido;

public abstract class Itens implements Pedido {

	private float preco;
	private int quantidade;
	private float peso;
	private Data dataValidade;
	private float valorPedido;
	private String nomeCliente;
	private String nomeProduto;
	private int contObjetos;

	public Itens( float preco, int quantidade, int dia,
				int mes, int ano, String nome, 
				String nomeProduto, int contObjetos )
	{
		this.preco = preco;
		this.quantidade += quantidade;
		dataValidade = new Data(dia, mes, ano);
		valorPedido += valorPedido();
		nomeCliente = nomeCliente(nome);
		this.nomeProduto = nomeProduto;
		this.contObjetos = contObjetos;
	}
	
	public void pedido()
	{
		String vetor[] = new String[contObjetos];
		
		System.out.println("\n        PEDIDO        \n" +
						   "----------------------\n" +  
						   "Nome do cliente: " + nomeCliente +
						   "\nNome dos itens consumidos: ");
		itensConsumidos(vetor);
		System.out.println("Taxa de serviço: " + taxaServico());
	}
	
	public void notaFiscal()
	{
		System.out.println("\n      NOTA FISCAL      ");	
		pedido();
		System.out.println("\nQuantidade de itens consumidos: "+ quantidade +
						   "\nValor pedido: " + valorTotal() + "\n");
	}
	
	public void troco( float pagamento )
	{
		float troco = pagamento - valorTotal();
		System.out.println("Troco: " + troco);
	}
	
	private float valorPedido()
	{
		return preco * quantidade;
	}
	
	public float valorTotal()
	{
		return valorPedido() + taxaServico();
	}
	
	public String nomeCliente( String nome )
	{
		return nome;
	}
	
	public void itensConsumidos( String vetor[] )
	{
		String imagem = "";
		
		for ( int i = 0 ; i < contObjetos ; i++ )
		{
			vetor[i] = nomeProduto;
			imagem += "\n" + (i + 1) + " - " + vetor[i] + " | Qtde: " + quantidade + "\n";
		}
		System.out.println(imagem);
	}

	public float taxaServico()
	{
		return valorPedido() * 0.10f;
	}
	
	public int getContObjetos() {
		return contObjetos;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public float getPeso() {
		return peso;
	}

	public Data getDataValidade() {
		return dataValidade;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setDataValidade(Data dataValidade) {
		this.dataValidade = dataValidade;
	}
}
