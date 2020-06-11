package com.claim;

public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	private Long phoneNumber;
	private Address address;
	

	public Person(String firstName,String middleName, String lastName,Long phoneNumber, Address address) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;

}
	public Person() {
	
}

	
		
	
	
	public String toString() {
		return "Record: " + "\n" + "First name: " + firstName + " Middle name: " + middleName + " Last name: " + lastName
				+ " Phone number: " + phoneNumber + "\n" + address;
	}
	public String getFirstName() {
		return this.firstName;
	}

	public String getMiddleName() {
		return this.middleName;
	}
	public void getPerson() {
		if(middleName.length() != 0) {
			System.out.println(firstName + " " + middleName + " " + lastName + " " + phoneNumber + " " +address);
		}
		else {
			System.out.println(firstName + " " + middleName + " " + lastName + " " + phoneNumber + " " +address);
		}
		
	}
	public String getLastName() {
		return this.lastName;
	}
	public long getPhoneNumber() {
		return this.phoneNumber;
	}

	public Address getAddress() {
		return this.address;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
}
//	String[] person = info.split(",");
//	String name = person[0];
//	String street = person[1];
//	String city = person[2];
//	String state = person[3];
//	String zip = person[4];
//	String phoneNumber = person[5];
//	String[] splitName = name.split(" ");
//	String firstName = splitName[0];
//	String lastName = splitName[splitName.length - 1];
//	Address address = new Address(street, city, state, Integer.parseInt(zip));
//	
//	System.out.println("First Name: " + person.getFirstName());
	
	


