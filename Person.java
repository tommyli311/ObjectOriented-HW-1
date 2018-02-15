package com.ualbany.hw1.problem3;

class Person{
	/*string declaration for attributes of the Person class which is the bank customer
	 *  which include the 2 lines for address, other attributes of the address include
	city, state, and zip code, along with the customer's first and last name.
	*/
	String firstName="John";
    String lastName="Smith";
    String line1 = "99 Western Ave";
 	String line2 = "";
 	String city = "Albany";
 	String state = "NY";
 	String zip = "12222";
 	String address = line1+" "+ line2+" "+ city+" "+ state+" "+zip;
 	String fullName= firstName+" "+ lastName;
 		
 	
//this method returns the full name of the customer, is called in the main method
public String PersonName(){
	return fullName;
}
//this method returns the full address of the customer, is called in the main method
public String PersonAddress(){
	return address;
}
}