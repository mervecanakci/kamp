package interfaces;
public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		
		System.out.println("sms logland�/ g�nderildi:  "+ message);
	}

	// implements logger � smslogger a uyarla demek /gerekli olan kodlar� yaz
	//public class da hata oluyor add olan� se�
	
	
	
	
	
	
}
