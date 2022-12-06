  
import java.util.Date;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
 BaseCustomerManager customerManager=new  StarbucksCustomerManager(new MernisServiceAdapter());
	// base de abstract class olduðu için devamý basecustomermanager deðil.
	
 Customer customer = new Customer();
    customer.setId(2) ;
	customer.setFirstName( "Merve");
	customer.setFirstName("Çanakcý")  ;
	customer.setDateOfBirtday("2000")  ;
	
	customer.setNationalityId(" ")  ;
	
     customerManager.Save(customer); 
}

 
 
 
// customerManager.Save(new Customer(1, "MERVE","ÇANAKCI","2000", );
	

	// BaseCustomerManager customerManager=new  SturbucksCustomerManager();
	
	
	
	
	
	}


