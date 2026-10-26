/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String accountOwner;
	int accountNumber;
	double accountBalance;
	boolean status;


	// -------CONSTRUCTORS-------
	public BankAccount(){
		accountOwner="unknown";
		accountNumber=(int)(Math.random()*999+1);
		accountBalance=0.0;
		status=true;
	}
	public BankAccount(String eins){
		accountOwner=eins;
		accountNumber=(int)(Math.random()*999+1);
		accountBalance=0.0;
		status=true;
	}
	public BankAccount(String eins,double drei){
		accountOwner=eins;
		accountNumber=(int)(Math.random()*999+1);
		accountBalance=drei;
		status=true;
	}
	

	// -------METHODS-------
	public void setBalance(double drei){
		accountBalance=drei;
		return;
	}
	public double getBalance(){
		return accountBalance;
	}
	public void printDetails(){
		System.out.println("--- Account Info ---");
		 System.out.println("Owner: "+accountOwner);
		 System.out.println("Account Number: "+accountNumber);
		 System.out.println("Balance: $"+accountBalance);
		 if(status){
			System.out.println("Your account is active.");
		 }else{
			System.out.println("This account is inactive.");
		 }
	}

}