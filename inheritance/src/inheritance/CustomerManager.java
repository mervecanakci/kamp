package inheritance;
public class CustomerManager {
	// müþteri kaydetmke için 
	
public void add(Customer customer) {
	
	// extend ettiðimiz için public void kýsmýnýn içini yazabildik
	
	System.out.println(customer.customerNumber + " kaydedildi");
	
}
// buna bulk insert deniyor
public void addMultiple(Customer[] customers) {
	
	for(Customer customer : customers) {
		
		add(customer);
		
		
		
		
		//foreach yapýsýna bak
	}
	
	
}




















	// polimorfizmi öðren

}
