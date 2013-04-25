package is.hotelzargo.presentacion.comand;

import is.hotelzargo.negocio.transfer.ClientTransfer;
import is.hotelzargo.negocio.transfer.ShiftTransfer;
import is.hotelzargo.presentacion.comand.appservices.CommandActionAddClient;
import is.hotelzargo.presentacion.comand.appservices.CommandActionAddShift;
import is.hotelzargo.presentacion.comand.appservices.CommandActionDelClient;
import is.hotelzargo.presentacion.comand.appservices.CommandActionListClient;
import is.hotelzargo.presentacion.comand.gui.CommandActionShowBookFrame;
import is.hotelzargo.presentacion.comand.gui.CommandActionShowClientFrame;
import is.hotelzargo.presentacion.comand.gui.CommandActionShowEmployeeFrame;
import is.hotelzargo.presentacion.comand.gui.CommandActionShowRoomFrame;
import is.hotelzargo.presentacion.comand.gui.CommandActionShowServicesFrame;
import is.hotelzargo.presentacion.comand.gui.CommandActionShowShiftFrame;
import is.hotelzargo.presentacion.controller.Event;

public class CommandFactoryImp extends CommandFactory {

	@Override
	public Command createCommand(Event event, Object data) {
		
		switch (event){
		
		case SHOW_CLIENT_FRAME:
			return new CommandActionShowClientFrame((Boolean) data);
			
		case SHOW_ROOM_FRAME:
			return new CommandActionShowRoomFrame((Boolean) data);
		
		case SHOW_EMPLOYEE_FRAME:
			return new CommandActionShowEmployeeFrame((Boolean) data);
			
		case SHOW_BOOK_FRAME:
			return new CommandActionShowBookFrame((Boolean) data);
			
		case SHOW_SERVICES_FRAME:
			return new CommandActionShowServicesFrame((Boolean) data);
		
		case SHOW_SHIFT_FRAME:
			return new CommandActionShowShiftFrame((Boolean) data);
			
		case ADD_CLIENT:
			return new CommandActionAddClient((ClientTransfer) data);
		
		case ADD_SHIFT:
			return new CommandActionAddShift((ShiftTransfer) data);
			
		case DELETE_CLIENT:
			return new CommandActionDelClient((String) data);
			
		case LIST_CLIENT:
			return new CommandActionListClient();
			
		default:
			return null;
		}
	}
	
}
