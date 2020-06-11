package com.claim;

import java.util.Scanner;

public class PhoneBookApplication {

	public static void main(String[] args) {
		Directory directory = new Directory();
		
		Address address1 = new Address(114, "Market St", "St Louis", "MO", 63403);
		Address address2 = new Address(324,"Main St","St Charles","MO", 63303);
		Address address3 = new Address(574, "Pole ave", "St. Peters", "MO", 63333);
		
		Person person1 = new Person("John", " ", "Doe", 6366435698L, address1);
		Person person2 = new Person("John", "E", "Doe", 8475390126L, address2);
		Person person3 = new Person("John", "Michael", "West",5628592375L,address3);
		
		
		directory.addPerson(person1);
		directory.addPerson(person2);
		directory.addPerson(person3);
		
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
//		System.out.print("Please Make a Selection Below: " + "\n" + 
//				"1. Add New Record"+ "\n" + "\n" + 
//				"2. Delete Record " + "\n" + "\n" +
//				"3. Find Record by Telephone Number "+ "\n" + "\n" +
//				"4. Find Record by First Name  "+"\n" + "\n" + 
//				"5. Find Record by Last Name " + "\n" + "\n" +
//				"6. Update a record "+ "\n" + "\n" +
//				"7. Show all records " + "\n" + "\n" +
//				"8. Exit " + "\n");
		int number = 0;
		while(number != 8) {
			
		
		System.out.print("Please Make a Selection Below: " + "\n" + 
				"1. Add New Record"+ "\n" + "\n" + 
				"2. Delete Record " + "\n" + "\n" +
				"3. Find Record by Telephone Number "+ "\n" + "\n" +
				"4. Find Record by First Name  "+"\n" + "\n" + 
				"5. Find Record by Last Name " + "\n" + "\n" +
				"6. Update a record "+ "\n" + "\n" +
				"7. Show all records " + "\n" + "\n" +
				"8. Exit " + "\n");
		
		
		number = input.nextInt();
		switch(number) {
		case 1: //Add new record
			System.out.print("Please enter a record as: John E Doe, 324 Main St, St Charles, MO,63303, 8475390126" + "\n");
			String newRecord = input2.nextLine();
			System.out.println(newRecord);
			String[] infoArray = newRecord.split(",");
			String name = infoArray[0].trim();
	//		String houseNumber = infoArray[1];
			String street = infoArray[1].trim();
			String city = infoArray[2].trim();
			String state = infoArray[3].trim();
			String zip = infoArray[4].trim();
			
			String phoneNum = infoArray[5].trim();
			
			
			String[] streetSplit = street.trim().split(" ");
			
			String houseNum = streetSplit[0];
			String streetName = "";
			for(int i = 1; i<streetSplit.length; i++) {
				streetName += streetSplit[i];
				if(i !=streetSplit.length -1) {
					streetName += " ";
				}
				
			}

			
			
			String[] nameSplit = name.split(" ");
			String fName = nameSplit[0];
			String lName = nameSplit[nameSplit.length - 1];
			String mName = "";
			for(int i = 1; i<nameSplit.length -1; i++) {
				mName += nameSplit[i];
				if(i!=nameSplit.length-2) {
					mName += " ";
				}	
			}
			
			
			
			
			Address newAddress = new Address(Integer.parseInt(houseNum), streetName, city, state,Integer.parseInt(zip));
			Person newPerson = new Person(fName, mName, lName, Long.parseLong(phoneNum), newAddress);
			directory.addPerson(newPerson);
			System.out.println(newPerson);
			
			break;
		case 2: //delete person
			System.out.println("Please, enter the phone number of the record you would like to delete" + "\n");
			long deleteRecord = input.nextLong();
			directory.removePerson(directory.getByPhone(deleteRecord));
			
			
			break;
		case 3: // getByPhone
			System.out.println("Enter telephone number as: 6366435698" + "\n");
			long newPhoneNum = input.nextLong();
			System.out.println(directory.getByPhone(newPhoneNum));
			
			
			break;
		case 4: 
			System.out.println("Enter first name as: John" + "\n");
			String userFirstName = input.next();
			directory.printPersonArray(directory.getByFirstName(userFirstName));
	
			break;
		case 5:
			System.out.println("Enter last name as: Doe" + "\n");
			String userLastName = input.next();
			directory.printPersonArray(directory.getByFirstName(userLastName));
			
			break;
		case 6:
			System.out.println("Enter the phone number of the record you want to update");
			long case6 = input.nextLong();
			directory.getByPhone(case6).getPerson();
			
			int updateUserInput = 0;
			while(updateUserInput !=9) {
				System.out.println("Enter a number to make a selection below"+ "\n" + "\n" +
						"1. Update a record's first name"+ "\n" + "\n" +
						"2. Update a record's last name" + "\n" + "\n" +
						"3. Update a record's phone number" + "\n" + "\n" +
						"4. Update a record's house number"+ "\n" + "\n" +
						"5. Update a record's street" + "\n" + "\n" +
						"6. Update a record's city" + "\n" + "\n" +
						"7. Update a record's state"+ "\n" + "\n" +
						"8. Update a record's zip code" + "\n" + "\n"+
						"9. Exit the Update Record Option");
				updateUserInput = input.nextInt();
			
				switch(updateUserInput) {
				
				case 1:
					System.out.println("Enter the new first name " + "\n");
					String newFirst = input.next();
					directory.getByPhone(case6).setFirstName(newFirst);
					
					break;
				case 2:
					System.out.println("Enter the new last name" + "\n");
					String newLast = input.next();
					directory.getByPhone(case6).setLastName(newLast);
					break;
				case 3:
					System.out.println("Enter the new phone number" + "\n");
					Long newPhoneNumber = input.nextLong();
					directory.getByPhone(case6).setPhoneNumber(newPhoneNumber);
					break;
				case 4:
					System.out.println("Enter the new house number" + "\n");
					int newHouseNumber = input.nextInt();
					directory.getByPhone(case6).getAddress().setHouseNumber(newHouseNumber);
					break;
				case 5:
					System.out.println("Enter the new street name" + "\n");
					String newStreet = input.nextLine();
					directory.getByPhone(case6).getAddress().setStreet(newStreet);
					break;
				case 6:
					System.out.println("Enter the new city name" + "\n");
					String newCity = input.next();
					directory.getByPhone(case6).getAddress().setCity(newCity);
					
					break;
				case 7:
					System.out.println("Enter the new state name" + "\n");
					String newState = input.next();
					directory.getByPhone(case6).getAddress().setState(newState);
					break;
				case 8: 
					System.out.println("Enter the new zip code" + "\n");
					int newZip = input.nextInt();
					directory.getByPhone(case6).getAddress().setZip(newZip);
					break;
				case 9:
					System.out.println("You have exited the Update Record Option");
					break;
					}
			}
		case 7:
			System.out.println("All Records" + "\n");
			directory.printDirectory();
			break;
				
		case 8: 
			System.out.println("You have exited the phone book.");
			break;
		}
	}
	}
}
	
//Add new entries 
//Search for an existing entry
//Search by first name *
//Search by last name *
//Search by full name *note name is not unique therefore the result should be an array of Person Objects.
//Search by telephone number
//Search by city or state
//Delete a record for a given telephone number
//Update a record for a given telephone number

//John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
//John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
//John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375

