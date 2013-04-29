package is.hotelzargo.negocio.appservices;

import is.hotelzargo.negocio.exception.BookAppServicesException;
import is.hotelzargo.negocio.transfer.BookTransfer;

public class BookAppServicesImp implements BookAppServices {

	@Override
	public void addBook(BookTransfer t) throws BookAppServicesException {
		// TODO crear reserva
		
	}

	@Override
	public void delBook(String id) throws BookAppServicesException {
		// TODO borrar reserva
		
	}

	@Override
	public void listBook() throws BookAppServicesException {
		// TODO listar reservas
		
	}

	@Override
	public void modBook(BookTransfer t) throws BookAppServicesException {
		// TODO modificar reservas
		
	}

	@Override
	public void findBook(String id) throws BookAppServicesException {
		// TODO buscar reservas
		
	}

	@Override
	public void confirmBook(String id) throws BookAppServicesException {
		// TODO confirmar reserva
		
	}

}
