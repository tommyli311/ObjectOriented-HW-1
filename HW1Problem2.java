package com.ualbany.hw1.problem2;

public class HW1Problem2 {
	//this method checks if two integer divide evenly,if they on return true, else print false
	public boolean multiple(int b, int c)
	{   
		if(b%c==0){
			return true;
		
		}
		else{
			return false;
		}
	}
	/* the method reminder takes an integer as its argument and returns the remainder
	 of that value divided by seven
	*/
	public int reminder(int a)
	{
		return a%7;
		
	}
	/* the distance method takes the distance between two points (x1, y1) and (x2,y2)
	 */
	public double distance(double x1, double x2, double y1, double y2)
	{
		//variable for the distance
		double distanceBetweenPoints = Math.sqrt((x2-x1)*(x2-x1) +(y2-y1)*(y2-y1));;
		return distanceBetweenPoints;
	
	}
	
	//this method uses random numbers to simulate flips of a coin 10 times.
	public void randomCoinFlips(){
	       for(int i=0; i<10; i++){
	    	  
	           System.out.println((int)(Math.random() * 10));
}
	}
}
