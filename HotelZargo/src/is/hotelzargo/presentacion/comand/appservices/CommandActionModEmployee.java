package is.hotelzargo.presentacion.comand.appservices;

import is.hotelzargo.negocio.BusinessFactory;
import is.hotelzargo.negocio.Facade;
import is.hotelzargo.negocio.exception.EmployeeAppServicesException;
import is.hotelzargo.presentacion.comand.Command;

public class CommandActionModEmployee implements Command {

	private String id;
	
	public CommandActionModEmployee(String id){
		this.id = id;
	}
	
	@Override
	public void execute() {
		
		Facade facade = BusinessFactory.getInstance().getFacade();
		
		try {
			facade.modEmployee(this.id);
		} catch (EmployeeAppServicesException e) {
			e.printStackTrace();
		}
	}

}
