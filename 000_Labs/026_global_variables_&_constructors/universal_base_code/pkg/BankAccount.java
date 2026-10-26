/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	int accountNumber;
	double balance;
	String bankName;
	String accountOwner;
	


	// -------CONSTRUCTORS-------
	public BankAccount(){
		accountNumber=0;
		balance=0.0;
		bankName="Unknown";
		accountOwner="Unknown";
	}
	public BankAccount(String eins, String zwei){
		accountNumber=0;
		balance=0.0;
		bankName=eins;
		accountOwner=zwei;
	}
	public BankAccount(int number,double decimal,String eins, String zwei){
		accountNumber=number;
		balance=decimal;
		bankName=eins;
		accountOwner=zwei;
	}

	// -------METHODS-------
	public void setBalance(double decimal){
		balance=decimal;
		return;
	}
	public double getBalance(){
		return balance;
	}
	public void printDetails(){
		System.out.println("------------------------");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: $"+balance);
		System.out.println("Bank Name: "+bankName);
		System.out.println("Account Owner: "+accountOwner);
		System.out.println("------------------------");
		System.out.println();
		return;
	}

}