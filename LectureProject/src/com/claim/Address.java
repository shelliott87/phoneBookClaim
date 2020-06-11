package com.claim;

public class Address {
	private int houseNumber;
	private String street;
	private String city;
	private String state;
	private int zip;
	
	
	
	public Address(int houseNumber, String street, String city, String state, int zip) {
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		
		
		
	}
	
	public String toString() {
		return "Address: " + "\n" + "House number: " + houseNumber + " Street: " + street + " City: " + city + " State: " + state
				+ " Zip: " + zip;
	}
	public int getHouseNumber() {
		return this.houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return this.street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return this.zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}

	
	
	
}
