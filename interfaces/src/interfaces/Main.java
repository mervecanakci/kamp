package interfaces;


public class Main {	
public static void main(String[] args) {
Logger [] loggers= {new SmsLogger(), new EmailLogger(), new DatabaseLogger()}; 
//bir üstten çoklu yaptýkss bir de customer managerden

	CustomerManager customerManager=new CustomerManager(loggers);

	
	Customer merv=new Customer(1,"merve", "çanakcý");
	customerManager.add(merv);
	
	
}
}

