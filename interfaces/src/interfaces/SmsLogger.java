package interfaces;
public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		
		System.out.println("sms loglandý/ gönderildi:  "+ message);
	}

	// implements logger ý smslogger a uyarla demek /gerekli olan kodlarý yaz
	//public class da hata oluyor add olaný seç
	
	
	
	
	
	
}
