package com.ualbany.hw1.problem3;

class CheckingBankAccount{
	//variables of bank simulation
	double balance;
	double initialDeposit= 1000;
	double deposit = 1000;
	double withdraw= 500;

//getter, returns balance
public double getBalance(){
	return balance;
}
//setter 
public void setBalance(double a){
	this.balance=a;
}

//return values of initial deposit
public double getInitialDeposit(){
	return initialDeposit;
}
//setter 
public void setInitialDeposit(double a){
	this.balance=a;
}

//returns the value of the deposit with account balance
public double getDeposit(){
	return deposit + initialDeposit;
}
//setter 
public void setDeposit(double a){
	this.balance=a;
}
//return values of account balance with withdrawal
public double getWithdrawal(){
	return deposit+initialDeposit-withdraw;
}
//setter
public void setWithdrawal(double a){
	this.balance=a;
}
}