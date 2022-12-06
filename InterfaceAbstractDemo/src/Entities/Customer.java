package Entities;

import Abstract.IEntities;

public class Customer implements IEntities {

	private int Id;
	private String FirstName;
	private String LastName;
	private String DateOfBirtday ;
	public String NationalityId; /////////////////
	
	public Customer()   {
	
	}

	public Customer(int id, String firstName, String lastName, String dateOfBirtday, String nationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirtday = dateOfBirtday;
		NationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDateOfBirtday() {
		return DateOfBirtday;
	}

	public void setDateOfBirtday(String dateOfBirtday) {
		DateOfBirtday = dateOfBirtday;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
