package Business;

import java.sql.SQLException;
import java.util.ArrayList;

import Business.Base.BaseBusiness;
import Business.Base.Business;
import DataAccessObject.ProdutoDAO;
import DataAccessObject.Base.DAO;
import Mapper.ManualMapper;
import Model.Produto;
import ValueObject.ProdutoVO;

public class ProdutoBusiness extends BaseBusiness<ProdutoVO>{

	
	public ProdutoBusiness(DAO dao) {
		super(dao);
	}
	
	@Override
	public ArrayList<ProdutoVO> getAll() throws SQLException {
		
		ArrayList<Produto> produtos = dao.getAll();
		ArrayList<ProdutoVO> produtosVO = ManualMapper.toProdutoVO(produtos);
		
		return produtosVO;
		
	}

	@Override
	public void save(ProdutoVO produto) throws SQLException{
		if(produto != null && produto.getId() != 0 && !produto.getDescricao().isEmpty() && dao.findById(produto.getId())==null) {
			dao.save(ManualMapper.toProduto(produto));
		}else {
			throw new SQLException("Não foi possível salvar os dados");
		}
	}

	@Override
	public void update(ProdutoVO produto) throws SQLException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ProdutoVO produto) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProdutoVO findById(int id) throws SQLException {
		Produto produto = (Produto) dao.findById(id);
		return ManualMapper.toProdutoVO(produto);
	}
	
	

}
