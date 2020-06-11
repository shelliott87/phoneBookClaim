package com.claim;

import java.util.Arrays;
import java.util.Scanner;

public class Directory {

		Scanner input = new Scanner(System.in);		

	
	
	

//	//Person p1 = new Person();
//	
//	//Person name1 = new Person();
//
//	Person person1 = new Person("John", " ", "Doe", 6366435698L, address1);
//	Person person2 = new Person("John", "E", "Doe", 8475390126L, address2);
//	Person person3 = new Person("John", "Michael", "West",5628592375L,address3);
//	
//	
//		
//		
	Person people[] = new Person[0]; 
//	people[0] = new Person("John", " ", "Doe", 6366435698L, address1);
//	people[1] = new Person("John", "E", "Doe",  8475390126L,address2);	
//	people[2] = new Person("John", "Michael West", "Doe", 5628592375L,address3);
	
	

		 //add new person
	public void	addPerson(Person people1) {
			Person [] temp = new Person [people.length + 1];
			for(int i = 0; i<people.length; i ++) {
				temp[i] = people[i];
			}
			temp[temp.length - 1] = people1;
			people = temp;
		
		
	}
//	delete person
	public void removePerson(Person removed) {
		//creates a temporary array that is one smaller than the current array
		Person [] temp = new Person[people.length - 1];
		//sets the current array to equal the temporary array
		int x = 0;
		// loops through and adds everything except the person to be removed to the temp array
		for(int i = 0; i < people.length; i++) {
			if(people[i] != removed) {
				temp[x] = people[i];
				x++;
			}
		}
		people = temp;
		//sets the current array to equal the temporary array
	}
	public Person[] getDirectory() {
		return people;
	}
	public void printDirectory() {
		for (int i = 0; i < people.length; i ++) {
			people[i].getPerson();
		}
	}
	
	@Override
	public String toString() {
		return "Directory input:" + input + ", people" + Arrays.toString(people);
	}
	//get by phone number
	public Person getByPhone(long phoneNumber) {
		int reference = 0;
		for(int i = 0; i < people.length; i++) {
			if(people[i].getPhoneNumber() == phoneNumber) {
				reference = i;
				break;
			}
		}
		return people[reference];
	}
	public Person[] getByFirstName(String firstName) {
		int counter = 0;
		for(int i = 0; i < people.length; i++) {
			if(people[i].getFirstName().equals(firstName)) {
				counter ++;
				
			}
		}
		
	
	Person [] newArray = new Person[counter];
	int x=0;
	for(int j = 0; j < people.length; j++) {
		if(people[j].getFirstName().equals(firstName)) {
			newArray[x] = people[j];
			x++;
		}
	}
	return newArray;
	}
	public Person[] getByLastName(String lastName) {
		int counter = 0;
		for(int i = 0; i < people.length; i++) {
			if(people[i].getLastName() == lastName) {
				counter++;
			}
		}
		Person [] newArray = new Person[counter];
		int x =0;
		for(int j = 0; j < people.length; j++) {
			if(people[j].getLastName().equals(lastName)) {
				newArray[x] = people[j];
				x++;
			}
		}
		return newArray;
	}
	public void printPersonArray(Person[] searched) {
		for(int i = 0; i < searched.length; i++) {
			searched[i].getPerson();
		}
	}
	


	




}