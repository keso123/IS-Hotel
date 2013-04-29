package is.hotelzargo.presentacion.comand.appservices;

import is.hotelzargo.negocio.BusinessFactory;
import is.hotelzargo.negocio.Facade;
import is.hotelzargo.negocio.exception.ShiftAppServicesException;
import is.hotelzargo.presentacion.comand.Command;

public class CommandActionModShift implements Command {

	private String id;
	
	public CommandActionModShift(String id){
		this.id = id;
	}
	
	@Override
	public void execute() {
		
		Facade facade = BusinessFactory.getInstance().getFacade();
		
		try {
			facade.modShift(this.id);
		} catch (ShiftAppServicesException e) {
			e.printStackTrace();
		}
	}

}
