package interfaces;
public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	public Customer() {
		// parametresiz consturactor
		
	}
	//source > fields 
	public Customer(int id, String firstName, String lastName) {
	//inherit eden bir sýnýf varsa parametresiz de çalýþabilir diye süper var ama burada gerek yok
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
