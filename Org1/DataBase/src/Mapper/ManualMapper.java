package Mapper;

import java.util.ArrayList;

import Model.Cliente;
import Model.Produto;
import Model.Usuario;
import ValueObject.ClienteVO;
import ValueObject.ProdutoVO;
import ValueObject.UsuarioVO;

public class ManualMapper {
	public static Produto toProduto(ProdutoVO produtoVO) {
		return new Produto(produtoVO.getId(), produtoVO.getDescricao(), produtoVO.getPreco());
	}
	
	public static ProdutoVO toProdutoVO(Produto produto) {
		return new ProdutoVO(produto.getId(), produto.getDescricao(), produto.getPreco());
	}
	
	public static ArrayList<ProdutoVO> toProdutoVO(ArrayList<Produto> produtos) {
		ArrayList<ProdutoVO> produtoVO = new ArrayList<ProdutoVO>();
		for(Produto produto : produtos) {
			produtoVO.add(toProdutoVO(produto));
		}
		return produtoVO;
	}
	
	
	
	public static Cliente toCliente(ClienteVO clienteVO) {
		return new Cliente(clienteVO.getId(), clienteVO.getNome(), clienteVO.getDataNascimento());
	}	
	
	public static ClienteVO toClienteVO(Cliente cliente) {
		return new ClienteVO(cliente.getId(), cliente.getNome(), cliente.getDataNascimento(), 0);
	}
	
	public static ArrayList<ClienteVO> toClienteVO(ArrayList<Cliente> clientes) {
		ArrayList<ClienteVO> clienteVO = new ArrayList<ClienteVO>();
		for(Cliente cliente : clientes) {
			clienteVO.add(toClienteVO(cliente));
		}
		return clienteVO;
	}
	
}
