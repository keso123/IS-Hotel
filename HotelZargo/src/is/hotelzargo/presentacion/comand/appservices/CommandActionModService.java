package is.hotelzargo.presentacion.comand.appservices;

import is.hotelzargo.negocio.BusinessFactory;
import is.hotelzargo.negocio.Facade;
import is.hotelzargo.negocio.exception.ServicesAppServicesException;
import is.hotelzargo.presentacion.comand.Command;

public class CommandActionModService implements Command {

	private String id;
	
	public CommandActionModService(String id){
		this.id = id;
	}
	
	@Override
	public void execute() {
		
		Facade facade = BusinessFactory.getInstance().getFacade();
		
		try {
			facade.modService(this.id);
		} catch (ServicesAppServicesException e) {
			e.printStackTrace();
		}
	}

}
