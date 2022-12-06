package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerService {
	
    private ICustomerCheckService customerCheckService;
	// implement ettik
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		//doğrulanmaya ihtiyacı var bu nedenle save kullanıyor.
		
		if( customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
			//kosul saglanýrsa baseCustomManager'daki save metodu calisir
		}
		
		else {
			System.out.println("not a valid person");
		}
	
	}

	//42.24
	

	
	
	
	
	
	
	
	
	
	
	
}
