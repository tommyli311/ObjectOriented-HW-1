package com.ualbany.hw1.problem1;

//employee class
public class Employee 
{
	  private String firstName;// variable for first name of employee
	  private String lastName;//variable for last name of employee
	  public double salary;// variable for employee's salary

//constructor for the instance variables in the employee class
public Employee(){
salary=1500;
firstName="Joe";
lastName="";
}

//getter for salary variable
public double getSalary(){
	return salary;
}
//setter for salary variable
public void setSalary(int a){
	this.salary=a;
}
//getter for employee's first name
public String getFirstName(){
	return firstName;
}
//setter for the employee's first name
public void setFirstName(String a){
	this.firstName= a;
}
//getter for employee's last name
public String getLastName(){
	return lastName;
}
//setter for the employee's last name
public void setLastName(String a){
	this.lastName= a;
}
/*driver class that demonstrates the capabilities
of the employees*/
public static class EmployeeTest{
	public static void main(String[] args){
	//two distinct employee objects
	Employee x = new Employee();
	Employee y = new Employee();
	
	// prints the salary of each employee and the their updated salary with the raise
	System.out.println("The salary of employee x is "+ x.getSalary() + " dollars.");
	System.out.println("The salary of employee y is "+ x.getSalary() + " dollars.");
	System.out.println("The salary of employee x with the raise is "+ y.getSalary() * 1.1 + " dollars.");
	System.out.println("The salary of employee y with the raise is "+ y.getSalary() * 1.1 + " dollars.");
}
}}
