package inheritance;
public class CustomerManager {
	// m��teri kaydetmke i�in 
	
public void add(Customer customer) {
	
	// extend etti�imiz i�in public void k�sm�n�n i�ini yazabildik
	
	System.out.println(customer.customerNumber + " kaydedildi");
	
}
// buna bulk insert deniyor
public void addMultiple(Customer[] customers) {
	
	for(Customer customer : customers) {
		
		add(customer);
		
		
		
		
		//foreach yap�s�na bak
	}
	
	
}




















	// polimorfizmi ��ren

}
