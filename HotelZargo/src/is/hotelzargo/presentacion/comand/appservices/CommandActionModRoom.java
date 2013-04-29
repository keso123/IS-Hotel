package is.hotelzargo.presentacion.comand.appservices;

import is.hotelzargo.negocio.BusinessFactory;
import is.hotelzargo.negocio.Facade;
import is.hotelzargo.negocio.exception.RoomAppServicesException;
import is.hotelzargo.presentacion.comand.Command;

public class CommandActionModRoom implements Command {

	private String id;
	
	public CommandActionModRoom(String id){
		this.id = id;
	}
	
	@Override
	public void execute() {
		
		Facade facade = BusinessFactory.getInstance().getFacade();
		
		try {
			facade.modRoom(this.id);
		} catch (RoomAppServicesException e) {
			e.printStackTrace();
		}
	}

}
