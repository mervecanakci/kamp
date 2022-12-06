package inheritance;
public class Main {
public static void main(String[] args) {
	
	IndividualCustomer merve = new IndividualCustomer();
	merve.customerNumber="12345";
	
	
	CorporateCustomer hepsiBurada = new CorporateCustomer();
	
	hepsiBurada.customerNumber="78910";
	
	UnionCustomer abc= new UnionCustomer();
	abc.customerNumber="9999999999";
	
	CustomerManager customerManager = new CustomerManager();
	
	Customer[] customers = { merve, abc, hepsiBurada };		
	// çok kiþi bu yüzden dizi
	customerManager.addMultiple(customers);
	
	
	

}
}
