package is.hotelzargo.integracion;

import is.hotelzargo.integracion.dao.ClientDAO;
import is.hotelzargo.integracion.dao.ClientDAOImp;

public class DAOFactoryImp extends DAOFactory {

	public DAOFactoryImp() {
		//TODO Gorka: crear/inicializar MySQL
	}

	@Override
	public ClientDAO getClientDAO() {
		return new ClientDAOImp();
	}
}
