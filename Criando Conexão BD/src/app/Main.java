package app;

import business.ContaBusiness;
import dataAccessObject.ContaDAO;
import dataAccessObject.ContaFakeDAO;
import interfaces.DAO;
import model.Conta;

public class Main {

	public static void main(String[] args) {

		DAO<Conta> dao;
		
		dao = new ContaDAO();
		
		ContaBusiness contaBusiness = new ContaBusiness(dao);
		
		Conta conta = new Conta("1", "1252525", 500);
		Conta conta2 = new Conta("2", "9696968", 1500);
		
		if ( contaBusiness.create(conta) )
		{
			System.out.println("\nConta criada com sucesso!");
		}
		else {
			System.out.println("\nNão foi possível criar a conta!");
		}
		
		contaBusiness.create(conta2);
		System.out.println(contaBusiness.showAllContas());
	}

}
