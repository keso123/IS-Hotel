package is.hotelzargo.negocio;

import is.hotelzargo.negocio.appservices.ClientAppServices;
import is.hotelzargo.negocio.exception.BookAppServicesException;
import is.hotelzargo.negocio.exception.ClientAppServicesException;
import is.hotelzargo.negocio.exception.EmployeeAppServicesException;
import is.hotelzargo.negocio.exception.RoomAppServicesException;
import is.hotelzargo.negocio.exception.ServicesAppServicesException;
import is.hotelzargo.negocio.exception.ShiftAppServicesException;
import is.hotelzargo.negocio.transfer.BookTransfer;
import is.hotelzargo.negocio.transfer.ClientTransfer;
import is.hotelzargo.negocio.transfer.EmployeeTransfer;
import is.hotelzargo.negocio.transfer.RoomTransfer;
import is.hotelzargo.negocio.transfer.ServiceTransfer;
import is.hotelzargo.negocio.transfer.ShiftTransfer;

public class FacadeImp implements Facade {

	@Override
	public void addClient(ClientTransfer t)throws ClientAppServicesException {
		BusinessFactory fac = BusinessFactory.getInstance();
		ClientAppServices clientAS = fac.getClientAS();
		clientAS.addClient(t);
	}

	@Override
	public void delClient(String id) throws ClientAppServicesException {
		BusinessFactory fac = BusinessFactory.getInstance();
		ClientAppServices clientAS = fac.getClientAS();
		clientAS.deleteClient(id);
	}

	@Override
	public void listClient() throws ClientAppServicesException {

		BusinessFactory fac = BusinessFactory.getInstance();
		ClientAppServices clientAS = fac.getClientAS();
		clientAS.listClient();
	}

	@Override
	public void modClient(String id) throws ClientAppServicesException {
		
	}

	@Override
	public void addBook(BookTransfer t) throws BookAppServicesException {
		
	}

	@Override
	public void delBook(String id) throws BookAppServicesException {
		
	}

	@Override
	public void listBook() throws BookAppServicesException {
		
	}

	@Override
	public void modBook(String id) throws BookAppServicesException {
		
	}

	@Override
	public void findBook(String id) throws BookAppServicesException {
		
	}

	@Override
	public void confirmBook(String id) throws BookAppServicesException {
		
	}

	@Override
	public void addEmployee(EmployeeTransfer t) throws EmployeeAppServicesException {
		
	}

	@Override
	public void delEmployee(String id) throws EmployeeAppServicesException {
		
	}

	@Override
	public void listEmployee() throws EmployeeAppServicesException {
		
	}

	@Override
	public void modEmployee(String id) throws EmployeeAppServicesException {
		
	}

	@Override
	public void addRoom(RoomTransfer t) throws RoomAppServicesException {
		
	}

	@Override
	public void delRoom(String id) throws RoomAppServicesException {
		
	}

	@Override
	public void listRoom() throws RoomAppServicesException {
		
	}

	@Override
	public void modRoom(String id) throws RoomAppServicesException {
		
	}

	@Override
	public void addService(ServiceTransfer t) throws ServicesAppServicesException {
		
	}

	@Override
	public void delService(String id) throws ServicesAppServicesException {
		
	}

	@Override
	public void listService() throws ServicesAppServicesException {
		
	}

	@Override
	public void modService(String id) throws ServicesAppServicesException {
		
	}

	@Override
	public void addShift(ShiftTransfer t) throws ShiftAppServicesException {
		
	}

	@Override
	public void delShift(String id) throws ShiftAppServicesException {
		
	}

	@Override
	public void listShift() throws ShiftAppServicesException {
		
	}

	@Override
	public void modShift(String id) throws ShiftAppServicesException {
		
	}

}
