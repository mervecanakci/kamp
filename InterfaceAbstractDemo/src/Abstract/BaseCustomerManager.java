package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
// implemmente ettim void save i getirdi.
	@Override
	public void Save(Customer customer) {
		
		
		System.out.println("veri taban�na kaydedildi: " + customer.getFirstName());
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
}
