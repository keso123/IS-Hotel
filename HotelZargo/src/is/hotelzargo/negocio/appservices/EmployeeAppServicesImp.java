package is.hotelzargo.negocio.appservices;

import is.hotelzargo.negocio.exception.EmployeeAppServicesException;
import is.hotelzargo.negocio.transfer.EmployeeTransfer;

public class EmployeeAppServicesImp implements EmployeeAppServices {

	@Override
	public void addEmployee(EmployeeTransfer t)
			throws EmployeeAppServicesException {
		// TODO crear empleado ojo con los tipos
		
	}

	@Override
	public void delEmployee(String id) throws EmployeeAppServicesException {
		// TODO borrar empleado
		
	}

	@Override
	public void listEmployee() throws EmployeeAppServicesException {
		// TODO listar empleados
		
	}

	@Override
	public void modEmployee(EmployeeTransfer t)
			throws EmployeeAppServicesException {
		// TODO modificar empleado
		
	}

}
