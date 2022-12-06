    package interfaces;
           public class CustomerManager {
//operasyon sýnýfý
	
	       private Logger[] loggers;
// fields den yaptým altaki geldi construcker
           public CustomerManager(Logger[] loggers) {
		
		                                     this.loggers = loggers;
}

           public void add(Customer customer) {
//iki þekil baðlýlýk var
//loosly coupled / gevþek baðlý - böyle olmasý daha ii
//tightly coupled / katý baðlý -  þu an bura böyle
// öyle bak bunlara bilgi
	                     System.out.println("müþteri eklendi:  "+ customer.getFirstName() +"  "+ customer.getLastName());
	
	
	             Utils.runLoggers(loggers, customer.getFirstName());
//statik yapýsý 
	
	
}
 

	       public void delete(Customer customer) {
	
		                System.out.println("müþteri silindi "+ customer.getFirstName());
		
		
		         Utils.runLoggers(loggers, customer.getLastName());
		
//statik yapýsý 		
}
}
//foreach yapýsýna bak

