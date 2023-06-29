package Business.Base;

import DataAccessObject.Base.BaseDAO;
import DataAccessObject.Base.DAO;

public abstract class BaseBusiness<T> implements Business<T>{
	protected DAO dao;
	
	public BaseBusiness (DAO dao) {
		this.dao = dao;
	}
}
