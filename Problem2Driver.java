package com.ualbany.hw1.problem2;

//java utilities
import java.util.Scanner;
import java.lang.Math.*;

//main method
public class Problem2Driver{
	
	public static void main(String args[]){
		
	//scanner object
	Scanner scan = new Scanner(System.in);
	//object used to call methods outside of the main method
	
	//Object
	HW1Problem2 w= new HW1Problem2();
	
	
	
	//user input for the multiple method
	//asks user to enter a value for the first integer
	System.out.println("Please enter a value for the first integer: ");
	int b=scan.nextInt();
			
	//asks user to enter a value for the second integer
	System.out.println("Please enter a value for the second integer: ");
	int c=scan.nextInt();
	
	System.out.println("Does first integer divide evenly by the second: " + w.multiple(b,c));
  
	//user input for the reminder method
	System.out.println("Please enter an integer: ");
	int a=scan.nextInt();
	
	System.out.println("The remainder for the value is: " + w.reminder(a));
	
	//user input for the distance method
	//asks the users to enter values for each distance point
	System.out.println("Please Enter a number for x1 point: ");
	double x1=scan.nextDouble();
			
	System.out.println("Please Enter a number for x2 point: ");
	double x2=scan.nextDouble();
			
	System.out.println("Please Enter a number for y1 point: ");
	double y1=scan.nextDouble();
			
	System.out.println("Please Enter a number for y2 point: ");
	double y2=scan.nextDouble();
	
	System.out.println("The distance between the points is " + w.distance(x1, y1, x2, y2));
	
	System.out.println("10 flips of a coin by random number: ");
     w.randomCoinFlips();

	}
	


}
