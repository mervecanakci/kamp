    package interfaces;
           public class CustomerManager {
//operasyon s�n�f�
	
	       private Logger[] loggers;
// fields den yapt�m altaki geldi construcker
           public CustomerManager(Logger[] loggers) {
		
		                                     this.loggers = loggers;
}

           public void add(Customer customer) {
//iki �ekil ba�l�l�k var
//loosly coupled / gev�ek ba�l� - b�yle olmas� daha ii
//tightly coupled / kat� ba�l� -  �u an bura b�yle
// �yle bak bunlara bilgi
	                     System.out.println("m��teri eklendi:  "+ customer.getFirstName() +"  "+ customer.getLastName());
	
	
	             Utils.runLoggers(loggers, customer.getFirstName());
//statik yap�s� 
	
	
}
 

	       public void delete(Customer customer) {
	
		                System.out.println("m��teri silindi "+ customer.getFirstName());
		
		
		         Utils.runLoggers(loggers, customer.getLastName());
		
//statik yap�s� 		
}
}
//foreach yap�s�na bak

