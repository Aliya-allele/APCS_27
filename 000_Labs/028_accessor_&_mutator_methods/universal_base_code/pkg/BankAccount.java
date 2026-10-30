/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String accountOwner;
	double accountBalance;
	int accountNumber;
	boolean accountStatus;

	// -------CONSTRUCTORS-------
	public BankAccount(){
		accountOwner="unknown";
		accountBalance=0.0;
		accountNumber=(int)(Math.random()*999+1);
		accountStatus=true;
	}
	public BankAccount(String name){
		accountOwner=name;
		accountBalance=0.0;
		accountNumber=(int)(Math.random()*999+1);
		accountStatus=true;
	}
	public BankAccount(String name,double money){
		accountOwner=name;
		accountBalance=money;
		accountNumber=(int)(Math.random()*999+1);
		accountStatus=true;

	}
	

	// -------METHODS-------
	public void setOwner(String name){
		accountOwner=name;
		return;
	}
	public String getOwner(){
		return accountOwner;
	}
	public void deposit(double money){
		if(accountStatus){
		System.out.println("Deposited: $"+money);
		accountBalance=money;
		}else{
			System.out.println();
		}
		return;
	}
	public double getBalance(){
		return accountBalance;
	}
	public double checkBalance(){
		System.out.println("Current account balance: "+accountBalance);
		return accountBalance;
	}
	public void withdraw(double lessmoney){
		if(accountBalance>=lessmoney){
			System.out.println("Withdrew: $"+lessmoney);
		}else{
			System.out.println("Insufficient funds!");
		}
		accountBalance=accountBalance-lessmoney;
		return;
	}
	public void closeAccount(){
		accountStatus=false;
		System.out.println("Account closed for "+accountOwner);
		System.out.println("Account is closed. Cannot deposit.");
		return;
	}
	public void displayAccountInfo(){
		System.out.println("--- Account Info ---");
		 System.out.println("Owner: "+accountOwner);
		 System.out.println("Account Number: "+accountNumber);
		 System.out.println("Balance: $"+accountBalance);
		 if(accountStatus){
			System.out.println("Your account is active.");
		 }else{
			System.out.println("This account is inactive.");
		 }
	}

}