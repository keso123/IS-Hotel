package is.hotelzargo.negocio.AppServices;

import is.hotelzargo.integracion.DAOFactory;
import is.hotelzargo.integracion.dao.ClientDAO;
import is.hotelzargo.integracion.exception.ClientIntegrationException;
import is.hotelzargo.negocio.exception.ClientAppServiceException;
import is.hotelzargo.negocio.transfer.ClientTransfer;
import is.hotelzargo.negocio.transfer.ClientTransferIndividual;

public class ClientAppServicesImp implements ClientAppServices {

	@Override
	public void addClient(ClientTransfer t) throws ClientAppServiceException {
		
		DAOFactory fac = DAOFactory.getInstance();
		ClientDAO dao = fac.getClientDAO();
		
		if(t instanceof ClientTransferIndividual ) {
			
			checkDataIndividual(t);
			
			try {
				if(!dao.searchIndividual(((ClientTransferIndividual) t).getDNI())){
					dao.createClient(t);
				}else{
					throw new ClientAppServiceException("El usuario ya exite");
				}
			} catch (ClientIntegrationException e) {
				//e.printStackTrace();
				e.getMessage();
			}
		}else {
			checkDataCompany(t);
		}
		//TODO Comprobar que no exista en la BBDD
	}
	
	private void checkDataIndividual(ClientTransfer t) throws ClientAppServiceException {
		
		String DNI = ((ClientTransferIndividual)t).getDNI();
		
		if(((ClientTransferIndividual)t).getName().length() < 3)
			throw new ClientAppServiceException("Nombre no valido");
		if(((ClientTransferIndividual)t).getSurname().length() == 0)
			throw new ClientAppServiceException("Apellido no valido");
		if(DNI.length() != 9)
			throw new ClientAppServiceException("DNI no valido");
		if(!checkNumberDni(DNI))
			throw new ClientAppServiceException("DNI no valido");
		if(((ClientTransferIndividual)t).getPhone().length() == 0)
			throw new ClientAppServiceException("Telefono no valido");
		if(((ClientTransferIndividual)t).getCreditCard().length() == 0)
			throw new ClientAppServiceException("Tarjeta de credito no valida");
		if(((ClientTransferIndividual)t).getAddress().length() == 0)
			throw new ClientAppServiceException("Domicilio no valido");
	}
	
	private boolean checkNumberDni(String DNI) {
		
		for (int i=0 ; i==7 ; i++){
			if (Integer.parseInt(DNI)){}
		}
		return false;
	}

	private void checkDataCompany(ClientTransfer t) throws ClientAppServiceException {
		/*if(t.getName().length() == 0)
			throw new ClientAppServiceException("Nombre no valido");
		if(t.getSurname().length() == 0)
			throw new ClientAppServiceException("Apellido no valido");*/
		//TODO CHECK
	}

	@Override
	public void deleteClient(String id) {
		DAOFactory fac = DAOFactory.getInstance();
		ClientDAO dao = fac.getClientDAO();
		//checkInt(id);
		try {
			dao.deleteClient(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ClientIntegrationException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void listClient() throws ClientAppServiceException {
		DAOFactory fac = DAOFactory.getInstance();
		ClientDAO dao = fac.getClientDAO();
		try {
			dao.listClient();
		} catch (ClientIntegrationException e) {
			e.printStackTrace();
		}
	}

}
