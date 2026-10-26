/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int accountNumber;
		double accountBalance;
		String accountOwner;
		boolean status=false;
		BankAccount uno = new BankAccount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the ATM!");
		System.out.println("We're going to create a bank account! What info do we know?");
		System.out.println("1 - Nothing");
		System.out.println("2 - Owner");
		System.out.println("3 - Owner and Initial Deposit");
		int answer=sc.nextInt();
		sc.nextLine();
		if(answer==1){
			accountNumber=(int)(Math.random()*999+1);
		 uno.printDetails();
		}else if(answer==2){
		 accountNumber=(int)(Math.random()*999+1);
		 System.out.println("What is the name of the owner of this bank account?");
		 accountOwner=sc.nextLine();
		 uno= new BankAccount(accountOwner);
		 uno.printDetails();
		}else if(answer==3){
			accountNumber=(int)(Math.random()*999+1);
		 System.out.println("What is the name of the owner of this bank account?");
		 accountOwner=sc.nextLine();
		 System.out.println("How much are you initally depositing into this account?");
		 accountBalance=sc.nextDouble();
		 sc.nextLine();
		 uno=new BankAccount(accountOwner,accountBalance);
		 System.out.println();
		 uno.printDetails();
		}
		System.out.println();
		System.out.println("Do you want to check your balance? (yes/no)");
		String jpxfrd=sc.nextLine();
		if(jpxfrd.equals("yes")){
			System.out.println("Current Account Balance: $"+uno.getBalance());
			System.out.println();
		}else{
			System.out.println("Okay! no balance checked.");
			System.out.println();
		}
		System.out.println("Thank you for coming to the ATM!");


		
	}
}
