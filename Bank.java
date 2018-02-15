package com.ualbany.hw1.problem3;

public class Bank{
	public static void main(String args[]){
		CheckingBankAccount c= new CheckingBankAccount();
		Address a= new Address();
		Person p= new Person();
		System.out.println("Hi "+ getFirstName()+ ", Welcome to "+ getBankName());
		System.out.println("Your account balance is "+ c.getBalance()+" dollars.");
		System.out.println("Your initial deposit is "+ c.getInitialDeposit()+ " dollars, your account balance is now "+ c.initialDeposit + " dollars.");
		
	    System.out.println(p.PersonName()+ ": "+ p.PersonAddress());
	    System.out.println("You deposited "+ c.deposit+ " dollars, your new account balance is "+c.getDeposit()+ " dollars");
	    System.out.println((p.PersonName()+ ": "+ p.PersonAddress()));
        System.out.println("You withdrew " +c.withdraw+ " dollars, your new account balance is "+ c.getWithdrawal()+ " dollars");
        System.out.println((p.PersonName()+ ": "+ p.PersonAddress()));
	}
	
	//variable for the name of bank, and customer's name
	public static String bankName = "Chase Bank";
	public static String firstName="John";
    public static String lastName="Smith";
	
    //getter for bankName
 	public static String getBankName(){
		return bankName;
	}
	//setter for the bankName
	public void setBankName(String a){
		this.bankName= a;
	}
	//getter for employee's first name
	public static String getFirstName(){
		return firstName;
	}
	//setter for the employee's last name
	public void setFirstName(String a){
		this.firstName= a;
	}
	//getter for employee's last name
	public static String getLastName(){
		return lastName;
	}
	//setter for the employee's last name
	public void setLastName(String a){
		this.lastName= a;
	}
	

		
}




