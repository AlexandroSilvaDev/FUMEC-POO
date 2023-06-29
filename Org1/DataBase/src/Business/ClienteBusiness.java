package Business;

import java.sql.SQLException;
import java.util.ArrayList;

import Business.Base.BaseBusiness;
import DataAccessObject.Base.DAO;
import Mapper.ManualMapper;
import Model.Cliente;
import Model.Produto;
import ValueObject.ClienteVO;
import ValueObject.ProdutoVO;

public class ClienteBusiness extends BaseBusiness<ClienteVO>{

	public ClienteBusiness(DAO dao) {
		super(dao);
	}

	@Override
	public ClienteVO findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ClienteVO> getAll() throws SQLException {
		ArrayList<Cliente> clientes = dao.getAll();
		ArrayList<ClienteVO> clientesVO = ManualMapper.toClienteVO(clientes);
		
		return clientesVO;
	}

	@Override
	public void save(ClienteVO cliente) throws SQLException {
		if(cliente != null && cliente.getId() != 0 && !cliente.getNome().isEmpty() && dao.findById(cliente.getId())==null) {
			dao.save(ManualMapper.toCliente(cliente));
		}else {
			throw new SQLException("Não foi possível salvar os dados");
		}
		
	}

	@Override
	public void update(ClienteVO t) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ClienteVO t) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
