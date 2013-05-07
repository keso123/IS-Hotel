package is.hotelzargo.integracion.dao;

import java.util.Vector;

import is.hotelzargo.integracion.exception.ShiftIntegrationException;
import is.hotelzargo.negocio.transfer.ServiceTransfer;
import is.hotelzargo.negocio.transfer.ShiftTransfer;

public interface ShiftDAO {

	public void createShift(ShiftTransfer t) throws ShiftIntegrationException;
	
	public void deleteShift(int id) throws ShiftIntegrationException;
	
	public ShiftTransfer getShift(int id) throws ShiftIntegrationException;
	
	public Vector<ShiftTransfer> listShift() throws ShiftIntegrationException;
	
	public void updateShift(ServiceTransfer t) throws ShiftIntegrationException;
}
