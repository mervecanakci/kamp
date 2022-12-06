package Adapters;

import java.time.ZoneId;
import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	/* Mernis servisini eklemek için
    New>Other>Web Service >Web Service Client kýsmýndan
    Browse kýsmýna https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?wsdl yazýyoruz.
	 */
	
	
	
	
	
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();  
		boolean serviceResult=false;
	
	serviceResult= proxy.TCKimlikNoDogrula(Long.parseLong(customer.NationalityId),
			//customer.getNationalityId(), 
			customer.getFirstName(), 
			customer.getLastName(),
			customer.getDateOfBirtday());
	
	return serviceResult;
}
	
	
	}
	

	
	
	
	
	
	
	
	
	
	
	

