package App;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Business.Encoding;
import Business.ProdutoBusiness;
import Configuration.ConnectionFUMEC;
import DataAccessObject.ClienteDAO;
import DataAccessObject.ProdutoDAO;
import DataAccessObject.UsuarioDAO;
import Model.Cliente;
import Model.Produto;
import Model.Usuario;
import ValueObject.ProdutoVO;

public class Main {

	public static void main(String[] args) {

		
		var database = new ConnectionFUMEC
		(
				"jdbc:postgresql://", //dataBasePrefix
				"database-2.cve6uuolgoty.us-east-1.rds.amazonaws.com",  	  //hostName
				"postgres",			  //userName 
				"postgres", 		  //password
				"", //jdbcDrive
				"banco", 			//database
				"5432"					//port
		);
		
		try {
			Connection connection = database.open();
			
			Scanner ler = new Scanner(System.in);
			String user, senha;
			
			
			/*
			//System.out.println(Encoding.md5("Rafaela"));
			var usuarioDAO = new UsuarioDAO(connection);
			//System.out.println(usuarioDAO.getAll());
			
			Usuario usuario = null;
			do {
				System.out.println("Informe o usuário: ");
				user = ler.nextLine();
				System.out.println("Informe a senha: ");
				senha = ler.nextLine();
				usuario = usuarioDAO.findByLoginAndPass(user, Encoding.md5(senha));
				
				if(usuario == null) {
					System.out.println("Usuário incorreto. Tente novamente!");
				} else {
					System.out.println("Bem-vindo " + user);
				}
			} while(usuario == null);
			*/
			var produtoDAO = new ProdutoDAO(connection);
			
			ProdutoBusiness p = new ProdutoBusiness(produtoDAO);
			System.out.println(p.getAll());

			ProdutoVO produtoVO = new ProdutoVO(252525, "Alexandro", 1234);
			//p.save(produtoVO);
			
			ArrayList<ProdutoVO> resultado = p.getAll();
			
			for ( ProdutoVO rs : resultado )
			{
				System.out.println(rs.getId() + " " + rs.getDescricao());
			}
			
			ProdutoVO resposta = p.findById(252525);
			System.out.println("\n" + resposta.getId() + " " + resposta.getDescricao());
			
//			ArrayList<Produto> produtos = produtoDAO.getAll();
//			var produto = new Produto(100000, "Coca-Cola", 10000);
//			produtoDAO.delete(produto);
//			produtoDAO.save(produto);
//			
//			System.out.println(produtoDAO.findById(produto.getId()));
//			produtoDAO.delete(produto);
//			
//			
//			var clienteDAO = new ClienteDAO(connection);
//			System.out.println(clienteDAO.getAll());
//			
//			var cliente = new Cliente(3, "Rafaela", new Date(1997, 6, 18));
//			clienteDAO.save(cliente);
//			System.out.println(clienteDAO.getAll());
			
			
			database.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
