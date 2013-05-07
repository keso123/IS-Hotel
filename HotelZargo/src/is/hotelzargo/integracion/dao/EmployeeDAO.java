package is.hotelzargo.integracion.dao;

import java.util.Vector;

import is.hotelzargo.integracion.exception.EmployeeIntegrationException;
import is.hotelzargo.negocio.transfer.EmployeeTransfer;

public interface EmployeeDAO {
	
	public void createEmployee(EmployeeTransfer t) throws EmployeeIntegrationException;
	
	public void deleteEmployee(int id) throws EmployeeIntegrationException;
	
	public EmployeeTransfer getEmployee(int id) throws EmployeeIntegrationException;
	
	public Vector<EmployeeTransfer> listEmployee() throws EmployeeIntegrationException;
	
	public void updateEmployee(int id) throws EmployeeIntegrationException;

}
