package is.hotelzargo.negocio;

import is.hotelzargo.negocio.appservices.ClientAppServices;
import is.hotelzargo.negocio.appservices.ClientAppServicesImp;

public class BusinessFactoryImp extends BusinessFactory {

	@Override
	public ClientAppServices getClientAS() {
		return new ClientAppServicesImp();
	}

	@Override
	public Facade getFacade() {
		return new FacadeImp();
	}

	
}
